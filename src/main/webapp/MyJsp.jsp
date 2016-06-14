<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<body>
		<form action="${pageContext.request.contextPath}/hellowMvc" method=post>
			username:<input type="text" name="username" />
			<input type="submit" />
		</form>
		
	
	</body>


</html>





