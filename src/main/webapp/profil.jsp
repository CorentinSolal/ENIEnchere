<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Mon profil</title>
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
                    <c:if test="${connected.equals(\"false\")}">
                        <li class="nav-item">
                            <a class="nav-link" href="ConnectionServlet">Se connecter<span class="visually-hidden">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="CreateAccountServlet">Créer un compte</a>
                        </li>
                    </c:if>
                    <c:if test="${connected.equals(\"true\")}">
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
            <div class="row">
                <div class="col-12">
                    <form action="" method="post">
                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="userNameInput">Username</label>
                                <input class="form-control" id="userNameInput" type="text" placeholder="Username input here..." username="${userName}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="username" class="form-control" id="floatingUsername" placeholder="Username">
                            <label for="floatingUsername">Username</label>
                        </div>

                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="lastNameInput">Lastname</label>
                                <input class="form-control" id="lastNameInput" type="text" placeholder="Lastname input here..." lastname="${lastName}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="lastname" class="form-control" id="floatingLastname" placeholder="Lastname">
                            <label for="floatingLastname">Lastname</label>
                        </div>

                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="firstNameInput">Firstname</label>
                                <input class="form-control" id="firstNameInput" type="text" placeholder="Firstname input here..." firstname="${firstName}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="firstname" class="form-control" id="floatingFirstname" placeholder="firstname">
                            <label for="floatingFirstname">Firstname</label>
                        </div>

                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="mailInput">Mail</label>
                                <input class="form-control" id="mailInput" type="text" placeholder="Mail input here..." mail="${mail}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="mail" class="form-control" id="floatingMail" placeholder="Mail">
                            <label for="floatingMail">Mail</label>
                        </div>

                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="phoneInput">Phone</label>
                                <input class="form-control" id="phoneInput" type="number" placeholder="Phone input here..." phone="${phone}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="number" class="form-control" id="floatingPhone" placeholder="Phone">
                            <label for="floatingPhone">Phone</label>
                        </div>

                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="StreetInput">Street</label>
                                <input class="form-control" id="StreetInput" type="text" placeholder="Street input here..." street="${street}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="street" class="form-control" id="floatingStreet" placeholder="Street">
                            <label for="floatingStreet">Street</label>
                        </div>

                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="zipCodeInput">ZipCode</label>
                                <input class="form-control" id="zipCodeInput" type="number" placeholder="ZipCode input here..." zipCode="${zipCode}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="number" class="form-control" id="floatingZipCode" placeholder="ZipCode">
                            <label for="floatingZipCode">ZipCode</label>
                        </div>

                        <div class="form-group">
                            <fieldset>
                                <label class="form-label mt-4" for="cityInput">City</label>
                                <input class="form-control" id="cityInput" type="text" placeholder="City input here..." city="${city}">
                            </fieldset>
                        </div>
                        <div class="form-floating">
                            <input type="city" class="form-control" id="floatingCity" placeholder="City">
                            <label for="floatingCity">City</label>
                        </div>
                    </form>

                    <div class="btn-group btn-group-justified">
                        <button type="button" class="btn btn-outline-primary">Modify</button>
                    </div>

                </div>
            </div>
        </div>
    </div>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>
