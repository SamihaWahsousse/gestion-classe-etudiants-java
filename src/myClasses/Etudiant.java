/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myClasses;

import java.util.ArrayList;

/**
 *
 * @author Samiha
 */
public class Etudiant extends Personne{
    private String CodeEtud;
    private ArrayList<NoteMatiere> notesEtud = new ArrayList<>();
    private static int count = 1;
    private float moyenne;

    public Etudiant(String nom, String prenom, int Age) {
        super(nom, prenom, Age);
        this.CodeEtud = "ETD".concat(Integer.toString(count++));
    }

    public void addNoteMatiere(NoteMatiere note) {
        this.notesEtud.add(note);
    }
    
    public void calculateMoyenneEtudiant()
    {
        float sommeNotes = 0;
        int sommeCoef = 0;
        
        for(NoteMatiere note:notesEtud)
        {
           sommeNotes = sommeNotes + note.getNote()*note.getMatiere().getCoefficient();
           sommeCoef  = sommeCoef + note.getMatiere().getCoefficient();
        }
        if(sommeCoef != 0)
        {
            this.moyenne = sommeNotes / sommeCoef;
        }
    }

    public String getCodeEtud() {
        
        return CodeEtud;
    }
    
    public void afficherEtudiant()
    {
        System.out.println(CodeEtud + "\t|"+getNom()+"\t\t|"+getPrenom()+"\t\t|"+getAge());
    }
    
    public void afficherNoteMatiere(String codeM)
    {
        for(NoteMatiere noteM:notesEtud)
        {
            if(noteM.getMatiere().getCodeMat().equalsIgnoreCase(codeM))
            {
                System.out.println("Note : " + noteM.getNote());
                break;
            }
        }
    }

    public float getMoyenne() {
        return moyenne;
    }   
}
