Die bob;
void setup()
{
	size(325, 400);
	noLoop();

}
void draw()
{

	for (int y = 0; y<=325; y+=110){
		for (int x = 0; x <= 325; x+=110){
			bob = new Die(x, y);
			bob.roll();
			bob.show();
		}
	}
}
void mousePressed()
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
	void roll()
	{
		randomNum = (int)(Math.random()*6+1);
	}
	void show()
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
		else if(randomNum == 3)
		{
			fill(0);
			ellipse(myX+20, myY+20, 20, 20);
			ellipse(myX+50, myY+50, 20, 20);
			ellipse(myX+80, myY+80, 20, 20);
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
