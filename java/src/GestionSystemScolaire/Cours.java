package GestionSystemScolaire;
import java.util.*;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int semestre;






    /**
     * @param doc
     */
    public void UploadDoc(Devoir doc) {
        System.out.println("Envoie du devoir . . .");
    }

    /**
     * @param ens
     */
    public void informerEnseignant(Enseignant ens) {
        System.out.println("Le cours : " + this.nom + "à été attribué à " + ens.getNom() + " " + ens.getPrenom());
    }

    /**
     * @param note
     */
    public void informerEtudiant(double note) {
        System.out.println();
    }

    /**
     * @param note
     */
    public void notification(double note) {
        System.out.println("Notification : " + note);
    }

}