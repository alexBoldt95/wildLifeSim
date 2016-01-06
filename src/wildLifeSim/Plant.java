package wildLifeSim;
import java.util.*;

public class Plant {
Boolean isEdible;
int posX;
int posY;
double spawnRoll;
Environment env;

	public Plant(Environment place){
		env=place;
		localize();
	}


	public void attemptSpawn(){
		spawnRoll=Math.random();
		//System.out.println(spawnRoll);
		if(spawnRoll<0.1){
			localize();
		}
	}
	public void localize(){	
	
		
		posX=(int) (Math.random()*(env.uBX+1));
		posY=(int) (Math.random()*(env.uBY+1));

		System.out.println("A plant has spawned at (" + posX + "," + posY + ")");
		
	}
	
}
