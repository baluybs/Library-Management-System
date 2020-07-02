<!DOCTYPE html>
<html>
<head>
	<title>Librarian Login</title>
	<style type="text/css">
		body
		{
			font-size: 20px;
			background-color: lightgrey;
		}
		header
		{
			text-align: center;
		}
		fieldset
		{
			width: 30%;
		}
		form
		{
			padding-left: 35%;
		}
		legend
		{
			text-align: center;
			border: 1px solid green;
			padding: 5px;
			border-radius: 10px;
			box-shadow: 0px 0px 10px violet;
		}
		.lib
		{
			margin: auto;
			margin-left: 90px;
		}
	</style>
</head>
<body>
	<div>
		<header><h1>Librarian LogIn Page</h1></header>
	</div>
	<div class="lib">
		<form action="liblogin" method="post">
			<fieldset>
			<h6>${responseMsg}</h6>
				<legend>Log In</legend>
				<table>
					<tr>
						<td><label>Email</label></td>
						<td><input type="email" name="email" placeholder="Enter email id" required="required"></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><input type="password" name="password" placeholder="Enter Password" required="required"></td>
					</tr>
					<tr>
						<td><a href="libregister.jsp">Register</a></td>
						<td><input type="submit" name="submit" value="sunmit"></td>
					</tr>
				</table>
				<a href="pwd.jsp">forget password?</a>
			</fieldset>
		</form>
	</div>
</body>
</html>