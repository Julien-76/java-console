package be.julburn.persoprojects.buburnquest;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException {

        int forceDemon, direction = 0, choix = 0;
        boolean combat = false;
        Heros julburn = new Heros(0, 0, true, "");
        julburn.setNom();
        julburn.setStats();
        System.out.println("\n\n\n\n\n\nVoici ton Héros");
        System.in.read();
        System.out.println("\n" + julburn.getNom() + "\nPV : " + julburn.getPv() + "\nForce : " + julburn.getForce());
        System.in.read();
        System.in.read();
        for (int cpt = 0; cpt < 30; cpt++)
            System.out.println("\n");
        System.out.println("Tu entres dans un donjon habité par des démons\n\ntu vas devoir arriver jusqu'au bout vivant ! ");
        System.in.read();
        for (int cpt = 0; cpt < 5; cpt++)
            System.out.println("\n");
        System.out.println("\nAprès quelques dizaines de mètres, tu arrives à un carrefour.");
        System.in.read();
        julburn.setDirection();
        combat = julburn.getCombat();
        if (combat) {
            Combat fight = new Combat();
            Demon grougrou = new Demon();
            grougrou.setStats();
            System.in.read();
            while (julburn.getPv() > 0 && grougrou.getPv() > 0) {
                fight.setInitiative(julburn, grougrou);
            }


        }

    }
}
		
	

