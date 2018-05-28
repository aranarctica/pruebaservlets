package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;

public class Logear extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String contrasena = request.getParameter("contrasena");
		// si usuario y contraseña estan bien
		if (nombre.equals("zubiri") && (contrasena.equals("manteo"))) {
			//iniciar sesion
			
			Usuario usuarioLogeado = new Usuario();
			usuarioLogeado.setNombre("zubiri");
			
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogeado", usuarioLogeado);
			
			// enviar a listar
			response.sendRedirect("ListarUsuarios");
			
		} else {
			// agur
			RequestDispatcher rd = request.getRequestDispatcher("adios.html");
			rd.forward(request, response);
		}

	}
}
