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

    public static ArrayList<Produit> getAllProduit(){
        if (listeProduit != null){
            return listeProduit;
        }
        else
            return null;
    }





}
