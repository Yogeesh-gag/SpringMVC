<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter The Student Details</h1>
	<form action="add-student" method="post">
		<input type="number" placeholder="Enter the Student ID" name="studentId"> <br>
		<input type="text" placeholder="Enter the Student Name" name="studentName"> <br>
		<input type="text" placeholder="Enter the Student Email" name="studentEmail"><br>
		<input type="number" placeholder="Enter the Student Age" name="studentAge"> <br>
		<input type="text" placeholder="Enter the Student Course" name="studentCourse"><br>
		<input type="submit" value="ADD">
	</form>
</body>
</html>