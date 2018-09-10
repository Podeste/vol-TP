<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Connexion</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

			<h1>Connexion à votre espace personnel</h1>

		</header>

		<section>
			<form method="post">
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Nom d'Utilisateur</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="username"
							placeholder="Username" />
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Mot de passe</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="password"
							placeholder="Password" />
					</div>
				</div>
				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Connexion</button>
					</div>
					<div class="col-sm-3">
						<a href="home/homeForm" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>