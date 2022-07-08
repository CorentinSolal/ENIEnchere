<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Modifications du profil</title>
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
                        <a class="nav-link" href="BidListServlet">Enchères en cours</a>
                    </li>
                    <c:if test="${!connected}">
                        <li class="nav-item">
                            <a class="nav-link" href="ConnectionServlet">Se connecter</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="CreateAccountServlet">Créer un compte</a>
                        </li>
                    </c:if>
                    <c:if test="${connected}">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true">Bonjour ${user.pseudo}</a>
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
                <div class="col-12">
                    <form action="" method="post">
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="username">User Name</label>
                            <input type="text" class="form-control" placeholder="User name" id="username">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="lastName">Last name</label>
                            <input type="text" class="form-control" placeholder="Last name" id="lastName">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="firstName">First name</label>
                            <input type="text" class="form-control" placeholder="First name" id="firstName">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="email">Email adress</label>
                            <input type="text" class="form-control" placeholder="email@example.com" id="email">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="phoneNumber">Enter your phone number</label>
                            <input type="tel" class="form-control" placeholder="Phone number" id="phoneNumber">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="street">Enter your street</label>
                            <input type="text" class="form-control" placeholder="Street" id="street">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="cpo">Post code</label>
                            <input type="text" class="form-control" placeholder="Post code" id="cpo">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="city">City</label>
                            <input type="text" class="form-control" placeholder="city" id="city">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="password">Password</label>
                            <input type="text" class="form-control" placeholder="Password" id="password">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="confirm">Confirm Password</label>
                            <input type="text" class="form-control" placeholder="Confirm Password" id="confirm">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="credits">Credits</label>
                            <input class="form-control" id="credits" placeholder="Credits" readonly="${user.credit}">
                        </div>
                    </form>
                    <div class="d-grid gap-2 d-md-block mt-4">
                        <button class="btn btn-primary m-3" type="submit">Save</button>
                        <button class="btn btn-primary m-3" type="buttonDelete">Delete my account</button>
                        <button class="btn btn-primary m-3" type="buttonBack">Back</button>
                    </div>
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
                <p>3 collaborateurs en
                    charge de créer<br>
                    des sites pour des
                    clients exigeants.<br>
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
