import java.util.Random;

public class Lab1Code {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(600,600);
		StdDraw.setScale(0, 1);
		
		double [][] circles = new double[20][3]; //0 x, 1 y ,2 r
		Random rand = new Random();
		for(int i=0;i<circles.length;i++) {
			double r = rand.nextDouble()*0.25+0.05; //0.05<r<0.3
			double x = rand.nextDouble()*(1-2*r)+r;
			double y = rand.nextDouble()*(1-2*r)+r;
			
			
			circles[i][0] = x;
			circles[i][1] = y;
			circles[i][2] = r;
		}
		
		for(int i=0;i<circles.length;i++) {
			StdDraw.circle(circles[i][0],circles[i][1],circles[i][2]);
		}
		
		double maxDistance = 0;
		int index1 = 0;
		int index2 = 0;
		
		for(int i=0;i<circles.length;i++) {
			for(int j=i+1;j<circles.length;j++) {
				double xler = Math.pow(circles[j][0]-circles[i][0], 2);
				double yler = Math.pow(circles[j][1]-circles[i][1], 2);
				double distance = Math.sqrt(xler+yler);
				if(distance>maxDistance) {
					maxDistance=distance;
					index1=i;
					index2=j;
				}
			}
		}
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(circles[index1][0], circles[index1][1], circles[index1][2]);
		StdDraw.filledCircle(circles[index2][0], circles[index2][1], circles[index2][2]);
		
		
	}
}