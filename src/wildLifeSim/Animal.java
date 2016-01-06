package wildLifeSim;
import java.lang.Math;
import java.util.*;

public class Animal {
	protected String food;
	protected int hunger;
	protected int posX;
	protected int posY;
	protected Environment env;
	public static ArrayList<Animal> listAnimals = new ArrayList<Animal>();

	public Animal(Environment place){
		env=place;
		localize();
		listAnimals.add(this);
	}

	public void localize(){
		posX=(int) (Math.random()*(env.uBX+1));
		posY=(int) (Math.random()*(env.uBY+1));
		System.out.println("The animal spawns at (" + posX + "," + posY + ")");
	}
	public void roam(){	
		boolean go=true;
		double xVel=0;
		double yVel=0;	
		while(go==true || posX+xVel<env.lBX || posX+xVel>env.uBX || posY+yVel<env.lBY  || posY+yVel>env.uBY  ){	
			xVel=Math.random();
			yVel=Math.random();
			if(xVel>=0.67){
				xVel=1;
			}
			else if(xVel<0.67 && xVel>=0.33){
				xVel=0;
			}
			else{
				xVel=-1;
			}
			if(yVel>=0.67){
				yVel=1;
			}
			else if(yVel<0.67 && yVel>=0.33){
				yVel=0;
			}
			else{
				yVel=-1;
			}		
			go=false;
		}		
		posX+=xVel;
		posY+=yVel;
		System.out.println("The animal is at (" + posX + "," + posY + ")");
	}

	public void eat(){
	
	}


	public void sleep(){
	
	}
}

