<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil - Gestion RH</title>
    
    <!-- Intégration de Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex flex-column justify-content-center align-items-center vh-100">
        <div class="text-center">
            <h2 class="mb-4">Bienvenue sur la Gestion des Ressources Humaines</h2>
            
            <div class="d-grid gap-3 col-6 mx-auto">
                <a href="connexion.jsp" class="btn btn-primary btn-lg">Connexion Administrateur</a>
<a href="connexionrespo.jsp" class="btn btn-secondary btn-lg">Connexion Responsable</a>
<a href="connexionEmployer.jsp" class="btn btn-success btn-lg">Connexion Employé</a>

            </div>
        </div>
    </div>

    <!-- Bootstrap JS (optionnel si pas besoin de fonctionnalités JS) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
