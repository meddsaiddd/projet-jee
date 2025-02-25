<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Connexion</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="d-flex justify-content-center align-items-center vh-100 bg-light">
    <div class="card p-4 shadow-lg">
        <h3 class="text-center">Connexion</h3>
        <% if (request.getParameter("erreur") != null) { %>
            <div class="alert alert-danger text-center">Identifiants incorrects</div>
        <% } %>
        <form action="connexionrespo" method="post">
            <div class="mb-3">
                <label>Identifiant :</label>
                <input type="text" name="identifiant" class="form-control" required>
            </div>
            <div class="mb-3">
                <label>Mot de passe :</label>
                <input type="hidden" name="motDePasse" value="respo" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-primary w-100">Se connecter</button>
        </form>
    </div>
</body>
</html>
