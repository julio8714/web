<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>Libros</h1> 
	 
		<form action="add" method="post">
			idLibro
			<input type="hidden" id="idLibro" name ="idLibro" value="${libro.idLibro}"/>
			<br/><br/>
			titulo
			<input type="text" id="titulo" name ="titulo" value="${libro.titulo}"/>
			<br/><br/>
			editorial
			<input type="text" id="editorial" name ="editorial" value="${libro.editorial}"/>
			<br/><br/>
			numPaginas
			<input type="number" id="numPaginas" name ="numPaginas" value="${libro.numPaginas}"/>
			<br/><br/>
			idioma
			<input type="text" id="idioma" name ="idioma" value="${libro.idioma}"/>
			<br/><br/>
			fechaPublicacion
			<input type="date" id="fechaPublicacion" name ="fechaPublicacion" value="${fn:substring(libro.fechaPublicacion,0,10)}"/>
			<br/><br/>
			fechaPublicacion
			<input type="text" id="descripcion" name ="descripcion" value="${libro.descripcion}"/>
			<br/><br/>
			tipoPasta
			<input type="text" id="tipoPasta" name ="tipoPasta" value="${libro.tipoPasta}"/>
			<br/><br/>
			isbn
			<input type="text" id="isbn" name ="isbn" value="${libro.isbn}"/>
			<br/><br/>
			numeroEjemplares
			<input type="number" id="numeroEjemplares" name ="numeroEjemplares" value="${libro.numeroEjemplares}"/>
			<br/><br/>
			portada
			<input type="text" id="portada" name ="portada" value="${libro.portada}"/>
			<br/><br/>
			presentacion
			<input type="text" id="presentacion" name ="presentacion" value="${libro.presentacion}"/>
			<br/><br/>
			precio
			<input type="number" step="any" id="precio" name ="precio" value="${libro.precio}"/>
			<br/><br/>
			categoria
			<select id= "idCategoria"name = "idCategoria">
				<c:forEach var= "item" items= "${categorias}"> 
					<option value= "${item.idCategoria}" >${item.categoria}</option>
				</c:forEach>
			
			</select>
			
			<%-- <input type="number" id="idCategoria" name ="idCategoria" value="${libro.categoria.idCategoria}"/> --%>
			<br/><br/>
			autor
			<select id= "idAutor"name= "idAutor">
			<c:forEach var= "item" items= "${autores}"> 
				<option value = "${item.idAutor}">${item.nombre} ${item.apellido }</option>
			</c:forEach>
			
			
			</select>
			<%-- <input type="number" id="idAutor" name ="idAutor" value="${libro.autor.idAutor}"/> --%>
			<br/><br/>
			<button type="submit">Guardar</button>
			<button type="button" onclick="window.location.href='/ismac-libreria-web/libros/findAll;return false;'">Cancelar</button>
			
		</form>

</body>
</html>