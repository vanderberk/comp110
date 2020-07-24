/**
 * Author: Oðuz Baykut
 * Lab 1 Solution for Object Oriented Java Course
 */
import java.util.Random;

public class Lab1Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setCanvasSize(512, 512);
		StdDraw.setScale(0,1);
		Random rand = new Random();
		double[][]circles = new double[20][3];//Array we hold the circles in
		for(int i=0;i<20;i++) {
			double r= rand.nextDouble()/4+0.05;//r value of the circle, between 0.05 and 0.3
			double x = rand.nextDouble()*(1-2*r)+r;//x value of the circle, between r and 1-r so that it is inside the canvas
			double y = rand.nextDouble()*(1-2*r)+r;;//y value of the circle, between r and 1-r so that it is inside the canvas
			boolean noOverlap = true;//flag we use to check for ovelapping circles
			for(int j=0;j<i;j++) {
				double distance = Math.sqrt(Math.pow(x-circles[j][0],2)+Math.pow(y-circles[j][1],2));//distance between the new circle and previously created circles
				if(distance<circles[j][2]+r) {//if the distance is shorter than both radiuses added together, they overlap
					noOverlap=false;
					break;
				}
			}
			if(noOverlap) {//if the new circle doesn't overlap with anything, it is drawn and added to the array
				circles[i][0]=x;
				circles[i][1]=y;
				circles[i][2]=r;
				StdDraw.circle(x,y,r);
			}else {//if it overlaps, we take the loop 1 step back
				i--;
			}

		}

		//Bonus Part
		double minR = 1;
		double maxR = 0;
		int minIndex = 0;//we use indexes to remember which circle was the smallest and which circle wazs the largest
		int maxIndex = 0;
		for(int i=0;i<20;i++) {
			if(circles[i][2]<minR) {
				minR= circles[i][2];
				minIndex=i;
			}

			if(circles[i][2]>maxR) {
				maxR= circles[i][2];
				maxIndex=i;
			}
		}

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(circles[minIndex][0],circles[minIndex][1],circles[minIndex][2]);
		StdDraw.filledCircle(circles[maxIndex][0],circles[maxIndex][1],circles[maxIndex][2]);

	}

}