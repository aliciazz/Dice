import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

Die bob;
public void setup()
{
	size(800, 800);
	noLoop();

}
public void draw()
{

	for (int y = 0; y<=340; y+=110){
		for (int x = 0; x <= 340; x+=110){
			bob = new Die(x, y);
			bob.roll();
			bob.show();
		}
	}
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	int myX, myY,randomNum;

	Die(int x, int y) //constructor
	{
		//variable initializations here
		roll();
		myX = x;
		myY = y;
	}
	public void roll()
	{
		randomNum = 1;// (int)(Math.random()*6+1);
	}
	public void show()
	{
		stroke(0);
		fill(255);
		rect(myX, myY, 100, 100);
		if (randomNum == 1)
		{
			fill(0);
			ellipse(myX+50, myY+50,20,20);
		}
		else if (randomNum ==2)
		{
			fill(0);
			ellipse(myX+20, myY+20, 20, 20);
			ellipse(myX+80, myY+80, 20, 20);
		}
		else if (randomNum ==3)
		{
			fill(0);
			ellipse(myX+20, myY+20, 20, 20);
			ellipse(myX+50, myY+50, 20, 20);
			ellipse(myX+80, myX+80, 20, 20);
		}
		else if (randomNum ==4)
		{
			fill(0);
			ellipse(myX+20, myY+20, 20, 20);
			ellipse(myX+80, myY+20, 20, 20);
			ellipse(myX+20, myY+80, 20, 20);
			ellipse(myX+80, myY+80, 20, 20);
		}
		else if (randomNum ==5)
		{
			fill(0);
			ellipse(myX+20, myY+20, 20, 20);
			ellipse(myX+80, myY+20, 20, 20);
			ellipse(myX+20, myY+80, 20, 20);
			ellipse(myX+80, myY+80, 20, 20);
			ellipse(myX+50, myY+50, 20, 20);
		}
		else if (randomNum ==6)
		{
			fill(0);
			ellipse(myX+20, myY+20, 20, 20);
			ellipse(myX+80, myY+20, 20, 20);
			ellipse(myX+20, myY+80, 20, 20);
			ellipse(myX+80, myY+80, 20, 20);
			ellipse(myX+20, myY+50, 20, 20);
			ellipse(myX+80, myY+50, 20, 20);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
