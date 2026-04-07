/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesjava;

/**
 *
 * @author sohan
 */
public class ClassesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        Voiture v1 = new Voiture();
        v1.marque = "Peugeot";
        v1.modele = "208";
        v1.annee = 2021;
        v1.prix = 14500;
        
        Voiture v2 = new Voiture();
        v2.marque = "Renault";
        v2.modele = "Clio";
        v2.annee = 2000;
        v2.prix = 3500;
        
        Voiture v3 = new Voiture();
        v3.marque = "Toyota";
        v3.modele = "Yaris";
        v3.annee = 2015;
        v3.prix = 9800;
        
        System.out.println("Test d'affichage :");
        System.out.println("La voiture "+v3.marque+" "+v3.modele+" de l'année "+v3.annee+" au prix de : "+v3.prix+" euros.");
        */
        
        Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500);
        Voiture v2 = new Voiture("Renault", "Clio", 2000, 3500);
        Voiture v3 = new Voiture("Toyota", "Yaris", 2015, 9800);
        System.out.println("La voiture "+v1.marque+" "+v1.modele+" de l'année "+v1.annee+" au prix de : "+v1.prix+" euros.");
        System.out.println("La voiture "+v2.marque+" "+v2.modele+" de l'année "+v2.annee+" au prix de : "+v2.prix+" euros.");
        System.out.println("La voiture "+v3.marque+" "+v3.modele+" de l'année "+v3.annee+" au prix de : "+v3.prix+" euros.");
    }
}
