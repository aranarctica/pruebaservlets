<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="modelo.*"%>
<%
	ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios");

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
  <h5 class="my-0 mr-md-auto font-weight-normal">Bienvenido ${sessionScope.usuarioLogueado.nombre}</h5></div>
	<h1>Lista de Usuarios java</h1>
	<hr>
	<br>


	<%
		for (Usuario usuario : usuarios) {
			out.println(usuario.getNombre() + "<br>");
		}
	%>

<button>Anadir<a href="anadirUsuarios.html"></a></button>


	<h1>Lista de Usuarios Jstl</h1>
	<hr>
	<br>

	<C:forEach items="${usuarios}" var="usuario">
	${usuario.nombre}<br>
	</C:forEach>


<a href="Logout">Salir</a>





</body>
</html>