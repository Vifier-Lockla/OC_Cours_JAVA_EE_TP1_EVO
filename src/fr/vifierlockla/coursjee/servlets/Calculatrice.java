package fr.vifierlockla.coursjee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.vifierlockla.coursjee.beans.Calcul;

/**
 * Servlet implementation class Calculatrice
 */
@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculatrice() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Passage par doGet()"); //-- On en passera qu'une fois ici et notamment au démarrage du serveur.
		
		//-- On veut initialiser les champs de la page (nombre1 , operation, nombre2, resultat)
		Calcul calcul = new Calcul();
		request.setAttribute("calcul", calcul);
		
		//-- On génére la page que l'utilisateur verra pour la première fois.
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Passage par doPost()"); //-- On doit passer ici à chaque demande de calcul
		
		//-- On récupère les entrées utilisateur et on caclule le résultat
		Calcul calcul = new Calcul();
		try {
			calcul.setNombre1( Integer.valueOf((String)request.getParameter("number1")) );
		}
		catch (NumberFormatException e) {
			calcul.setNombre1(0);
			System.out.println(e.getMessage());
		}

		try {
			calcul.setNombre2( Integer.valueOf((String)request.getParameter("number2")) );
		}
		catch (NumberFormatException e) {
			calcul.setNombre2(0);
			System.out.println(e.getMessage());
		}

		//-- Calcul
		calcul.setOperation( (String)request.getParameter("operation") );
		try {
			calcul.calcResultat();
		}
		catch (ArithmeticException e) {
			request.setAttribute("erreur", "divzero");
			System.out.println(e.getMessage());
		}

		request.setAttribute("calcul", calcul);
		
		//-- On renvoit le résultat à l'écran (la page gère la persistance de ce que l'utilisateur a demandé comme calcul grâce au Bean)
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

	}

}
