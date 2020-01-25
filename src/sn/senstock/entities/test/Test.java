package sn.senstock.entities.test;

import sn.senstock.dao.IProduit;
import sn.senstock.entities.Produit;
import sn.senstock.entities.dao.ProduitImp;

public class Test {
    public static void main(String[] args){
        IProduit produitdao = (IProduit) new ProduitImp();

        Produit produit = new Produit();
        produit.setNom("Ordinateur");
        produit.setQtStock(125);
        int ok = produitdao.add(produit);
        System.out.println(ok);

    }

    }
