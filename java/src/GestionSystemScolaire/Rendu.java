package GestionSystemScolaire;
import java.util.*;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu(Devoir document, Date date, double points) {
        this.date = date;
    }

    /**
     * 
     */
    private Devoir document;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private double points;

    /**
     *
     */
    private Enseignant enseignantAttribue;




    /**
     * @param doc
     */
    public void setDocuments(Devoir doc) {
        this.document = doc;
    }

    /**
     * @param ens
     */
    public void affecterEnseignant(Enseignant ens) {
        this.enseignantAttribue = ens;
    }

    /**
     * 
     */
    public void getDocument() {
        System.out.println(this.document);
    }

    /**
     * @param note
     */
    public void setNote(double note) {
        this.points = note;
    }

}