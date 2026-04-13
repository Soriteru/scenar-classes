package classesjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sohan
 */
public class Voiture {
    String marque;
    String modele;
    int annee;
    double prix;
    String carburant;
    Pneus type_pneu;
    
    public void afficherDescription() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Année : " + annee);
        System.out.println("Prix : " + prix + " €");
    }
    
    public Voiture(String marque, String modele, int annee, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
    }
}
