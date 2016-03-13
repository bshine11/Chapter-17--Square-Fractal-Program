// Lab17bvst.java
// The student, starting version of the Lab17b assignment.

import java.awt.*;
import java.applet.*;

public class Lab17bvst extends Applet {
	public void init() {
		setSize(1250, 800);
	}

	public void paint(Graphics g) {
		drawSquare1(g, 1024, 768);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY) {
		int midX = maxX / 2;
		int midY = maxY / 2;
		int startWidth = maxX / 4;
		int startHeight = maxY / 4;
		int tlX = midX - (startWidth / 2); // top left x
		int tlY = midY - (startHeight / 2); // top left y
		g.fillRect(tlX, tlY, startWidth, startHeight);

		g.setColor(Color.red);
		drawFourSquares(g, tlX - startWidth / 2, tlY - startHeight / 2,
				startWidth / 2, startHeight / 2, 1);
		g.setColor(Color.blue);
		drawFourSquares(g, tlX + startWidth, tlY - startHeight / 2,
				startWidth / 2, startHeight / 2, 2);
		g.setColor(Color.yellow);
		drawFourSquares(g, tlX + startWidth, tlY + startHeight, startWidth / 2,
				startHeight / 2, 3);
		g.setColor(Color.green);
		drawFourSquares(g, tlX - startWidth / 2, tlY + startHeight,
				startWidth / 2, startHeight / 2, 4);
	}

	public void delay(long n) {
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

	public void drawNorthWest(Graphics g, int xStart, int yStart, int width,
			int height) {
		g.setColor(Color.red);
		drawFourSquares(g, xStart - width / 2, yStart - height / 2, width / 2,
				height / 2, 1);
		g.setColor(Color.blue);
		drawFourSquares(g, xStart + width, yStart - height / 2, width / 2,
				height / 2, 2);
		g.setColor(Color.green);
		drawFourSquares(g, xStart - width / 2, yStart + height, width / 2,
				height / 2, 4);
	}

	public void drawSouthEast(Graphics g, int xStart, int yStart, int width,
			int height) {
		g.setColor(Color.red);
		drawFourSquares(g, xStart - width / 2, yStart - height / 2, width / 2,
				height / 2, 1);
		g.setColor(Color.yellow);
		drawFourSquares(g, xStart + width, yStart + height, width / 2,
				height / 2, 3);
		g.setColor(Color.green);
		drawFourSquares(g, xStart - width / 2, yStart + height, width / 2,
				height / 2, 4);
	}

	public void drawSouthWest(Graphics g, int xStart, int yStart, int width,
			int height) {
		g.setColor(Color.blue);
		drawFourSquares(g, xStart + width, yStart - height / 2, width / 2,
				height / 2, 2);
		g.setColor(Color.yellow);
		drawFourSquares(g, xStart + width, yStart + height, width / 2,
				height / 2, 3);
		g.setColor(Color.green);
		drawFourSquares(g, xStart - width / 2, yStart + height, width / 2,
				height / 2, 4);
	}

	public void drawNorthEast(Graphics g, int xStart, int yStart, int width,
			int height) {
		g.setColor(Color.red);
		drawFourSquares(g, xStart - width / 2, yStart - height / 2, width / 2,
				height / 2, 1);
		g.setColor(Color.blue);
		drawFourSquares(g, xStart + width, yStart - height / 2, width / 2,
				height / 2, 2);
		g.setColor(Color.yellow);
		drawFourSquares(g, xStart + width, yStart + height, width / 2,
				height / 2, 3);
	}

	// Recursion and switch case to see if what rectangle it is and draw to only
	// sides that are necessary
	public void drawFourSquares(Graphics g, int xStart, int yStart, int width,
			int height, int side) {
		if (width >= 1) {
			g.fillRect(xStart, yStart, width, height);

			switch (side) {
			// Draws boxes in the top left
			case 1:
				drawNorthWest(g, xStart, yStart, width, height);
				break;
			// Draws boxes in the top right
			case 2:
				drawNorthEast(g, xStart, yStart, width, height);
				break;
			// Draws boxes in the bottom left
			case 3:
				drawSouthWest(g, xStart, yStart, width, height);
				break;
			// Draws boxes in the bottom right
			case 4:
				drawSouthEast(g, xStart, yStart, width, height);
				break;
			default:
				break;
			}
		}
	}

}
