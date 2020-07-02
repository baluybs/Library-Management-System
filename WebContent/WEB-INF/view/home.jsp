<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<style type="text/css">
		body
		{
			background-color: lightgrey;
		}
		.form
		{
			color: darkslategrey;
			margin-top: 200px;
			text-align: center;
			padding-left: 400px;
		}
		.header
		{
			text-align: center;
		}
		legend
		{
			border: 1px solid cyan;
			box-shadow: 0px 0px 10px deeppink;
			text-align: center;
		}
	</style>
</head>
<body>
	<div class="header">
		<header>
			<h1>Welcome to Library Management</h1>
		</header>
	</div>
	<hr>
	<div>
	<table class="form">
		<tr>
			<td>
				<fieldset>
					<legend>Student Section</legend>
					<h3>Click here to <a href="student.jsp">Student LogIn</a></h3>
				</fieldset>
			</td>
			<td>
				<fieldset>
					<legend>Library Section</legend>
					<h3>Click here to <a href="library.jsp">Librarian LogIn</a></h3>
				</fieldset>
			</td>
		</tr>
	</table>
	</div>
</body>
</html>