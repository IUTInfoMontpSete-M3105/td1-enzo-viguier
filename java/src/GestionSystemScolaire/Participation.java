package GestionSystemScolaire;
import java.util.*;

/**
 * 
 */
public class Participation {

    /**
     * Default constructor
     */
    public Participation(String appreciation, String certificat) {
        this.appreciation = appreciation;
        this.certificat = certificat;
    }

    /**
     * 
     */
    private double note;

    /**
     * 
     */
    private String appreciation;

    /**
     * 
     */
    public String certificat;


    /**
     * @param note
     */
    public void updateParticipation(double note) {
        this.note = note;
    }

}