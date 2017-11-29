package TestManagers;

import java.util.ArrayList;

import entities.Produit;

/**
 * Created by mayammouarangue on 28/11/17.
 */

public class TestManagerProduit {

    private static ArrayList<Produit> listeProduit;

    public static void insertProduit(Produit produit){

        listeProduit.add(new Produit(produit.getId(),produit.getNom(),produit.getCategorie_id(),produit.getDescription(),produit.getPrix()));
    }

    public static void init(){
        listeProduit.add(new Produit(-1,"Pain au chocolat",1,"Du tres bon pain au chocolat",Float.parseFloat("(5,6")));
        listeProduit.add(new Produit(-1,"CROISSANT",1,"Du tres bon pain au croissant",Float.parseFloat("(8,6")));
        listeProduit.add(new Produit(-1,"Baguette",1,"Du tres bon baguette",Float.parseFloat("(3,6")));

    }

    public static ArrayList<Produit> getAllProduit(){
        if (listeProduit != null){
            return listeProduit;
        }
        else
            return null;
    }





}
