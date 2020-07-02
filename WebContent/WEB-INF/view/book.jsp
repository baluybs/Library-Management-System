<!DOCTYPE html>
<html>
<head>
	<title>Book Entry</title>
</head>
<body>
	<div>
		<form action="book" method="post">
			<fieldset>
			<h1>${bookMsg}</h1>
				<legend>Book Entry Form</legend>
				<table>
					<tr>
						<td><label>Enter Student Id:</label></td>
						<td><label>Enter Book Name:</label></td>
						<td><label>Enter Book author:</label></td>
						<td><label>Enter Reference Number:</label></td>
					</tr>
					<tr>
						<td><input type="text" name="studentid"></td>
						<td><input type="text" name="bookname"></td>
						<td><input type="text" name="author"></td>
						<td><input type="number" name="number"></td>
						<td><input type="submit" name="add" value="Add"></td>
					</tr>
				</table>
			</fieldset>
		</form>
	</div>
</body>
</html>