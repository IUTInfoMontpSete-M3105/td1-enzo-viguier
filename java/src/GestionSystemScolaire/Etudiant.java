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





}