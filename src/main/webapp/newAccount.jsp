<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Connexion</title>
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
                <div class="col-lg-12">
                    <form action="CreateAccountServlet" method="post">
                        <fieldset>
                            <div class="form-group m-4">
                                <h2 class="m-5" style="text-align:center">Créer un compte</h2>

                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="username" name="username">
                                    <label>Username</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="name" name="lastName">
                                    <label>Last Name</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="first name" name="firstName">
                                    <label>First name</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="phoneNumber" name="phoneNumber">
                                    <label>Phone number</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="email" class="form-control" placeholder="name@example.com" name="email" >
                                    <label>Email address</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="password" class="form-control" placeholder="Password" name="password" >
                                    <label>Password</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="street" name="street">
                                    <label>Street</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="postalCode" name="postalCode">
                                    <label>Postal Code</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="city" name="city">
                                    <label >City</label>
                                </div>
                            <button type="submit" class="btn btn-primary m-5">Submit</button>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</main>
</body>
</html>
