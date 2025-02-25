<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion Employé</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="text-center">Connexion Employé</h2>

        <% if (request.getParameter("erreur") != null) { %>
            <p class="alert alert-danger text-center">Identifiants incorrects. Veuillez réessayer.</p>
        <% } %>

        <form action="ConnexionEmployer" method="post">
            <div class="mb-3">
                <label class="form-label">Adresse E-mail :</label>
                <input type="email" name="email" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Mot de Passe :</label>
                <input type="password" name="motDePasse" class="form-control" required>
            </div>

            <button type="submit" class="btn btn-primary w-100">Se Connecter</button>
        </form>

        <p class="text-center mt-3">
            <a href="modifierMotDePasse.jsp">Mot de passe oublié ? Modifier ici</a>
        </p>
    </div>
</body>
</html>
