<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="styles.css">

</head>
<body>

 <h2>Formulario de Ingreso</h2>
    <form action="AgregarPlantas" method="POST">
        <label for="nombre">Nombre:</label><br>
        <input type="text" id="nombre" name="nombre" required maxlength="45"><br><br>
        
        <label for="estacion">Estación:</label><br>
        <input type="text" id="estacion" name="estacion" required maxlength="45"><br><br>
        
        <label for="separacion">Separación:</label><br>
        <input type="number" id="separacion" name="separacion" required><br><br>
        
        <input type="submit" value="Enviar">
    </form>
</body>
</html>