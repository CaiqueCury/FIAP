<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Calculadora ex2</title>
</head>
<body>
<form action="/CalculadoraServlet" method="post">
	<label>Numero 1: </label>
	<input type="text" name="numero1">
	<label>Numero 2: </label>
	<input type="text" name="numero2">
	<label>Operação: </label>
	<select name="operacao">
		<option>Somar</option>
		<option>Subtrair</option>
		<option>Multiplicar</option>
		<option>Dividir</option>
	</select><br>
	<input type="submit" value="Calcular" >
</form>
</body>
</html>