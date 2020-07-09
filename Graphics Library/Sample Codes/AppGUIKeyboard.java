/**
 * 
 * Simple animation of a moving rectangle. User can move the rectangle by keyboard buttons
 * 
 * By pressing the keyboard buttons (up, down, left and right), user can move the rectangle
 * By pressing the "c" key, change the rectangle color to black
 * By pressing the "b" button, make the rectangle bigger
 * 
 * Berk Gokberk
 * 16.04.2020
 */

import java.awt.event.KeyEvent;

public class AppGUIKeyboard {

	public static void main(String[] args) {

		// canvas parameters
		int width = 500;
		int height = 500;

		// initialize the canvas
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		StdDraw.enableDoubleBuffering();

		// rectangle parameters
		int x = 250;
		int y = 250;
		int rectHalfSize = 20;
		
		// draw the rectangle
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledRectangle(x, y, rectHalfSize, rectHalfSize);
		StdDraw.show();
		
		// pause duration to get keyboard inputs
		int keyboardPauseDuration = 100;
		
		// main animation loop
		while (true) {
			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				// Move the rectangle to the left
				StdDraw.pause(keyboardPauseDuration);
				x = x - 2*rectHalfSize;
			} 
			if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
				// Move right
				StdDraw.pause(keyboardPauseDuration);
				x = x + 2*rectHalfSize;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
				// Move up
				StdDraw.pause(keyboardPauseDuration);
				y = y + 2*rectHalfSize;
			} 
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
				// Move down
				StdDraw.pause(keyboardPauseDuration);
				y = y - 2*rectHalfSize;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_C)) {
				// Change the color of rectangle to black
				StdDraw.pause(keyboardPauseDuration);
				StdDraw.setPenColor(StdDraw.BLACK);
				
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_B)) {
				// Makes the rectangle bigger
				StdDraw.pause(keyboardPauseDuration);
				rectHalfSize = rectHalfSize + 5;
			}
			
			// clear the screen, draw the rectangle, and show it on the screen
			StdDraw.clear();
			StdDraw.filledRectangle(x, y, rectHalfSize, rectHalfSize);
			StdDraw.show();
		}
	}
}
