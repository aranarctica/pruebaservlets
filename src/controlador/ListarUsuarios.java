package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;

public class ListarUsuarios extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// recibir datos
		String nombreUsuario = request.getParameter("nombre");
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		Usuario usuario = new Usuario();
		usuario.setNombre("Xabi");
		usuarios.add(usuario);
		usuario = new Usuario();
		usuario.setNombre("Aitor");
		usuarios.add(usuario);
//		usuario = new Usuario();
//		usuario.setNombre(nombreUsuario);
//		usuarios.add(usuario);
		
		// enviar datos
		request.setAttribute("usuarios", usuarios);

		RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
		// responde a listausuarios.jsp
		rd.forward(request, response);

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