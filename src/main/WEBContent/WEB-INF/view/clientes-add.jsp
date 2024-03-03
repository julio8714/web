<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>clientes </h1>
	
<form action="add" method="post">
			<!-- idCliente -->
			<input type="hidden" id= "idCliente" name="idClinete" value="${cliente.idCliente}">
			<br/><br/>
			cedula
			<input type="text" id="cedula" name="cedula" value="${cliente.cedula}">
			<br/><br/>
			nombre
			<input type="text" id="nombre" name="nombre" value="${cliente.nombre}">
			<br/><br/>
			apellido
			<input type="text" id="apellido" name="apellido" value="${cliente.apellido}">
			<br/><br/>
			direcion
			<input type="text" id="direcion" name="direcion" value="${cliente.direcion}">
			<br/><br/>
			telefono
			<input type="text" id="telefono" name="telefono" value="${cliente.telefono}">
			<br/><br/>
			correo	
			<input type="email" id="correo" name="correo" value="${cliente.correo}">
			<br/><br/>
			<button type="submit">Guardar</button>
			<button type="button" onclick="window.location.href='/ismac-libreria-web/clientes/findAll;return false;'">Cancelar</button>
</form>


</body>
</html>