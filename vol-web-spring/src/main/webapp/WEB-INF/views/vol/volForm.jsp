<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Vol"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition d'un vol</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>


	<div class="container">
		<header class="header">

			<h1>Edition de vol</h1>

		</header>

		<section>
			<form action="vol/save" method="post">
				<input type="hidden" name="action" value="save" /> <input
					type="hidden" name="id" id="id" value="${vol.id}" /> <input
					type="hidden" name="version" id="version" value="${vol.version}" />

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date de départ</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control" name="dtDepart"
							id="dtDepart" placeholder="La date de départ"
							value="${vol.dtDepart}" />
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date d'arrivée</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control" name="dtArrivee"
							id="dtArrivee" placeholder="La date d'arrivée"
							value="${vol.dtArrivee}" />
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Nombre de places</label>
					<div class="col-sm-10">
						<input type="number" step="1" class="form-control" name="nbPlace"
							id="nbPlace" placeholder="Nombre de places" required
							value="${monVol.nbPlace}" />
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Ouvert à la réservation</label>
					<div class="col-sm-10">
						<input type="number" step="1" class="form-control" name="ouvert"
							id="ouvert" placeholder="ON / OFF" required
							value="${monVol.ouvert}" />
					</div>
				</div>

				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="vol/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>