package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionCollaborateursController extends HttpServlet {

	// GET obtenir l'ID de session en regardant dans la requête
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Récupère la session
		HttpSession session = req.getSession(true);

		// Récupère le matricule de l'utilisateur
		String matriculeParam = (String) session.getAttribute("matricule");

		session.setAttribute("referer", req.getHeader("Referer"));
	}
}

// Vérifier que la session est bien associée à l'ID
// Si la session existe, obtenir les informations
