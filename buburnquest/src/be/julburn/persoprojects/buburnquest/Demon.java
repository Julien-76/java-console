package be.julburn.persoprojects.buburnquest;
import java.io.IOException;

public class Demon{

	int pv, force;
	boolean etat;

	public void setStats(){
		String taille;
		float proba = (float)Math.random();
		if (proba < 0.5){
			this.pv = 31;
			this.force = 3;
			taille = "grand";
		} else {
			this.pv = 60;
			this.force = 5;
			taille = "petit";
		}
		System.out.println("\nTu tombes sur un " + taille + " démon !");
	}

	public int getForce(){
		return this.force;
	}
}