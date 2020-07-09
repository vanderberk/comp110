
public class Lecture2_MultidimensionalArrays {
	
	public static void main(String[] args) {
		
		// items sold, item price
		// 4, 300 -> sennheiser headphone
		// 2, 150 -> vinly
		// 6, 100 -> ...
		// 12, 50 -> ...
		
		int[][] products = new int[10][2];
		
		products[0][0] = 4; // sennheiser
		products[0][1] = 300;
		
		products[1][0] = 2; // vinyl
		products[1][1] = 150;
		
		products[2][0] = 6; // ...
		products[2][1] = 100;
		
		products[3][0] = 12; // ...
		products[3][1] = 50;
		
		for (int i = 0; i < products.length; i++) {

			if (products[i][0] > 0) {
				System.out.print("# items: " + products[i][0] + ", price: " + products[i][1]);
				System.out.println(" > total: " + products[i][0] * products[i][1] );
			}

		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
