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
                            <label class="col-form-label m-4" for="username">User Name</label>
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
                        <div class="form-floating mb-3">
                            <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
                            <label for="floatingInput">Email address</label>
                        </div>
                        <div class="form-group">
                            <label class="col-form-label mt-4" for="phoneNumber">Enter your phone number</label>
                            <input type="tel" class="form-control" placeholder="Phone number" id="phoneNumber">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label m-4" for="street">Enter your street</label>
                            <input type="text" class="form-control" placeholder="Street" id="street">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label m-4" for="cpo">Post code</label>Post code</label>
                            <input type="text" class="form-control" placeholder="Street" id="cpo">
                        </div>
                        <div class="form-group">
                            <label class="col-form-label m-4" for="city">City</label>
                            <input type="text" class="form-control" placeholder="city" id="city">
                        </div>
                        <div class="form-floating">
                            <input type="password" class="form-control" id="floatingPassword" placeholder="Password">
                            <label for="floatingPassword">Password</label>
                        </div>
                        <div class="form-floating">
                            <input type="password" class="form-control" id="confirmPassword">
                            <label for="confirmPassword">Confirm</label>
                        </div>
                        <div class="form-group row">
                            <label for="credits" class="col-sm-2 col-form-label">Credits</label>
                            <div class="col-sm-10">
                                <input type="text" readonly="" class="form-control-plaintext" id="credits">
                            </div>
                        </div>
                    </form>
                    <div class="btn-group btn-group-justified">
                        <button type="submit" class="btn btn-primary">Save</button>
                        <button type="button" class="btn btn-primary">Delete my account</button>
                        <button type="button" class="btn btn-primary">Back</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>

</body>
</html>
