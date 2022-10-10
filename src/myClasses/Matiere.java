/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myClasses;

/**
 *
 * @author Samiha
 */
public class Matiere {
    private String codeMat;
    private String intitule;
    private int coefficient; 
    private Professeur prof;
    private static int count = 1;
    private float moyenneMat;

    public Matiere(String intitule, int Coefficient, Professeur prof) {
        this.intitule = intitule;
        this.prof = prof;
        this.codeMat = "MAT".concat(Integer.toString(count++));
        this.coefficient = Coefficient;
    }
   

    public String getIntitule() {
        return intitule;
    }
    
    public float getMoyenneMat() {
        return moyenneMat;
    }
    
    public void setMoyenneMat(float moyenneMat) {
        this.moyenneMat = moyenneMat;
    }   

    public int getCoefficient() {
        return coefficient;
    }
    
    public void afficherMatiere()
    {
        System.out.println(this.codeMat + "\t|" + this.coefficient + "\t\t|" + this.intitule );
    }

    public String getCodeMat() {
        return codeMat;
    }

    public Professeur getProf() {
        return prof;
    }    
}
