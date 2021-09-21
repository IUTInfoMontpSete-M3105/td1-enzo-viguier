package GestionSystemScolaire;
import java.util.*;

/**
 * 
 */
public class Devoir {

    /**
     * Default constructor
     */
    public Devoir(String nom, String description, Date deadline, double point) {
        this.nom = nom;
        this.description = description;
        this.deadline = deadline;
        this.point = point;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Date deadline;

    /**
     * 
     */
    private double point;

    @Override
    public String toString() {
        return "Devoir de " + this.nom + " | " + this.description + " | Date limite :" + this.deadline + " | point : " + this.point;
    }
}