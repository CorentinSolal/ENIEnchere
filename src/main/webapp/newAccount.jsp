<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                    <li class="nav-item">
                        <a class="nav-link" href="ConnectionServlet">Se connecter</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="CreateAccountServlet">Créer un compte<span class="visually-hidden">(current)</span></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Mon profil</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Mes enchères</a>
                            <a class="dropdown-item" href="#">Mes articles</a>
                            <a class="dropdown-item" href="ProfilServlet">Voir mon profil</a>
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
                <div class="col-lg-12">
                    <form action="CreateAccountServlet" method="post">
                        <fieldset>
                            <div class="form-group m-4">
                                <h2 class="m-5" style="text-align:center">Créer un compte</h2>

                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="pseudo" id="pseudo">
                                    <label  for="pseudo">Pseudo</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="name" id="lastName">
                                    <label for="lastName">Last Name</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="first name" id="firstName">
                                    <label for="firstName">First name</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="phoneNumber" id="phoneNumber">
                                    <label for="phoneNumber">Phone number</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="email" class="form-control" id="email" placeholder="name@example.com">
                                    <label for="email">Email address</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="password" class="form-control" id="password" placeholder="Password">
                                    <label for="password">Password</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="street" id="street">
                                    <label for="street">Street</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="postalCode" id="postalCode">
                                    <label for="postalCode">Postal Code</label>
                                </div>
                                <div class="form-floating m-5">
                                    <input type="text" class="form-control" placeholder="city" id="city">
                                    <label for="city">City</label>
                                </div>
                            </div>
                            <button type="submit" class="btn btn-primary" style="margin-top: 20px">Submit</button>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</main>
</body>
</html>
