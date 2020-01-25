package sn.senstock.entities.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sn.senstock.entities.Produit;
import sn.senstock.entities.dao.ProduitImp;

public class JunitTest {
    @Before
    public void beforTest(){
        System.out.println("=========Befor===========");

    }
    @After
    public void afterTest(){
        System.out.println("=========After===========");

    }
    @Test
    public void testAddProduit(){
        sn.senstock.dao.IProduit produitdao = new ProduitImp ();
        Produit produit = new Produit();
        produit.setNom("Table");
        produit.setQtStock(12);

        produitdao.add(produit);

    }
}
