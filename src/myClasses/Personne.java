/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myClasses;

/**
 *
 * @author Samiha
 */
public class Personne {
    private String nom;
    private String prenom;
    private int Age;

    public Personne(String nom, String prenom, int Age) {
        this.nom = nom;
        this.prenom = prenom;
        this.Age = Age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return Age;
    }
    
}
