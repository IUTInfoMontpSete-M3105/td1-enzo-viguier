package GestionSystemScolaire;
import java.util.*;

/**
 * 
 */
public class Etudiant extends Utilisateur {

    /**
     * Default constructor
     */
    public Etudiant(String nom, String prenom, String adresse, String mail, String ine) {
        super(nom, prenom, adresse, mail);
        this.ine = ine;
    }

    /**
     * 
     */
    private String ine;

    public void participerCours(Cours a) {
        a.getClasse().add(this);
        System.out.println("L'étudiant " + this.getNom()  + " " + this.getPrenom() + " participe au cours de " + a.getNom());
    }

    @Override
    public String toString() {
        return "L'étudiant : " + this.getNom() + " " + this.getPrenom();
    }
}