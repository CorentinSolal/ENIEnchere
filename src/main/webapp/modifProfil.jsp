<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Modifications du profil</title>
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
                            < class="form-control" id="credits">
                        </div>
                    </form>
                    <div class="d-grid gap-2 d-md-block mt-4">
                        <button class="btn btn-primary m-3" type="button">Save</button>
                        <button class="btn btn-primary m-3" type="button">Delete my account</button>
                        <button class="btn btn-primary m-3" type="button">Back</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous">
</body>
</html>
