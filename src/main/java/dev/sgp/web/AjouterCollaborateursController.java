package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjouterCollaborateursController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/collab/formulaireCollaborateurs.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// // récupération

		String prenomParam = req.getParameter("prenom");
		resp.setContentType("text/html");
		resp.getWriter().write("<p>Prénom </p>" + prenomParam);

		String nomParam = req.getParameter("nom");
		resp.setContentType("text/html");
		resp.getWriter().write("<p>Nom </p>" + nomParam);

		// Parser la date
		// LocalDate dateNaissanceParam = req.getParameter("dateNaissance");
		// System.out.println("Date de naissance : " + dateNaissanceParam);

		String adresseParam = req.getParameter("adresse");
		resp.setContentType("text/html");
		resp.getWriter().write("<p>Adresse </p>" + adresseParam);

		String numeroSecuParam = req.getParameter("numeroSecu");
		resp.setContentType("text/html");
		resp.getWriter().write("<p>Numéro de sécurité sociale :  </p>" + numeroSecuParam);

		String emailProParam = prenomParam + "." + nomParam + "@societe.com";
		resp.setContentType("text/html");
		System.out.println("<p>Email créé :  </p>" + emailProParam);

	}
}