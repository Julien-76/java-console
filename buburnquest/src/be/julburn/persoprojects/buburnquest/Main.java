package be.julburn.persoprojects.buburnquest;
import java.util.Scanner;
import java.io.IOException;

public class Main{

	public static void main(String... args)throws IOException{

		int forceDemon, direction = 0, choix = 0;
		boolean combat = false;
		Heros julburn = new Heros();
		julburn.setNom();
		julburn.setStats();
		System.out.println("\n\n\n\n\n\nVoici ton Héros");
		System.in.read();
		julburn.getStats();
		System.in.read();
		System.in.read();
		for(int cpt = 0; cpt < 30; cpt++)
			System.out.println("\n");
		System.out.println("Tu entres dans un donjon habité par des démons\n\ntu vas devoir arriver jusqu'au bout vivant ! ");
		System.in.read();
		System.out.println("\nAprès quelques dizaines de mètres, tu arrives à un carrefour.");
		System.in.read();
		System.out.println("Par où aller ?\n1. Tout droit\n2. Gauche\n3. Droite");
		System.in.read();
		setDirection(direction, choix, combat);








	}
	public static void setDirection(int a, int b, boolean c)throws IOException{
		a = (int)((3*((float)Math.random()))+1);
		Scanner sc = new Scanner(System.in);
		b =sc.nextInt();
		if (b == a){
			System.out.println("\n \nPas de démon en vue... tu continues à avancer...");
			System.in.read();
			c = false;
		} else {
			System.out.println("\n\nUn démon surgit devant toi ! !");
			System.in.read();
			Demon grougrou = new Demon();
			grougrou.setStats();
			System.in.read();
		}
	}
}