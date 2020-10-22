package be.julburn.persoprojects.buburnquest;
import java.util.Scanner;
import java.io.IOException;

public class Heros {
		public int pv, force;
		public String nom;
		public Boolean etat, hCombat = false;

	public Heros (int pv, int force, boolean etat, String nom){
		super();
		this.init(pv, force, etat);
	}

	public void init(int pPv, int pForce, boolean pEtat){
		this.pv = pPv;
		this.force = pForce;
		this.etat = pEtat;
	}

	public void setNom(){
		Scanner sc = new Scanner(System.in);
		for(int cpt = 0; cpt < 30; cpt++)
			System.out.println("\n");
		System.out.println("\nQuel nom veux-tu donner à ton Héros ?");
		this.nom = sc.nextLine();
	}

	public void setStats(){
		int choix;
		this.etat = true;
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

	public String getNom(){
		return this.nom;
	}

	public int getPv(){
		return this.pv;
	}

	public int getForce(){
		return this.force;
	}

	public boolean getEtat(){
		return this.etat;
	}


	public void setDirection()throws IOException{
			int a, b;
			System.out.println("Par où aller ?\n1. Tout droit\n2. Gauche\n3. Droite");
			a = (int)((3*((float)Math.random()))+1);
			Scanner sc = new Scanner(System.in);
			b = sc.nextInt();
			while (b != 1 && b != 2 && b != 3){
				System.out.println("\n\n\n -----> CHOIX INCORRECT <-----");
				System.in.read();
				System.out.println("Par où aller ?\n1. Tout droit\n2. Gauche\n3. Droite");
				b = sc.nextInt();
			}
			if (b == a){
				System.out.println("\n\nPas de démon en vue... tu continues à avancer...");
				System.in.read();
				this.hCombat = false;
			} else {
				System.out.println("\n\nUn démon surgit devant toi ! !");
				this.hCombat = true;
				System.in.read();
			}
		}
	public boolean getCombat(){
		return this.hCombat;
	}

}