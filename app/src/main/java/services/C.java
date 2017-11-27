package services;

/**
 * Created by mayammouarangue on 26/11/17.
 */

public class C {
    public static String adresseIp="";


    public static final class utilisateur {
        public static final String nomTable = "utilisateur";
        public static final String id = "id";
        public static final String nom = "nom";
        public static final String etablissement_id = "etablissement_id";
        public static final String role_id = "role_id";
        public static final String userName = "userName";
        public static final String password = "password";
        public static final String isVisible = "isVisible";
        public static final String tokenIdentification = "tokenIdentification";
        public static final String tokenInscription = "tokenInscription";
    }

        public static final class ventes {
            public static final String nomTable = "ventes";
            public static final String date_horaire = "date_horaire";
            public static final String utilisateur_id = "utilisateur_id";
            public static final String quantite = "quantite";
            public static final String etablissement_id = "etablissement_id";
            public static final String id = "id";
        }

        public static final class etablissement {
            public static final String nomTable = "etablissement";
            public static final String id = "id";
            public static final String name = "name";
            public static final String tel = "tel";
            public static final String type_id = "type_id";
            public static final String isVisible = "isVisible";
        }

        public static final class commande {
            public static final String nomTable = "commande";
            public static final String utilisateur_id = "utilisateur_id";
            public static final String date = "date";
        }
        public static final class ligne_de_commande {
            public static final String nomTable = "ligne_de_commande";
            public static final String commande_id = "commande_id";
            public static final String produit_idproduit = "produit_idproduit";
            public static final String quantite = "quantite";
        }

        public static final class role {
            public static final String nomTable = "role";
            public static final String id = "id";
            public static final String denomination = "denomination";
        }

        public static final class role_etablissement {
            public static final String nomTable = "role_etablissement";
            public static final String type_id = "type_id";
            public static final String role_id = "role_id";
        }

         public static final class type {
             public static final String nomTable = "type";
             public static final String id = "id";
             public static final String denomination = "denomination";
         }
         public static final class adresse {
             public static final String nomTable = "adresse";
             public static final String id = "id";
             public static final String numero_rue = "numero_rue";
             public static final String ville = "ville";
             public static final String province = "province";
             public static final String code_postale = "code_postale";
             public static final String pays = "pays";
         }
        public static final class categorie {
             public static final String nomTable = "categorie";
             public static final String id = "id";
             public static final String denomination = "denomination";
         }

         public static final class produit {
             public static final String nomTable = "produit";
             public static final String id = "id";
             public static final String nom = "nom";
             public static final String categorie_id = "categorie_id";
             public static final String description = "description";
             public static final String prix = "prix";
             public static final String estvisible = "estvisible";
             public static final String reference = "reference";
             public static final String poid = "poid";
             public static final String unite_id = "unite_id";
         }

         public static final class src_image {
             public static final String nomTable = "src_image";
             public static final String id = "id";
             public static final String src_image_taille_normale = "src_image_taille_normale";
             public static final String src_image_mobile = "src_image_mobile";
             public static final String produit_id = "produit_id";

         }

         public static final class ligne_ingredient {
             public static final String nomTable = "ligne_ingredient";
             public static final String ingredient_id = "ingredient_id";
             public static final String produit_id = "produit_id";
             public static final String quantite = "quantite";
             public static final String unite_id = "unite_id";
         }

         public static final class ingredient {
             public static final String nomTable = "ingredient";
             public static final String id = "id";
             public static final String denomination = "denomination";
             public static final String quantite = "quantite";
             public static final String unite_id = "unite_id";
         }

         public static final class unite {
             public static final String nomTable = "unite";
             public static final String id = "id";
             public static final String denomination = "denomination";
         }


         public static final class produit_patte {
             public static final String nomTable = "produit_patte";
             public static final String poid = "poid";
             public static final String produit_id = "produit_id";
             public static final String patte_id = "patte_id";
             public static final String unite_id = "unite_id";
         }


         public static final class ingredient_patte {
             public static final String nomTable = "ingredient_patte";
             public static final String ingredient_id = "ingredient_id";
             public static final String patte_id = "patte_id";
             public static final String quantite = "quantite";
             public static final String unite_id = "unite_id";
         }

         public static final class pate {
             public static final String nomTable = "produit_patte";
             public static final String poid = "poid";
             public static final String produit_id = "produit_id";
             public static final String patte_id = "patte_id";
             public static final String unite_id = "unite_id";
         }

         public static final class production {
             public static final String nomTable = "production";
             public static final String utilisateur_id = "utilisateur_id";
             public static final String produit_id = "produit_id";
             public static final String quantite = "quantite";
             public static final String date = "date";
         }

         public static final class produit_propose {
             public static final String nomTable = "produit_propose";
             public static final String id = "id";
             public static final String description = "description";
             public static final String utilisateur_id = "utilisateur_id";
             public static final String titre = "titre";
         }

}
