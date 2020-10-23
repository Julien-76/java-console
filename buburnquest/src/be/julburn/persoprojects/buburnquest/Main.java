package be.julburn.persoprojects.buburnquest;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String... args) throws IOException {

        int forceDemon, direction = 0, choix = 0;
        boolean combat = false, coffre = false;
        Heros julburn = new Heros();
        julburn.setNom();
        julburn.setStats();
        System.out.println("\n\n\n\n\n\nVoici ton Héros");
        System.in.read();
        System.out.println("\n" + julburn.getNom() + "\nPV : " + julburn.getPv() + "\nForce : " + julburn.getForce());
       if (julburn.force == 30){
           System.out.println("Chances de Coup Critique : 15%");
       }
        System.in.read();
        for (int cpt = 0; cpt < 30; cpt++)
            System.out.println("\n");
        System.out.println("Tu entres dans un donjon habité par des démons\n\ntu vas devoir arriver jusqu'au bout vivant ! ");
        System.in.read();
        for (int cpt = 0; cpt < 5; cpt++)
            System.out.println("\n");

        for(int cpt = 0; cpt < 7; cpt++) {             // Début des tours
            if (cpt == 6){
                System.out.println("Tu sens que la fin du donjon est à quelques mètres !");
                System.in.read();
            }
            if (cpt == 5){
                System.out.println("Tu commences à voir des lueurs de lumière, tu n'es plus loin de la sortie !");
                System.in.read();
            }
            if (cpt == 3){
                System.out.println("Tu pense avoir trouvé une piste qui te mènerait à la sortie");
                System.in.read();
            }
            if (cpt == 1){
                System.out.println("Toujours aucune trace de la sortie, tu avances aveuglement...");
                System.in.read();
            }
            System.out.println("Après quelques dizaines de mètres, tu arrives à un carrefour.");
            System.in.read();
            julburn.setDirection();
            combat = julburn.getCombat();
            if (combat) {
                Combat fight = new Combat();
                Demon grougrou = new Demon();
                grougrou.setStats();
                while (julburn.getPv() > 0 && grougrou.getPv() > 0) {
                    fight.setInitiative(julburn, grougrou);
                }
                fight.finCombat(julburn, grougrou);
            }
            if (julburn.getEtat()) {
                System.in.read();
                System.out.println("Tu continues ton chemin...");
                System.in.read();
                Coffre mimic = new Coffre();
                mimic.setStats();
                if (mimic.etat){
                    mimic.choixCoffre(julburn);
                }
            }
        }
    }
}
		
	

