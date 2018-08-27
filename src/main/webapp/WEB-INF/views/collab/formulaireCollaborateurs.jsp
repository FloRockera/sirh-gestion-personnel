<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf8">
<title>Collaborateurs</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>


<script>
	// Example starter JavaScript for disabling form submissions if there are invalid fields
	(function() {
		'use strict';
		window.addEventListener('load', function() {
			// Fetch all the forms we want to apply custom Bootstrap validation styles to
			var forms = document.getElementsByClassName('needs-validation');
			// Loop over them and prevent submission
			var validation = Array.prototype.filter.call(forms, function(form) {
				form.addEventListener('submit', function(event) {
					if (form.checkValidity() === false) {
						event.preventDefault();
						event.stopPropagation();
					}else{
						event.preventDefault();
						event.stopPropagation();
						$("#validation").modal('show');
					}
					form.classList.add('was-validated');
				}, false);
			});
		}, false);
	})();
</script>


</head>

<body>


	<!-- Formulaire -->
	<div class="container">
		<h2>Nouveau collaborateur</h2>

		<!-- Formulaire d'ajout d'un nouveau collaborateur -->
		<form method="post" action="collaborateurs/ajouter" id="CreationNouveauCollab" class="needs-validation" novalidate>
			<div class="form-row">

				<!-- Saisir le nom -->
				<div class="col-md-4 mb-3">
					<label for="validationNom">Nom</label> <input type="text"
						class="form-control" id="validationNom" placeholder="nom"
						required>
					<div class="invalid-feedback">Le nom est obligatoire</div>
				</div>

				<div class="w-100"></div>

				<!-- Saisir le prénom -->
				<div class="col-md-4 mb-3">
					<label for="validationPrenom">Prénom</label> <input type="text"
						class="form-control" id="validationPrenom" placeholder="prénom"
						required>
					<div class="invalid-feedback">Le prénom est obligatoire</div>
				</div>

				<div class="w-100"></div>

				<!-- Saisir la date de naissance -->
				<div class="col-md-4 mb-3">
					<label for="validationNaissance">Date de naissance</label> <input
						type="date" class="form-control" id="validationNaissance"
						placeholder="date de naissance" required>
					<div class="invalid-feedback">La date de naissance est
						obligatoire</div>
				</div>


				<div class="w-100"></div>

				<!-- Saisir l'adresse -->
				<div class="col-md-4 mb-3">
					<label for="validationAdresse">Adresse</label> <input type="text"
						class="form-control" id="validationAdresse" placeholder="adresse"
						required>
					<div class="invalid-feedback">L'adresse est obligatoire</div>
				</div>

				<div class="w-100"></div>


				<!-- Saisir le numéro de sécurité sociale -->
				<div class="col-md-4 mb-3">
					<label for="validationSecu">Numéro de sécurité sociale</label>
					<input type="number" class="form-control" id="validationSecu"
						placeholder="x xx xx xx xxx xxx xx" required>
					<div class="invalid-feedback">Le numéro de sécurité sociale
						est obligatoire</div>
				</div>

				<div class="w-100"></div>

			</div>


			<!-- Button trigger modal -->
			<button type="submit" class="btn btn-primary" data-toggle="modal"
				data-target="#exampleModal">Créer</button>

		</form>
	</div>


	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true" data-show="false">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Création d'un
						collaborateur</h5>
					<div class="w-100"></div>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">Vous êtes sur le point de créer un nouveau collaborateur</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Fermer</button>
					<button type="button" class="btn btn-primary" onclick="document.getElementById('CreationNouveauCollab').submit()">Valider</button>
				</div>  
			</div>
		</div>
	</div>

<%
String prenomParam = req.getParameter("prenom");
%>


</body>
</html>