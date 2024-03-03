<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<input type="date" id="fechaPublicacion" name ="fechaPublicacion" value="${libro.fechaPublicacion}"/>
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
			<input type="number" step="any" id="precio" name ="idLibro" value="${libro.precio}"/>
			<br/><br/>
			categoria
			<input type="hidden" id="idCategoria" name ="idCategoria" value="${libro.idCategoria}"/>
			<br/><br/>
			sutor
			<input type="hidden" id="idAutor" name ="idAutor" value="${libro.idAutor}"/>
			<br/><br/>
			
		</form>

</body>
</html>