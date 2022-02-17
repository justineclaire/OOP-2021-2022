package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{

	int mode = 0;
	int option = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {

		colorMode(HSB);
		background(142, 142, 142);
		noStroke();
		frameRate(100);
		rectMode(CORNER);
		
	}

	public void keyPressed()
	{
		if (key >= '0' && key <= '9')
		{
			mode = key - '0';
		}
		println(mode);
	}

	public void case01()
	{
		if(mouseX <= 250)
		{
			fill(255,109,203);
			rect(0, 0, 250, 500);
		}
		else if(mouseX > 250)
		{
			fill(255,109,203);
			rect(250, 0, 250, 500);
		}
	}

	public void case02()
	{
		if(mouseX <= 250 && mouseY <= 250)
		{
			fill(255,109,203);
			rect(0, 0, 250, 250);
		}
		else if(mouseX <= 250 && mouseY > 250)
		{
			fill(255,109,203);
			rect(0, 250, 250, 250);
		}
		else if(mouseX > 250 && mouseY <= 250)
		{
			fill(255,109,203);
			rect(250, 0, 250, 250);
		}
		else if(mouseX > 250 && mouseY > 250)
		{
			fill(255,109,203);
			rect(250, 250, 250, 250);
		}
	}

	public void draw()
	{
		background(0);
		
		switch(mode)	
		{
			case 0:
				case01();
				break;
			
			case 1:
				case02();
				break;
			case 2:
				background(0);
				int bars = 10;
				float w = width/(float)bars;
				for(int i = 0; i < bars; i++)
				{
					fill(map(i, 0, bars, 0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, 500);

				}
				break;
			case 3:
				background(0);
				int squares = 10;
				float wi = width/(float)squares;
				for(int i = 0; i < squares; i++)
				{
					fill(map(i, 0, squares, 0, 255), 255, 255);
					rect(map(i, 0, squares, 0, 500), map(i, 0, squares, 0, 500), wi, wi);
				}
				break;
			case 4:
				background(0);
				int squaresx = 10;
				float wx = width/(float)squaresx;
				for(int i = 0; i < squaresx; i++)
				{
					float x = map(i, 0, squaresx, 0, 500);
					fill(map(i, 0, squaresx, 0, 255), 255, 255);
					rect(x, x, wx, wx);	
					rect((width-x) - wx, x, wx, wx);
				}
				break;
			case 5:
				background(0);
				int ellipses = 10;
				for(int i = ellipses; i < 0; i--)
				{
					float r = map(i, 0, ellipses, 0, 400);
					fill(map(i, 0, ellipses, 0, 255), 255, 255);
					ellipse(width/2, height/2, r, r);
				}
				break;
		}
	}
}
