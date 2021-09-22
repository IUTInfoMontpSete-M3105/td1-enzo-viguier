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
        this.classe = new ArrayList<>();
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int semestre;


    private Enseignant CDC;
    private ArrayList<Etudiant> classe;




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

    public String getNom() {
        return nom;
    }

    public Enseignant getCDC() {
        return CDC;
    }

    public ArrayList<Etudiant> getClasse() {
        return classe;
    }

    public void setCDC(Enseignant CDC) {
        this.CDC = CDC;
    }

    public void effectifDansLeCours() {
        System.out.println("Dans la classe il y a :");
        System.out.println(this.getCDC());
        for (int i = 0; i < this.classe.size(); i++) {
            System.out.println(this.classe.get(i));

        }
    }

}