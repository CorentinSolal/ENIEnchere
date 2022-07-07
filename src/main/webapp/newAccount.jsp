<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Connexion</title>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
            <img src="images/logo_ENI_global_BLANC.png" alt="logo-ENI-global-BLANC">

            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="HomeServlet"><h2>ENI Enchères</h2></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="BidListServlet"><h4>Enchères en cours</h4></a>
                    </li>
                    <c:if test="${!connected}">
                        <li class="nav-item">
                            <a class="nav-link" href="ConnectionServlet"><h4>Se connecter</h4></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="CreateAccountServlet"><h4>Créer un compte</h4></a>
                        </li>
                    </c:if>
                    <c:if test="${connected}">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true"><h4>Bonjour ${user.pseudo} </h4> </a>
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
            <div class="row">
                <div class="col-lg-12">
                    <form action="CreateAccountServlet" method="post">
                        <fieldset>
                            <div class="form-group m-4">
                                <h2 class="m-5" style="text-align:center">Créer un compte</h2>
                                <div class="form-floating m-4">
                                    <input type="text" class="form-control" placeholder="username" name="username">
                                    <label>Username</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="text" class="form-control" placeholder="name" name="lastName">
                                    <label>Last Name</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="text" class="form-control" placeholder="first name" name="firstName">
                                    <label>First name</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="text" class="form-control" placeholder="phoneNumber" name="phoneNumber">
                                    <label>Phone number</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="email" class="form-control" placeholder="name@example.com" name="email" >
                                    <label>Email address</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="password" class="form-control" placeholder="Password" name="password" >
                                    <label>Password</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="text" class="form-control" placeholder="street" name="street">
                                    <label>Street</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="text" class="form-control" placeholder="postalCode" name="postalCode">
                                    <label>Postal Code</label>
                                </div>
                                <div class="form-floating m-4">
                                    <input type="text" class="form-control" placeholder="city" name="city">
                                    <label >City</label>
                                </div>
                                <div class="btnSubmit">
                                <button type="submit" class="btn btn-primary m-4">Submit</button>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>>
</body>
</html>
