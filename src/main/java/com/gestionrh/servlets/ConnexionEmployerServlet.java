package com.gestionrh.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.gestionrh.modeles.Employe;
import com.gestionrh.utils.StockageDonnees;

@WebServlet("/ConnexionEmployer")
public class ConnexionEmployer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String motDePasse = request.getParameter("motDePasse");

        boolean authentificationReussie = false;
        Employe employeConnecte = null;

        for (Employe emp : StockageDonnees.employes) {
            if (emp.getEmail().equals(email) && emp.getMotDePasse().equals(motDePasse)) {
                authentificationReussie = true;
                employeConnecte = emp;
                break;
            }
        }

        if (authentificationReussie) {
            HttpSession session = request.getSession();
            session.setAttribute("employe", employeConnecte);
            response.sendRedirect("profilEmploye.jsp");
        } else {
            response.sendRedirect("connexionEmployer.jsp?erreur=1");
        }
    }
}
