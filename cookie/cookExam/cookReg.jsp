<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookReg</title>
</head>
<body>
<h1>loginReg.jsp</h1>
<%
	String pid = request.getParameter("pid");
	String pw = request.getParameter("pw");
	
	HashMap <String,String> mm = new HashMap();
			
	mm.put("Aaa","1234,김석상");	
	mm.put("Bbb","5678,이나무");		
	mm.put("Ccc","3333,이푸른");
	mm.put("Ddd","4444,사팔구");
	mm.put("Eee","5555,이석구");
	
	String msg = "로그인 실패";
	
	if(mm.containsKey(pid)){
		String pidpw2= mm.get(pid).split(",")[0];
		String pidname2= mm.get(pid).split(",")[1];
	 	
		if(pidpw2.equals(pw)){
			msg=pidname2+"님로그인성공";
			Cookie id = new Cookie("pid",pid);
			Cookie name = new Cookie("pname",pidname2);
			
			response.addCookie(id);
			response.addCookie(name);
			
		}
	}

	
%>
<script>
	alert("<%=msg%>")
	location.href="cookMain.jsp"
</script>
</body>
</html>