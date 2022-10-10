/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myClasses;

import java.util.Scanner;

/**
 *
 * @author Samiha
 */
public class Classe {
   private  String nom;
   private Etudiant[] listEtudiants;
   private Matiere[] listMatieres;
   private float moyenneGenerale;

    public Classe(String nom, int nbrEtudiants, int nbrMatieres) {
        this.nom = nom;
        listEtudiants = new Etudiant[nbrEtudiants];
        listMatieres = new Matiere[nbrMatieres];
    }

   public void saisirMatieres()
   {
       String intitule, nomP, prenomP;
       int coefficient, ageP;
       Scanner sc = new Scanner(System.in);
       
       for(int i = 0; i < listMatieres.length ; i++)
       {
           Professeur prof;
           Matiere matiere;
           System.out.println("********* Saisie de la Matière " + (i+1) );
           System.out.print("*** Saisir l'intitulé de la Matière : " );
           intitule = sc.nextLine();
           System.out.print("*** Saisir le Coefficient de la Matière : " );
           coefficient = sc.nextInt();
           sc.nextLine();
           System.out.print("*** Saisir le nom du prefesseur : " );
           nomP = sc.nextLine();
           System.out.print("*** Saisir le prénom du professeur : " );
           prenomP = sc.nextLine();
           System.out.print("*** Saisir l'age du professeur : " );
           ageP = sc.nextInt();
           sc.nextLine();
           prof = new Professeur(nomP, prenomP, ageP);
           listMatieres[i] = new Matiere(intitule, coefficient, prof);
       }
   }

    public float getMoyenneGenerale() {
        return moyenneGenerale;
    }
      
   public void saisirEtudiants()
   {
       String nomE, prenomE;
       int ageE;
       Scanner sc = new Scanner(System.in);
       
       for(int i = 0; i < listEtudiants.length; i++)
       {
           System.out.println("********* Saisie de l'étudiant " + (i+1) );
           System.out.print("*** Saisir le nom d'étudiant : " );
           nomE = sc.nextLine();
           System.out.print("*** Saisir le prénom de l'étudiant : " );
           prenomE = sc.nextLine();
           System.out.print("*** Saisir l'age de l'étudiant : " );
           ageE = sc.nextInt();
           sc.nextLine();
           listEtudiants[i] = new Etudiant(nomE, prenomE, ageE);
       }
   }
   
   public void sairirNotesEtudiants()
   {
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i < listMatieres.length ; i++)
       {
           float note, sommeNotes = 0;
           System.out.println("********* Saisie des notes de la Matière " + listMatieres[i].getIntitule());
           
           for(int j = 0; j < listEtudiants.length ; j++)
           {
               System.out.print("*** Saisir la note de l'étudiant (" + listEtudiants[j].getCodeEtud() + ") "+  listEtudiants[j].getPrenom() + " " + listEtudiants[j].getNom() + " : ");
               note = sc.nextFloat();
               sc.nextLine();
               listEtudiants[j].addNoteMatiere(new NoteMatiere(listMatieres[j], note));
               sommeNotes = sommeNotes + note;
           }
           listMatieres[i].setMoyenneMat(sommeNotes/listEtudiants.length);
           System.out.println();
       }
       
       float sommeMoyennes = 0;
       for(int i = 0; i < listEtudiants.length ; i++)
       {
          listEtudiants[i].calculateMoyenneEtudiant(); 
          sommeMoyennes = sommeMoyennes + listEtudiants[i].getMoyenne();
       }
       
       if(listEtudiants.length != 0)
       {
           this.moyenneGenerale = sommeMoyennes / listEtudiants.length ;
       }
   }
   
   public void afficherMatieres()
   {
       System.out.println("Liste des matières : ");
       System.out.println("Code\t|Coefficient\t|Intitulé");
       for(int i = 0; i<listMatieres.length; i++)
       {
           listMatieres[i].afficherMatiere();
       }
   }
   
   public void afficherProfMatiere(String Code)
   {
       for(Matiere m:listMatieres)
       {
           if(m.getCodeMat().equalsIgnoreCase(Code))
           {
               System.out.println(m.getProf());
           }
       }
   }
   
   public void afficherEtudiants()
   {
       System.out.println("Liste des matières : ");
       System.out.println("Code\t|Nom\t\t|Prenom\t\t|Age");
       for(int i = 0; i<listEtudiants.length; i++)
       {
           listEtudiants[i].afficherEtudiant();
       }
   }
   
   public void afficherNoteEtudiantMatiere(String codeE, String codeM)
   {
       for(Etudiant e:listEtudiants)
       {
           if(e.getCodeEtud().equalsIgnoreCase(codeE))
           {
               e.afficherNoteMatiere(codeM);
               break;
           }
       }
   }
   
   public void afficherMoyenneEtudiant(String codeE)
   {
       for(Etudiant e:listEtudiants)
       {
           if(e.getCodeEtud().equalsIgnoreCase(codeE))
           {
               System.out.println("Moyenne de l'étudiant " + e.getPrenom() + " " + e.getNom()  + " est : " +e.getMoyenne());
               break;
           }
       }
   }
   
   public void afficherMoyenneMatiere(String codeM)
   {
       for(Matiere m:listMatieres)
       {
           if(m.getCodeMat().equalsIgnoreCase(codeM))
           {
               System.out.println("Moyenne de la matière "  + m.getIntitule()+ " est : "+ m.getMoyenneMat());
               break;
           }
       }
   }
   
   public void afficherClassementClasse()
   {
       Etudiant[] etudiantATrier  = listEtudiants;
       for(int i = 0; i < etudiantATrier.length -1; i++)
       {
           Etudiant max =  etudiantATrier[i];
           int indiceMax = i;
           for(int j = i+1 ; j < etudiantATrier.length; j++)
           {
               if(etudiantATrier[j].getMoyenne() > max.getMoyenne())
               {
                   max = etudiantATrier[j];
                   indiceMax = j;
               }
           }
           
           Etudiant aide = etudiantATrier[i];
           etudiantATrier[i] = max;
           etudiantATrier[indiceMax] = aide;
       }
       System.out.println("Classement\t|Prénom\t\t|Nom\t\t|Moyenne générale");
       for(int i = 0; i < etudiantATrier.length ; i++)
       {
           System.out.println( (i+1) + "\t\t|" + etudiantATrier[i].getPrenom() + "\t\t|" + etudiantATrier[i].getNom() + "\t\t|" + etudiantATrier[i].getMoyenne());
       }
   }
}
