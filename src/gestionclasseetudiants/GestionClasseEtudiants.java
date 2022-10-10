/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionclasseetudiants;
import java.util.Scanner;
import myClasses.*;
/**
 *
 * @author Samiha
 */
public class GestionClasseEtudiants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Classe classeEtud;
        String nomClasse, codeE, codeM;
        int nbrEtudiants, nbrMatieres;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisir le nom de la classe: ");
        nomClasse = sc.nextLine();
        System.out.println("Saisir le nombre d'étudiants de la classe: ");
        nbrEtudiants = sc.nextInt();
        sc.nextLine();
        System.out.println("Saisir le nombre de matières de la classe: ");
        nbrMatieres = sc.nextInt();
        sc.nextLine();
        classeEtud = new Classe(nomClasse, nbrEtudiants, nbrMatieres);
        
        // Lancer la saisie des matières
        classeEtud.saisirMatieres();
        
        // Lancer la saisie des étudiants
        classeEtud.saisirEtudiants();
        
        // Lancer la saisie des notes de chaque étudiants dans toutes les matières.
        classeEtud.sairirNotesEtudiants();
        
        // Menu du programme
        int choix;
        do
        {
            System.out.println("Menu : ");
            System.out.println("Entrer 1 pour afficher la liste des matières");
            System.out.println("Entrer 2 pour afficher le professeur d'une matière");
            System.out.println("Entrer 3 pour afficher la liste des étudiants");
            System.out.println("Entrer 4 pour afficher la note d'un étudiant dans une matière");
            System.out.println("Entrer 5 pour afficher la moyenne d'un étudiant");
            System.out.println("Entrer 6 pour afficher la moyenne d'une matière");
            System.out.println("Entrer 7 pour afficher la moyenne de la classe");
            System.out.println("Entrer 8 pour afficher le classement des étudiants");
            System.out.println("Entrer 0 pour quitter le programme");
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    classeEtud.afficherMatieres();
                    break;
                case 2:
                    System.out.println("Entrer le code la matière");    
                    classeEtud.afficherProfMatiere(sc.nextLine());
                    break;
                case 3:
                    classeEtud.afficherEtudiants();
                    break;
                case 4:
                    System.out.println("Entrer le code de l'étudiant");
                    codeE = sc.nextLine();
                    System.out.println("Entrer le code de la matière");
                    codeM = sc.nextLine();
                    classeEtud.afficherNoteEtudiantMatiere(codeE, codeM);
                    break;
                case 5:
                    System.out.println("Entrer le code de l'étudiant");
                    codeE = sc.nextLine();
                    classeEtud.afficherMoyenneEtudiant(codeE);
                    break;
                case 6:
                    System.out.println("Entrer le code de la matière");
                    codeM = sc.nextLine();
                    classeEtud.afficherMoyenneMatiere(codeM);
                    break;
                case 7:
                    System.out.println("La moyenne de la classe est : " + classeEtud.getMoyenneGenerale());
                    break;
                case 8:
                    classeEtud.afficherClassementClasse();
                    break;
                case 0:
                    System.out.println("Fin du programme");
                    break;
                default:
                    System.out.println("Choix invalide. Merci de saisir un numéro valide");
                    break;
            }
        }while(choix != 0);
    }
}
