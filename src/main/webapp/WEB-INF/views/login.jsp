<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Olá mundo</h2>

	<span style="color: red">${msg}
	</span>
	<form action="/" method="POST">
		login: <input type="text" name="login"><br> <br>
		senha: <input type="password" name="senha"> <br> <br>
		<input type="submit" value="submit">
	</form>
	<br> Data/Hora: ${data }
</body>
</html>