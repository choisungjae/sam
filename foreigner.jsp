<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>외국인폼</title>
</head>
<body>
<h1>외국인폼</h1>
<form action="memJoin.jsp">
	<input type="hidden" name="kind" value="foreigner" />
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" value="<%=request.getParameter("pname")%>"/></td>
		</tr>
		<tr>
			<td>전화</td>
			<td><input type="text" name="tel" /></td>
		</tr>
		<tr>
			<td>국적</td>
			<td><input type="text" name="nation" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" value="가입" /></td>
		</tr>
	</table>
</form>
</body>
</html>