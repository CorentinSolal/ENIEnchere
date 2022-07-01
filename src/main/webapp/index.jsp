<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ENI Enchères</title>
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
                        <a class="nav-link active" href="HomeServlet">Home
                            <span class="visually-hidden">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="BidListServlet">Enchères en cours</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ConnectionServlet">Se connecter</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CreateAccountServlet">Créer un compte</a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Mon profil</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Mes enchères</a>
                            <a class="dropdown-item" href="#">Mes articles</a>
                            <a class="dropdown-item" href="ProfilServlet">Voir mon profil</a>
                            <a class="dropdown-item" href="NewBidServlet">Ajouter un article</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Se déconnecter</a>
                        </div>
                    </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-sm-2" type="text" placeholder="Search">
                    <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
</header>
<main>
    <div class="container">
        <div class="container-fluid">
            <div class="row">
                <c:forEach var="article" items="${article}">
                    <div class="col-4">
                        <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
                            <div class="card-header">Enchère n° ${article.id}</div>
                            <div class="card-body">
                                <h4 class="card-title">${article.title}</h4>
                                <p class="card-text">Prix : ${article.prix} points</p>
                                <p class="card-text">Fin de l'enchère : ${article.dateFin}</p>
                                <p class="card-text">Retrait : </p>
                                <p class="card-text"> Vendeur : </p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="col-4">
                    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
                        <div class="card-header">Enchère n° ${article.id}</div>
                        <div class="card-body">
                            <h4 class="card-title">Article</h4>
                            <p class="card-text">Prix : ${article.prix} points</p>
                            <p class="card-text">Fin de l'enchère : ${article.dateFin}</p>
                            <p class="card-text">Retrait : </p>
                            <p class="card-text"> Vendeur :</p>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
                        <div class="card-header">Enchère n° ${article.id}</div>
                        <div class="card-body">
                            <h4 class="card-title">Article</h4>
                            <p class="card-text">Prix : ${article.prix} points</p>
                            <p class="card-text">Fin de l'enchère : ${article.dateFin}</p>
                            <p class="card-text">Retrait : </p>
                            <p class="card-text"> Vendeur :</p>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
                        <div class="card-header">Enchère n° ${article.id}</div>
                        <div class="card-body">
                            <h4 class="card-title">Article</h4>
                            <p class="card-text">Prix : ${article.prix} points</p>
                            <p class="card-text">Fin de l'enchère : ${article.dateFin}</p>
                            <p class="card-text">Retrait : </p>
                            <p class="card-text"> Vendeur :</p>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
                        <div class="card-header">Enchère n° ${article.id}</div>
                        <div class="card-body">
                            <h4 class="card-title">Article</h4>
                            <p class="card-text">Prix : ${article.prix} points</p>
                            <p class="card-text">Fin de l'enchère : ${article.dateFin}</p>
                            <p class="card-text">Retrait : </p>
                            <p class="card-text"> Vendeur :</p>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
                        <div class="card-header">Enchère n° ${article.id}</div>
                        <div class="card-body">
                            <h4 class="card-title">Article</h4>
                            <p class="card-text">Prix : ${article.prix} points</p>
                            <p class="card-text">Fin de l'enchère : ${article.dateFin}</p>
                            <p class="card-text">Retrait : </p>
                            <p class="card-text"> Vendeur :</p>
                        </div>
                    </div>
                </div>
                <div class="col-4">
                    <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
                        <div class="card-header">Enchère n° ${article.id}</div>
                        <div class="card-body">
                            <h4 class="card-title">Article</h4>
                            <p class="card-text">Prix : ${article.prix} points</p>
                            <p class="card-text">Fin de l'enchère : ${article.dateFin}</p>
                            <p class="card-text">Retrait : </p>
                            <p class="card-text"> Vendeur :</p>
                        </div>
                    </div>
                </div>
            </div>
            <div>
                <button type="submit" class="btn btn-primary" value="moreBid" style="align-content: center">Voir plus</button>
            </div>
        </div>
    </div>


</main>
<footer>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>