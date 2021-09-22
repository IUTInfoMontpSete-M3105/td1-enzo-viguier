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

    public void participerCours(Cours a) {
        a.setCDC(this);
        System.out.println("L'enseignant " + this.getNom()  + " " + this.getPrenom() + " participe au cours de " + a.getNom());

    }

    @Override
    public String toString() {
        return "L'enseignant : " + this.getNom() + " " + this.getPrenom();
    }
}
