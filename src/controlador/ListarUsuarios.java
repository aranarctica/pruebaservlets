package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;
import modelo.UsuarioModelo;

public class ListarUsuarios extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// recibir datos
		// String nombreUsuario = request.getParameter("nombre");
		HttpSession session = request.getSession();
		Usuario usuarioLogeado = (Usuario)session.getAttribute("usuarioLogeado");
		
		if(usuarioLogeado != null){
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

			UsuarioModelo usuarioModelo = new UsuarioModelo();
			
			usuarios= usuarioModelo.selectAll();
			
			
			// enviar datos
			request.setAttribute("usuarios", usuarios);

			RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
			// responde a listausuarios.jsp
			rd.forward(request, response);
		}else{
		RequestDispatcher rd = request.getRequestDispatcher("adios.html");
		// responde a listausuarios.jsp
		rd.forward(request, response);
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// recibir datos
		String nombreUsuario = request.getParameter("nombre");
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		Usuario usuario = new Usuario();
		usuario.setNombre("Itziar");
		usuarios.add(usuario);
		usuario = new Usuario();
		usuario.setNombre("Maria");
		usuarios.add(usuario);
		usuario = new Usuario();
		usuario.setNombre(nombreUsuario);
		usuarios.add(usuario);
		
		// enviar datos
		request.setAttribute("usuarios", usuarios);

		RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
		// responde a listausuarios.jsp
		rd.forward(request, response);

	}
	
	
	

}
