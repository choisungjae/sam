<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookMain</title>
</head>
<body>
 <%
	
	Cookie[] coo =request.getCookies(); %>
<%
	if(coo==null){ 
%> 

<form action="cookReg.jsp">
	아이디<input type="text" name="pid" />
	암호<input type="text" name="pw" />
	<input type="submit" value="로그인" />
</form>
<a href="cookout.jsp">로그아웃</a>
 <% } else { 
	for(Cookie c : coo){
	String name =c.getValue();
	System.out.println(c.getName()+",,,"+c.getValue()+",,,");
%>
<a href="cookout.jsp">로그아웃</a>
alert("<%=name %>님 안녕하세요")
	

<%}} %> 


</body>
</html>