package com.gestionrh.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.gestionrh.modeles.Departement;
import com.gestionrh.modeles.Employe;
import com.gestionrh.utils.StockageDonnees;

@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String identifiant = request.getParameter("identifiant");
        String motDePasse = request.getParameter("motDePasse");

        HttpSession session = request.getSession();

        
        

        // Vérification pour l'administrateur
        if ("admin".equals(identifiant) && "admin".equals(motDePasse)) {
            session.setAttribute("role", "admin");
            response.sendRedirect("tableau_bord.jsp");
            return;
        }

       
        else {
            // Si l'authentification échoue, rediriger vers la page de connexion avec un message d'erreur
            response.sendRedirect("connexion.jsp?erreur=1");
        }
    }
}
