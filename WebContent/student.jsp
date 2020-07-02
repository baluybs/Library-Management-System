<!DOCTYPE html>
<html>
<head>
	<title>Student Login</title>
	<style type="text/css">
		body
		{
			font-size: 20px;
			background-color: lightgrey;
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
		.std
		{
			margin: auto;
			color: darkslategrey;
			margin-left: 90px;
		}
		header
		{
			text-align: center;
		}
	</style>
</head>
<body>
	<div>
		<header><h1>Student LogIn Page</h1></header>
	</div>
	<div class="std">
		<form action="stdlogin" method="post">
			<fieldset>
				<legend>Log In</legend>
				<h6>${responseMsg}</h6>
				<h6>${pwd}</h6>
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
						<td><a href="stdregister.jsp">Register</a></td>
						<td><input type="submit" name="submit" value="sunmit"></td>
					</tr>
				</table>
				<a href="pwd.jsp">forget password?</a>
			</fieldset>
		</form>
	</div>
</body>
</html>