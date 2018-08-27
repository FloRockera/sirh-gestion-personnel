package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {

	// Récupération du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// EXAMPLE 2 JSP
		// // Utilisation du service
		// List<Collaborateur> collaborateurs =
		// collabService.listerCollaborateurs();
		//
		// req.setAttribute("listeNoms", Arrays.asList("Robert", "Jean",
		// "Hugues"));
		// req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req,
		// resp);

		// EXEMPLE 1 JSP
		// req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req,
		// resp);

		// EXEMPLE 1 SANS JSP
		// // récupère la valeur d'un paramètre dont le nom est avec Photo
		// String avecPhotoParam = req.getParameter("avecPhoto");
		//
		// // récupère la valeur d'un paramètre dont le nom est département
		// String departementParam = req.getParameter("departement");
		// resp.setContentType("text/html");
		//
		// // code HTML écrit dans le corps de la réponse
		// resp.getWriter().write("<h1>Liste des collaborateurs</h1>" + "<ul>" +
		// "<li>avecPhoto" + avecPhotoParam + "</li>"
		// + "<li>departement=" + departementParam + "</li>" + "<ul>");

	}

}
