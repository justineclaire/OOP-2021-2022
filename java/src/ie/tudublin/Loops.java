package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{

	int mode = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {

		colorMode(RGB);
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

	

	public void mouseClicked()
	{
		switch(mode)
		{
			case 0:
				int option = 0;
				if(option == 0)
				{
					option ++;
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
				else
				{
					option--;
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
		}
		
	}

	public void draw()
	{
		background(0);
		
		switch(mode)	
		{
			case 0:
				
				
				break;
			
			case 1:
				
				break;
		}
	}
}
