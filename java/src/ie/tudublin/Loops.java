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

	public void mouseClicked()
	{
		if(option == 0)
		{
			case01();
			option = 1;
		}
		else
		{
			case02();
			option = 0;
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
				for(int i = 0; i < 10; i++)
				{
					fill(i, 255, 255);
					//rect(i, 0, i+50);
				}
				break;
		}
	}
}
