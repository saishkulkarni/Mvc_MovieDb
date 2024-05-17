<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h1>Login Page</h1>
		<h3 style="color: red">${failure}</h3>
		<form action="login" method="post">
			UserName: <input type="text" name="un"><br> <br>
			Password: <input type="text" name="pwd"><br> <br>
			<button>Login</button>
		</form>
	</div>
</body>
</html>