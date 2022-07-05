<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Enchères en cours</title>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
            <img src="images/logo_ENI_global_BLANC.png" alt="logo-ENI-global-BLANC">
            <a class="navbar-brand" href="HomeServlet">ENI Enchères</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">
                        <a class="nav-link active" href="HomeServlet">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="BidListServlet">Enchères en cours</a>
                    </li>
                    <c:if test="true">
                        <li class="nav-item">
                            <a class="nav-link" href="ConnectionServlet">Se connecter<span class="visually-hidden">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="CreateAccountServlet">Créer un compte</a>
                        </li>
                    </c:if>
                    <c:if test="true">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Mon profil</a>
                            <div class="dropdown-menu">
                                <a class="dropdown-item" href="#">Mes enchères</a>
                                <a class="dropdown-item" href="#">Mes articles</a>
                                <a class="dropdown-item" href="ProfilServlet">Voir mon profil</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="DisconnectServlet">Se déconnecter</a>
                            </div>
                        </li>
                    </c:if>
                </ul>
            </div>
        </div>
    </nav>
</header>
<main>
    <div class="container">
        <div class="container-fluid">
            <h3>Filtres : </h3>
            <div>
                <input type="radio" id="achats" value="achats">
                <label for="achats">Achats</label>
                <input type="checkbox" id="encheresOuvertes" value="encheresouvertes">
                <label for="encheresOuvertes">Enchères ouvertes</label>
                <input type="checkbox" id="encheresEnCours" value="encheresEnCours">
                <label for="encheresEnCours">Enchères en cours</label>
                <input type="checkbox" id="encheresRemportees" value="encheresRemportees">
                <label for="encheresRemportees">Enchères remportées</label>
            </div>
            <div>
                <input type="radio" id="ventes" value="ventes">
                <label for="ventes">Mes ventes</label>
                <input type="checkbox" id="ventesEnCours" value="ventesEnCours">
                <label for="ventesEnCours">Mes ventes en cours</label>
                <input type="checkbox" id="ventesNonDebutees" value="ventesNonDebutees">
                <label for="ventesNonDebutees">Ventes non débutées </label>
                <input type="checkbox" id="ventesTerminees" value="ventesTerminees">
                <label for="ventesTerminees">Ventes terminées</label>
            </div>
            <div>
                <select class="form-select" aria-label="Disabled select example" disabled>
                    <option selected>Catégories</option>
                    <option value="1">Toutes</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                </select>
            </div>
            <div>
                <span class="input-group-text" id="basic-addon1">@</span>
                <input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
            </div>
            <div class="d-grid gap-2">
                <button class="btn btn-primary" type="button">Rechercher</button>
            </div>
            <div class="card mb-3" style="max-width: 540px;">
                <div class="row g-0">
                    <div class="col-md-4">
                        <img src="..." class="img-fluid rounded-start" alt="...">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">PC Gamer pour travailler</h5>
                            <p class="card-text">Prix : 210 points   Classement : 2</p>
                            <p class="card-text"><small class="text-muted">Fin de l'enchère : date</small></p>
                            <p class="card-text">Retrait : Adresse</p>
                            <p class="card-text">jojo44</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</main>
<footer>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>