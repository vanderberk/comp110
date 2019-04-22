import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Lab7 { 
	
	public static void main(String[] args) {

		// simulation parameters 
		int width = 1600; //screen width 
		int height = 800; // screen height 
		double g = 9.80665; // gravity constant
		double t_step = 0.05; // simulation time step
		double arrowLength = 100.0; // initial length of the arrow to show particle's initial speed/direction
		double x0 = 120; // x coordinate of the particle's starting position
		double y0 = 120; // y coordinate of the particle's starting position
		double radius = 4; // radius of the particle 
		double v = 180; // initial velocity of the particle
		double vOriginal = v; 
		double theta = 45.0; // initial angle of the particle
		double theta_radian = theta * (Math.PI/180.0);

		// prepare the canvas for drawing
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		StdDraw.enableDoubleBuffering();

		// main game loop
		while (true) {
			
			// clear the screen at the start of each game
			StdDraw.clear();
			
			// initialize time to zero
			double t = 0.0;

			// generate a particle
			Particle p = new Particle(x0,y0,v,theta,radius);

			// generate obstacles
			ArrayList<Obstacle> obstacles = new ArrayList<>();
			obstacles.add(new Obstacle(1200, 0, 60, 220));
			obstacles.add(new Obstacle(1000, 0, 60, 160));
			obstacles.add(new Obstacle(600, 0, 60, 80));
			obstacles.add(new Obstacle(600, 180, 60, 160));
			obstacles.add(new Obstacle(220, 0, 120, 180));

			// generate targets
			ArrayList<Target> targets = new ArrayList<>();
			targets.add(new Target(1160, 0, 30, 30));
			targets.add(new Target(730, 0, 30, 30));
			targets.add(new Target(150, 0, 20, 20));
			targets.add(new Target(1480, 0, 60, 60));
			targets.add(new Target(340, 80, 60, 30));
			targets.add(new Target(1500, 600, 60, 60));

			// get keyboard input from the user
			int pauseDuration = 100;
			while (true)  { 
				if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
					System.out.print("Decrease velocity.");
					StdDraw.pause(pauseDuration);
					p.v = p.v - 1;
					System.out.printf("Angle: %.1f, Velocity: %.1f\n", p.theta, p.v);

				} 
				if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
					System.out.print("Increase velocity. ");
					StdDraw.pause(pauseDuration);
					p.v = p.v + 1;
					System.out.printf("Angle: %.1f, Velocity: %.1f\n", p.theta, p.v);
				} 
				if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
					System.out.print("Object is thrown...\n");
					StdDraw.pause(pauseDuration);
					break;
				} 

				if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
					System.out.printf("Increase angle. ");
					StdDraw.pause(pauseDuration);
					if (p.theta + 1.0 <= 90.0)
						p.theta = p.theta + 1;
					System.out.printf("Angle: %.1f, Velocity: %.1f\n", p.theta, p.v);
				} 
				if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
					System.out.print("Decrease angle.");
					StdDraw.pause(pauseDuration);
					if (p.theta > 1.0)
						p.theta = p.theta - 1;
					System.out.printf("Angle: %.1f, Velocity: %.1f\n", p.theta, p.v);
				}

				theta_radian = p.theta * (Math.PI/180.0);
				double newArrowLength = arrowLength + (p.v - vOriginal) * 2; 

				// draw obstacles
				StdDraw.clear(StdDraw.WHITE);
				for (Obstacle o : obstacles)
					o.draw();
				
				// draw targets
				for (Target target : targets)
					target.draw();
				
				// draw other elements
				StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				StdDraw.filledRectangle(x0/2.0, y0/2.0, x0/2.0, y0/2.0);
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.text(x0/2-5, y0/2, "a: " + Double.toString(p.theta));
				StdDraw.text(x0/2, y0/2-25, "v: " + Double.toString(p.v));
				StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
				StdDraw.line(x0, y0, x0+newArrowLength*Math.cos(theta_radian), y0+newArrowLength*Math.sin(theta_radian));
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(p.x, p.x, p.radius);
				StdDraw.show();
			} 

			// Compute projectile motion
			boolean flagContinue = true;
			int counter = 0;
			double xprev = x0;
			double yprev = y0;
			
			
			while (flagContinue)  { 

				if (counter > 0) {
					xprev = p.x;
					yprev = p.y;
				}

				p.x = x0 + p.v * Math.cos(theta_radian) * t;
				p.y = y0 + (p.v * Math.sin(theta_radian) - g * t) * t - (0.5) * g * t * t;

				// draw
				if (counter > 0) {
					StdDraw.setPenRadius(0.001);
					StdDraw.line(xprev, yprev, p.x,p.y);
				}
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(p.x, p.y, p.radius);
				StdDraw.show();
				StdDraw.pause(20);
				counter++;
				t = t + t_step;

				// check if the object hits obstacles
				boolean touch = false;
				for (Obstacle o : obstacles)
					if (o.isInside(p.x, p.y)) {
						touch = true;
						break;
					}

				// check if the objecty hits the targets
				boolean foundTarget = false;
				for (Target target : targets)
					if (target.isInside(p.x, p.y)) {
						foundTarget = true;
						break;
					}

				// if the object hits obstacles/targets, finish the simulation
				if (touch) {
					System.out.println("Hit an obstacle.");
					break;
				}

				if (foundTarget) {
					System.out.println("Found the target.");
					break;
				}

				// ball is out of the window. finish the simulation.
				if ((p.y < 0) || (p.x > width)) {
					flagContinue = false;
					break;
				}
			}

			StdDraw.text(p.x+40, p.y+30, String.format("x: %.1f\n",p.x));
			StdDraw.show();
			System.out.println("\nPress R to play again. Close the window to EXIT.");

			// Exit the program by closing the window.
			// Or, continue to generate a new particle by pressing R key
			while (true)  { 
				if (StdDraw.isKeyPressed(KeyEvent.VK_R)) {
					System.out.println("\nGame restarted.");
					StdDraw.pause(pauseDuration);
					break;
				} 
			}
		}
	}
} 