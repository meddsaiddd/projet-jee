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

@WebServlet("/connexionrespo")
public class ConnexionrRespo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    	int idRespo = Integer.parseInt(request.getParameter("identifiant"));
        String motDePasse = request.getParameter("motDePasse");

        

        // Trouver le département correspondant à l'identifiant
        Employe respo= StockageDonnees.employes.stream()
                .filter(dept -> dept.getId() == idRespo)
                .findFirst()
                .orElse(null);
        Departement departementResponsable = StockageDonnees.departements.stream()
            .filter(dept -> dept.getId() == respo.getDepartementId())
            .findFirst()
            .orElse(null);

        if (departementResponsable == null || !"respo".equals(motDePasse)) {
            request.setAttribute("erreur", "Identifiants incorrects.");
            request.getRequestDispatcher("connexionrespo.jsp").forward(request, response);
            return;
        }

        // Filtrer les employés appartenant au département du responsable
        List<Employe> employesDuDepartement = StockageDonnees.employes.stream()
            .filter(e -> e.getDepartementId() == departementResponsable.getId() && e.getId() != idRespo )
            .collect(Collectors.toList());

        // Stocker les informations dans la requête
        request.setAttribute("respo", respo);
        request.setAttribute("employesDuDepartement", employesDuDepartement);

        // Rediriger vers la page du responsable avec les informations
        request.getRequestDispatcher("responsable.jsp").forward(request, response);
    }
}
