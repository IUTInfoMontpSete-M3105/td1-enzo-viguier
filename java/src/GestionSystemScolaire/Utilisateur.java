package GestionSystemScolaire;
import java.util.*;
import java.util.Scanner;

/**
 * 
 */
public abstract class Utilisateur {

    /**
     * Default constructor
     */
    public Utilisateur(String nom, String prenom, String adresse, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private String adresse;

    /**
     * 
     */
    private String mail;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void gererDonneeUtilisateur() {
        Scanner saisie1 = new Scanner(System.in);
        Scanner saisie2 = new Scanner(System.in);
        Scanner saisie3 = new Scanner(System.in);
        Scanner saisie4 = new Scanner(System.in);

        System.out.println("Veuillez remplir les informations de votre profil :");
        System.out.println("Votre nom : ");
        String a1 = saisie1.next();
        System.out.println("Votre prénom : ");
        String a2 = saisie2.next();
        System.out.println("Votre adresse : ");
        String a3 = saisie3.next();
        System.out.println("Votre mail : ");
        String a4 = saisie4.next();
        System.out.println("Changement confirmé");



    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMail() {
        return mail;
    }
}