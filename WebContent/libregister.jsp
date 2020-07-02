<!DOCTYPE html>
<html>
<head>
	<title>Library Registration</title>
	<style type="text/css">
		body
		{
			font-size: 20px;
			background-color: lightgrey;
			color: blue;
		}
		fieldset
		{
			width: 40%;
			border:2px solid red;
			border-radius: 10px 0px 10px 0px;
		}
		form
		{
			padding-left: 35%;
		}
		legend
		{
			text-align: center;
			padding: 5px;
			border:1px solid deeppink;
			box-shadow: 0px 0px 10px violet;
			border-radius: 10px;
		}
		div
		{
			margin: 200px;
			margin-top: 60px
		}
	</style>
</head>
<body>
	<div>
		<form action="libregister" method="post">
			<fieldset>
					<legend>Librarian Register Form</legend>
					<table>
						<tr><td><label>Name</label></tr>
						<tr><td><input type="text" name="name" placeholder="Enter Name" required="required"></td></tr>
						<tr><td><label>Email</label></tr>
						<tr><td><input type="email" name="email" placeholder="Enter Email" required="required"></td></tr>
						<tr><td><label>Password</label></tr>
						<tr><td><input type="password" name="password" placeholder="Enter Password" required="required"></td></tr>
						<tr><td><label>Contact Number</label></tr>
						<tr><td><input type="number" name="number" placeholder="Enter Number"></td></tr>
						<tr><td><label>Department</label></tr>
						<tr><td><input type="text" name="department" placeholder="Library"></td></tr>
						<tr><td><label>City</label></tr>
						<tr><td><input type="text" name="city" placeholder="Enter City"></td></tr>
						<tr><td><input type="submit" name="Register"></td></tr>
					</table>
			</fieldset>
		</form>
	</div>
</body>
</html>