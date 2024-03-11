<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Libros</h1>
		<button><a href="${pageContext.request.contextPath}/libros/findOne?&opcion=1">Agregar</a></button>
	
	<table>
		<thead> 
			<tr> 
				<th>idLibro</th>
				<th>titulo</th>
				<th>editorial</th>
				<th>numPaginas</th>
				<th>edicion</th>
				<th>idioma</th>
				<th>fechaPublicacion</th>
				<th>descripcion</th>
				<th>tipoPasta</th>
				<th>isbn</th>
				<th>numeroEjemplares</th>
				<th>portada</th>
				<th>presentacion</th>
				<th>precio</th>
				<th>idCategoria</th>
				<th>idAutor</th>
				
				<th>Acciones</th>
			
			</tr>
	
		
		</thead>
		<tbody> 
			<c:forEach var="item" items="${libros}">
				<tr>
			
					<td>${item.titulo}</td>
					<td>${item.editorial}</td>
					<td>${item.idLibro}</td>
					<td>${item.numPaginas}</td>
					<td>${item.edicion}</td>
					<td>${item.idioma}</td>
					<td>${fn:substring(item.fechaPublicacion,0,11) }</td>
					<td>${item.descripcion}</td>
					<td>${item.tipoPasta}</td>
					<td>${item.isbn}</td>
					<td>${item.numeroEjemplares}</td>
					<td><img width="100" height="100" src="${pageContext.request.contextPath}/resources/img/${item.portada}"/></td>
					<td>${item.presentacion}</td>
					<td>${item.precio}</td>
					<td>${item.categoria.categoria}</td>
					<td>${item.autor.nombre}${item.autor.apellido}</td>
					
					
					
					<td>
					
						<button><a href="${pageContext.request.contextPath}/libros/findOne?idLibro=${item.idLibro}&opcion=1">Actualizar</a> </button>
						<button><a href="${pageContext.request.contextPath}/libros/findOne?idLibro=${item.idLibro}&opcion=2">Eliminar</a> </button>
					</td>
			
			
			 </tr>
			
			</c:forEach>
		
		
		</tbody>
	</table>

</body>
</html>