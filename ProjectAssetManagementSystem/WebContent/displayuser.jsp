<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>All Records:</h3>  
<s:iterator  value="eList">  
<fieldset>  
<s:property value="user.userId"/><br/>  
<s:property value="user.managerId"/><br/>  
<s:property value="user.firstName"/><br/>  
<s:property value="user.lastName"/><br/>  
</fieldset>  
</s:iterator>  


</body>
</html>