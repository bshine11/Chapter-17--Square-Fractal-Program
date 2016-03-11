// Lab17bvst.java
// The student, starting version of the Lab17b assignment.


import java.awt.*;
import java.applet.*;


public class Lab17bvst extends Applet
{

	public void paint (Graphics g)
	{
		drawSquare1(g,1024,768);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int midX = maxX/2;
		int midY = maxY/2;
		int startWidth = maxX/4;
		int startHeight = maxY/4;
		int tlX = midX - (startWidth/2); // top left x
		int tlY = midY - (startHeight/2); //top left y
		g.fillRect(tlX,tlY,startWidth,startHeight);

		if(maxY <= 1){
			g.fillRect(tlX,tlY,startWidth,startHeight);
			
			return;
		}
		else{
			maxX = 3*maxX/5;
			maxY = 3*maxY/5;
			drawSquare1(g,maxX,maxY);
			/*g.fillRect(maxX, maxY, startHeight, startWidth);
			g.fillRect(maxX-startHeight/2, maxY-startWidth/2,startHeight/2,startWidth/2);
			g.fillRect(maxX+startHeight, maxY-startWidth/2,startHeight/2,startWidth/2);
			g.fillRect(maxX-startHeight/2, maxY+startWidth,startHeight/2,startWidth/2);
			g.fillRect(maxX+startHeight, maxY+startWidth,startHeight/2,startWidth/2);*/
		}
		
	}

	public void delay(long n)
	{
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

	public void drawFourSquare(Graphics g, int x, int y, int width, int height) {
		
	}

	public void drawSoutheast(Graphics g, int x, int y, int startWidth, int startHeight) {
	
	}

	public void drawSouthwest(Graphics g, int x, int y, int width, int height) {

	}

	public void drawNorthEast(Graphics g, int x, int y, int width, int height) {

	}

}


