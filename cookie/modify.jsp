<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>
<h1>쿠키수정</h1>
<%

	response.addCookie(new Cookie("pid","ccc"));
	response.addCookie(new Cookie("height","175.44"));
%>
</body>
</html>