package be.julburn.persoprojects.buburnquest;
import java.util.Scanner;
import java.io.IOException;

public class Heros {
		int pv, force;
		String nom;
		Boolean etat;

	public void setNom(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nQuel nom veux-tu donner à ton Héros ?");
		this.nom = sc.nextLine();
	}

	public void setStats(){
		int choix;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\n\n\n\nChoisi une classe pour ton Héros :\n1. Bourrin\n2. Rodeur");
		choix = sc.nextInt();
		while (choix != 1 && choix != 2){
			System.out.println("\nChoix incorrect");
			System.out.println("\nChoisi une classe pour ton Héros :\n1. Bourrin\n2. Rodeur");
			choix = sc.nextInt();
		}
		if (choix == 1){
			this.pv = 100;
			this.force = 20;
		} else {
			this.pv = 75;
			this.force = 30;
		}
	}

	public void getStats(){
		System.out.println("\n" + this.nom + "\nPV : " + this.pv + "\nForce : " + this.force);
	}


	public void dansTaGueule(){

	}

}