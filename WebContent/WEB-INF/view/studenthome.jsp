<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home</title>
<style type="text/css">
		form
		{
			float: right;
		}
</style>
</head>
<body>
<h1 style="color:red">${responseMsg}</h1><br>
<a href="stdupdate.jsp">Update</a>
<br><br>
<form action="det" method="post">
	<input type="submit" name="BookDetails" value="BookDetails">
</form>
<h3>Book Details:${bookMsg}</h3>
</body>
</html>