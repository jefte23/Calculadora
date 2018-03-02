

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Subtracao
 */
@WebServlet("/Subtracao")
public class Subtracao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Subtracao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// recupera primeiro parametro
		int numero1 = Integer.parseInt(request.getParameter("numero1"));
		int numero2 = Integer.parseInt(request.getParameter("numero2"));

		//Calculadora entrada = new Calculadora(numero1, numero2);
		int resultado = numero1 - numero2;
		
		// pegar o writer do response
		PrintWriter out = response.getWriter();

		out.println("<html><heard><title>Calculadora</title></heard>");
		out.println("<body>");
		out.println(numero1 + " - " + numero2 + " = " + resultado);
				
		out.println("<body>");
		
	}

}
