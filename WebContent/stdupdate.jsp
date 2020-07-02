<!DOCTYPE html>
<html>
<head>
	<title>Update Details</title>
	<style type="text/css">
		body
		{
			font-size: 20px;
		}
		fieldset
		{
			width: 40%;
		}
		form
		{
			padding-left: 35%;
		}
		legend
		{
			text-align: center;
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
		<form action="stdupdate" method="post">
			<fieldset>
					<legend>Update Form</legend>
					<table>
						<tr><td><label>Name</label></tr>
						<tr><td><input type="text" name="name" value="${dto.name}"></td></tr>
						<tr><td><label>Email</label></tr>
						<tr><td><input type="email" name="email" value="${dto.email}" readonly="readonly"></td></tr>
						<tr><td><label>Password</label></tr>
						<tr><td><input type="password" name="password" value="${dto.password}"></td></tr>
						<tr><td><label>Contact Number</label></tr>
						<tr><td><input type="tel" name="number" value="${dto.number}"></td></tr>
						<tr><td><label>Department</label></tr>
						<tr><td><input type="text" name="department" value="${dto.department}" readonly="readonly"></td></tr>
						<tr><td><label>City</label></tr>
						<tr><td><input type="text" name="city" value="${dto.city}"></td></tr>
						<tr><td><input type="submit" name="update" value="Update"></td></tr>
					</table>
			</fieldset>
		</form>
	</div>
</body>
</html>