<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div align="center">
	<h3 style="color: green">${success}</h3>
	<h3 style="color: red">${failure}</h3>
		<h1>Movies Collection</h1>
		<a href="insert-movie"><button>Add Movie</button></a><br><br>
		<a href="fetch-movies"><button>View All Movies</button></a><br><br>
		<a href="fetch-movies-id"><button>View Movie By Id</button></a><br><br>
		<a href="fetch-movies-name"><button>View Movie By Name</button></a><br><br>
		<a href="fetch-movies-rating"><button>View Movie By Rating</button></a><br><br>
		<a href="fetch-movies-language"><button>View Movie By Language</button></a><br><br>
		<a href="fetch-movies-genre"><button>View Movie By Genre</button></a><br><br>
		<a href="logout"><button>Logout</button></a><br><br>
	</div>
</body>
</html>