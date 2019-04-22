import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class Lab08 {
	public static void main(String[] args) {

		int width = 600;
		int height = 600;

		Random r = new Random();
		
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.show();

		ArrayList<Shape> shapes = new ArrayList<Shape>();

		generateCircles(width, height, shapes, 5);
		generateRectangles(width, height, shapes, 5);
		sortShapes(shapes);
		plotShapes(shapes);
		
		int selectedShape = -1;

		while (true)  { 
			if (StdDraw.isMousePressed())  {
				double x = StdDraw.mouseX();
				double y = StdDraw.mouseY();
				System.out.printf("Mouse Coordinates: x=%.2f, y=%.2f\n", x, y);
				StdDraw.setPenColor(StdDraw.DARK_GRAY); 
				StdDraw.filledCircle(x, y, 1);
				StdDraw.pause(200);
				StdDraw.show();
				
				// check if the point is inside of the shapes
				System.out.println("\nCheck: Is Inside?");
				selectedShape = -1;
				for (int i = 0; i < shapes.size(); i++) {
					Shape s = shapes.get(i);
					if (s.isInside(x, y)) {
						System.out.println("Yes");
						if (s instanceof Circle) {
							s.setColor(new Color(r.nextFloat(),r.nextFloat(),r.nextFloat()));
							((Circle)s).draw();
							selectedShape = i;
						}
						else if (s instanceof Rectangle) {
							s.setColor(new Color(r.nextFloat(),r.nextFloat(),r.nextFloat()));
							((Rectangle)s).draw();
							selectedShape = i;
							
						}
						StdDraw.show();
					}
				}
				StdDraw.setPenColor(StdDraw.DARK_GRAY); 
				StdDraw.filledCircle(x, y, 1);
				StdDraw.show();
			}

			if (StdDraw.isKeyPressed(KeyEvent.VK_B)) {
				System.out.println("Mode: Make the shape bigger");
				StdDraw.pause(200);
				if (selectedShape != -1) 
					modifyShapes(shapes, selectedShape, 1.05);
				else 
					System.out.printf("Please select a shape first\n", selectedShape);
				StdDraw.clear();
				plotShapes(shapes);
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
				System.out.println("Mode: Make the shape smaller");
				StdDraw.pause(200);
				if (selectedShape != -1) 
					modifyShapes(shapes, selectedShape, 0.95);
				else 
					System.out.printf("Please select a shape first\n", selectedShape);
				StdDraw.clear();
				plotShapes(shapes);
			}
		} 
	}

	private static void modifyShapes(ArrayList<Shape> shapes, int selectedShape, double scale) {
		Shape s = shapes.get(selectedShape);
		if (s instanceof Circle) {
			Circle temp = (Circle)s;
			temp.r = temp.r * scale;
			shapes.set(selectedShape, temp);
		} else if (s instanceof Rectangle) {
			Rectangle temp = (Rectangle)s;
			temp.w = temp.w * scale;
			temp.h = temp.h * scale;
			shapes.set(selectedShape, temp);
		}
	}

	private static void sortShapes(ArrayList<Shape> shapes) {
		
		for (int i = 0; i < shapes.size()-1; i++) {
			
			// find maximum in the rest of the array
			int maxInd = i+1;
			for (int j = i+1; j < shapes.size(); j++) 
				if (shapes.get(j).area > shapes.get(maxInd).area) 
					maxInd = j;
			
			// if maximum element is greater than the current element, swap
			if (shapes.get(i).area < shapes.get(maxInd).area) {
				Shape temp = shapes.get(i);
				shapes.set(i, shapes.get(maxInd));
				shapes.set(maxInd,temp);
			}
		}
	}

	private static void generateRectangles(int width, int height, ArrayList<Shape> shapes, int numRect) {
		Random r = new Random();
		int counter = 0;
		while (counter < numRect) {
			double x = r.nextDouble()*width;
			double y = r.nextDouble()*height;
			double wr = 30 + r.nextDouble()*60;
			double hr = 30 + r.nextDouble()*60;

			if ((x+wr<width) && (y+hr<height)) {
				shapes.add(new Rectangle(x,y,wr,hr, StdDraw.LIGHT_GRAY));	
				counter++;
			}
		}
	}

	private static void generateCircles(int width, int height, ArrayList<Shape> shapes, int numCircles) {
		Random r = new Random();
		int counter = 0;
		while (counter < numCircles) {
			double x = r.nextDouble()*width;
			double y = r.nextDouble()*height;
			double rad = 20 + r.nextDouble()*40;
			if ((x-rad>0) && (x+rad<width) && (y-rad>0) && (y+rad<height)) {
				shapes.add(new Circle(x,y,rad,StdDraw.LIGHT_GRAY));	
				counter++;
			}
		}
	}

	private static void plotShapes(ArrayList<Shape> shapes) {
		// plot shapes
		for (Shape s : shapes) {
			if (s instanceof Circle) {
				Circle c = (Circle) s;
				c.draw();
			} else if (s instanceof Rectangle) {
				Rectangle rect = (Rectangle) s;
				rect.draw();
			}
		}
		StdDraw.show();
	}
}
