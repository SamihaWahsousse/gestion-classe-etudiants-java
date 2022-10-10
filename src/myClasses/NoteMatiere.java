/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myClasses;

/**
 *
 * @author Samiha
 */
public class NoteMatiere {
    private Matiere matiere;
    private float Note;

    public NoteMatiere(Matiere matiere, float Note) {
        this.matiere = matiere;
        this.Note = Note;
    }

    public float getNote() {
        return Note;
    }

    public Matiere getMatiere() {
        return matiere;
    }
    
}
