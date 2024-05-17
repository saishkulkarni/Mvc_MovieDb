<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Movie</title>
</head>
<body>
	<div align="center">
		<h1>Add Movie</h1>
		<form action="insert-movie" method="post">
			Movie Name: <input type="text" name="name" required><br>
			Movie Language: <select name="language" required="required">
				<option disabled selected value=>Select a Language</option>
				<option>Kannada</option>
				<option>English</option>
				<option>Hindi</option>
			</select><br> Rating: <input type="text" name="rating"><br>
			Image: <input type="file" name="picture" required="required"><br>
			Genre: <select name="genre" required="required">
				<option disabled selected value=>Select a Genre</option>
				<option>Horror</option>
				<option>Comedy</option>
				<option>Action</option>
				<option>Thriller</option>
			</select><br> <br>
			<button>Add</button>
		</form>
	</div>
</body>
</html>