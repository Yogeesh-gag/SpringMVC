<%@page import="com.jsp.spring_mvc_studentdb.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Student student=(Student)request.getAttribute("studentObject"); %>

<form action="save-update-student" method="post">
		<input type="number" value="<%=student.getStudentId()%>" name="studentId" readonly="readonly"> <br>
		<input type="text" value="<%=student.getStudentName()%>" name="studentName"> <br>
		<input type="text" value="<%=student.getStudentEmail()%>" name="studentEmail"><br>
		<input type="number" value="<%=student.getStudentAge()%>" name="studentAge"> <br>
		<input type="text" value="<%=student.getStudentCourse()%>" name="studentCourse"><br>
		<input type="submit" value="UPDATE">
	</form>
</body>
</html>