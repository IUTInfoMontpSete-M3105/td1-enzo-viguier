package GestionSystemScolaire;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        // INITIALISATION
        Cours cour1 = new Cours("CPOA", 3);

        Devoir test1 = new Devoir("UML", "Savoir utiliser l'UML", new Date(2021, 9, 21), 12.0);
        Devoir test2 = new Devoir("Java", "Faire du Java", new Date(2021, 9, 22), 12.0);

        Administrateur admin = new Administrateur("Dupont", "Jean", "5 Rue des chats", "jeandupont@gmail.com", "159753", "357951");

        Enseignant a1 = new Enseignant("Garcia", "Eric", "2 Place Verdun", "geric@gmail.com", "486279", "268413");
        Enseignant a2 = new Enseignant("Daudet", "Jeanne", "2 Chemin des coquelicots", "jdeaudet@gmail.com", "197346", "379168");

        Etudiant e1 = new Etudiant("Viguier", "Enzo", "Rue Blabla", "enzo.viguier@etu.umontpellier.fr", "111111");
        Etudiant e2 = new Etudiant("Potichat", "Alex", "Rue de la ruelle", "alex.potichat@etu.umontpellier.fr", "222222");
        //

        a1.participerCours(cour1);
        e1.participerCours(cour1);
        e2.participerCours(cour1);

        cour1.effectifDansLeCours();


    }

}
