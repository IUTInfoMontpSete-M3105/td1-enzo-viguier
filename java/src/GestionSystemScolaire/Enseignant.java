package GestionSystemScolaire;

public class Enseignant extends Utilisateur {


    /**
     * Default constructor
     *
     * @param nom
     * @param prenom
     * @param adresse
     * @param mail
     */
    public Enseignant(String nom, String prenom, String adresse, String mail, String numem, String harpege) {
        super(nom, prenom, adresse, mail);
        this.numem = numem;
        this.harpege = harpege;
    }

    /**
     *
     */
    private String numem;

    /**
     *
     */
    private String harpege;



}
