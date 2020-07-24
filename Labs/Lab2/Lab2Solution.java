import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab2Solution {

	public static void main(String[] args) throws FileNotFoundException {

		String filename = "prices.txt";
		File file = new File(filename);
		
		// if the file is not found, issue an error message and quit
		if (!file.exists()) {
			System.out.printf("%s can not be found.", filename);
			System.exit(1); // exit the program
		}

		
		Scanner input = new Scanner(file);
		
		String[] productNames  = new String[1000];
		int[] productPrices = new int[1000];
		
		int counter = 0;
		while (input.hasNext()) {
			String productName = input.next();
			int price = input.nextInt();
			productNames[counter] = productName;
			productPrices[counter] = price;
			System.out.printf("%2d. Product: %12s, Price: %4d\n", counter+1, productName, price);
			counter++;
		}	
		input.close();
		
		String[] products = new String[counter];
		int[] prices = new int[counter];
		
		System.arraycopy(productNames, 0, products, 0, counter);
		System.arraycopy(productPrices, 0, prices, 0, counter);
		
		plotProducts(products, prices);
		
	}
	

	private static void plotProducts(String[] products, int[] prices) {
		int canvas_width = 1000; // specify canvas width 
		int canvas_height = 1000; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); // x axis scale is in the range [0,1]
		StdDraw.setYscale(0, 1); // y axis scale is in the range [0,1]
		
		double half_width = 0.03;
		double x_start = 0.1;
		double x_step = 3 * half_width;
		double y_scale = 0.001;
		double y_pad = 0.01;
				
		double x_position = x_start;
		for (int i = 0; i < prices.length; i++) {
			double center_x = x_position;
			double half_height = y_scale * (prices[i]/2);
			double center_y = y_pad + half_height;
			StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
			StdDraw.filledRectangle(center_x, center_y, half_width, half_height);
			
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setFont( new Font("Serif", Font.PLAIN, 16) );
			StdDraw.textLeft(center_x - half_width, center_y + half_height + 0.007, products[i]);
			x_position += x_step;
		}
	}
}





