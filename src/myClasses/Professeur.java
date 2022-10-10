/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myClasses;

/**
 *
 * @author Samiha
 */
public class Professeur extends Personne{
    private String CodeProf;
    private static int count = 1;

    public Professeur(String nom, String prenom, int Age) {
        super(nom, prenom, Age);
        this.CodeProf = "PROF".concat(Integer.toString(count++));
    }

    @Override
    public String toString() {
        return "CodeProf : "  + this.CodeProf + "\nNom : " + this.getNom()+"\nPrénom : " + this.getPrenom() + "\nAge: "+getAge() ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
