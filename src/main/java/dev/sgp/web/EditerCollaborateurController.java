package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// récupère le matricule
		String matriculeParam = req.getParameter("matricule");
		if (StringUtils.isBlank(matriculeParam)) {
			resp.sendError(400, "Un matricule est attendu");
		} else {
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>Liste des collaborateurs</h1>" + matriculeParam);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String msgErreur = "Les paramètres suivants sont incorrects :";
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");

		if (StringUtils.isBlank(matriculeParam) || StringUtils.isBlank(titreParam) || StringUtils.isBlank(nomParam)
				|| StringUtils.isBlank(prenomParam)) {

			if (StringUtils.isBlank(matriculeParam)) {
				msgErreur += "matricule";
			}

			if (StringUtils.isBlank(titreParam)) {
				msgErreur += "titre";
			}

			if (StringUtils.isBlank(nomParam)) {
				msgErreur += "nom";
			}

			if (StringUtils.isBlank(prenomParam)) {
				msgErreur += "prenom";
			}
			resp.sendError(400, msgErreur);

		} else {
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter()
					.write("<html><head><meta charset=\"utf-8\" /></head><body><h1>Editer des collaborateurs</h1>"
							+ "<p>Création d'un coolaborateur avec les information suivantes :<p>" + "<ul>"
							+ "<li>matricule =" + matriculeParam + "</li>" + "<li>titre =" + titreParam + "</li>"
							+ "<li>nom =" + nomParam + "</li>" + "<li>prenom =" + prenomParam + "</li>"
							+ "</ul></body></html>");
			resp.setStatus(201);
		}

	}
}
