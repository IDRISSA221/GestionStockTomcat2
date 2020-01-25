package sn.senstock.entities.controller;

import sn.senstock.dao.IProduit;
import sn.senstock.entities.Produit;
import sn.senstock.entities.dao.ProduitImp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/Produit", name="produit")
public class ProduitServlet extends HttpServlet {

    private IProduit produitdao= new ProduitImp();

    @Override
    public void init(ServletConfig config) throws ServletException {
        produitdao = new ProduitImp();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("produit/add.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nom=req.getParameter("nom").toString();
        double qt=Double.parseDouble(req.getParameter("qtStock").toString());

        Produit produit = new Produit();
        produit.setNom(nom);
        produit.setQtStock(qt);

        int ok = produitdao.add(produit);
        req.setAttribute("result",ok);
        //resp.getWriter().println(ok);
        req.setAttribute("result", ok);
        doGet(req, resp);


    }


}
