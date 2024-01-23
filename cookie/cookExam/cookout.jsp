<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookout</title>
</head>
<body>

    
<%
	/* 쿠키내용지우기 */
	Cookie cooname = new Cookie("pname","");
	Cookie cooid = new Cookie("pid","");


	cooname.setMaxAge(0);
	cooid.setMaxAge(0);

	response.addCookie(cooname);
	response.addCookie(cooid);


%>

<script>
	
	location.href="cookMain.jsp"
</script>
</body>
</html>