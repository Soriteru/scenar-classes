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
    
    public Voiture(String marque, String modele, int annee, double prix, Pneus pneu) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.type_pneu = pneu;
    }
}
