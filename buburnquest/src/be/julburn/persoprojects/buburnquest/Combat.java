package be.julburn.persoprojects.buburnquest;
import java.io.IOException;

public class Combat {

    public void setInitiative(Heros geralt, Demon eredin) throws IOException {
        float proba;
        this.afficheStats(geralt, eredin);
        System.in.read();
        proba = (float)Math.random();
        if (proba < 0.5){
            this.attaqueDemon(geralt, eredin);
        }
        else {
            this.attaqueHeros(geralt, eredin);
            System.in.read();
        }
    }

    public void attaqueDemon(Heros geralt, Demon eredin) throws IOException{
        System.out.println("\n\n\n\nLe Démon t'attaque !");
        System.in.read();
        float proba = (float)Math.random();
        if (proba <0.2){
            System.out.println("Mais il ne te touche pas...");
        }
        else {
            System.out.println("Il te blesse !");
            geralt.pv = geralt.getPv() - eredin.getForce();
        }
    }

    public void attaqueHeros(Heros geralt, Demon eredin) throws IOException{
        System.out.println("\n\n\n\nTu attaques le Démon !");
        System.in.read();
        float proba = (float)Math.random();
        if (proba <0.2){
            System.out.println("Tu ne touche pas le Démon");
        }
        else {
            System.out.println("\nTu touches le Démon");
            eredin.pv = eredin.getPv() - geralt.getForce();
        }

    }

    public void afficheStats(Heros geralt, Demon eredin) throws IOException{
        System.in.read();
        System.out.println("\nPV de " + geralt.getNom() + " : " + geralt.getPv());
        System.out.println("PV du Démon : " + eredin.getPv());
    }
}
