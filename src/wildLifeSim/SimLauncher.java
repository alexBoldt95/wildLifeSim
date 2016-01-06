package wildLifeSim;
//import java.lang.Thread;
public class SimLauncher {

	public static void main(String[] args){
		Environment e = new Environment(0, 0, 20, 20);
		Animal a= new Animal(e);
		Plant p = new Plant(e);
		while(true){
		a.roam();
		p.attemptSpawn();
		try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			}
		
		}
	}
}

