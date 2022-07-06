<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
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
                                <a class="dropdown-item" href="NewBidServlet">Ajouter un article</a>
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
            <div class="row" name="Filtres">
                <div class="col-12">
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
                </div>
            </div>
            <c:forEach var="article" items="${article}">
                <div class="col-4">
                    <a href="BidDetailsServlet">
                        <div class="card text-white bg-primary m-3 cardbis" style="max-width: 20rem;">
                            <div class="card-header">Enchère n° ${article.idArt}</div>
                            <div class="row ">
                                <div class="col-6">
                                    <img src="${article.imageUrl}"  width="100%" height="100%" >

                                </div>
                                <div class="card-body col-6 " >
                                    <h4 class="card-title">${article.nameArt}</h4>
                                    <p class="card-text">${article.descArt}</p>
                                    <p class="card-text">Prix : ${article.startPrice} points</p>
                                    <p class="card-text">Fin de l'enchère : ${article.dateEnd}</p>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>

</main>
<footer>
    <div class="container footer-content">
    <div class="container-fluid">
        <div class="row">
            <div class="pres col-4" >
                <h4>L'agence</h4>
                <p>Qui sommes nous ?</p>
                <p>3 stagiaires en
                    charge de créer<br>
                    des sites pour des
                    clients exigeant.<br>
                    Une agence pleine de bonne volonté<br>
                    et de jeunes talents !</p>
            </div>
            <div class="col-4">

                <p>Localisation :</p>
                <p>3, Rue Michael Faraday,</p>
                <p>44800 Saint-Herblain</p>
            </div>
            <div class="clot col-4">
                <a class="link" href="https://www.hervecuisine.com/recette/recette-pizza-hawaienne-ananas/"> <p>Nous contacter</p> </a>
                <p>Conditions d'utilisations</p>
                <a class="link" href="https://www.youtube.com/watch?v=dQw4w9WgXcQ"> <p>ENI Ecole</p> </a>
                &copy Copyright
            </div>
        </div>
    </div>
    </div>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>