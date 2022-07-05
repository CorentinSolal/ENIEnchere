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
                        <div class="form-floating m-4">
                            <input type="text" class="form-control" id="floatingUsername" placeholder="Username" readOnly="${username}">
                            <label for="floatingUsername">User name</label>
                        </div>
                        <div class="form-floating  m-4">
                            <input type="text" class="form-control" id="floatingLastname" placeholder="Lastname" readOnly="${lastname}">
                            <label for="floatingLastname">Last name</label>
                        </div>
                        <div class="form-floating  m-4">
                            <input type="text" class="form-control" id="floatingFirstname" placeholder="firstname" readOnly="${firstname}">
                            <label for="floatingFirstname">First name</label>
                        </div>
                        <div class="form-floating  m-4">
                            <input type="text" class="form-control" id="floatingMail" placeholder="Mail" readOnly="${mail}">
                            <label for="floatingMail">Mail</label>
                        </div>
                        <div class="form-floating  m-4">
                            <input type="text" class="form-control" id="floatingPhone" placeholder="Phone" readOnly="${phone}">
                            <label for="floatingPhone">Phone number</label>
                        </div>
                        <div class="form-floating  m-4">
                            <input type="text" class="form-control" id="floatingStreet" placeholder="Street" readOnly="${street}">
                            <label for="floatingStreet">Street</label>
                        </div>
                        <div class="form-floating  m-4">
                            <input type="text" class="form-control" id="floatingZipCode" placeholder="ZipCode" readOnly="${zipcode}">
                            <label for="floatingZipCode">Zip Code</label>
                        </div>
                        <div class="form-floating  m-4">
                            <input type="text" class="form-control" id="floatingCity" placeholder="City" readOnly="${city}">
                            <label for="floatingCity">City</label>
                        </div>
                        <div class="btn-group btn-group-justified m-4">
                            <button class="btn btn-primary" type="button">Modify</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    </div>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>
