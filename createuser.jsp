<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Update User Request Page</title>
</head>
<body>

<br>
<s:form action="adminAction">
<s:textfield name="uid" label="uid"></s:textfield>
<s:textfield name="mid" label="mid "></s:textfield>
<s:textfield name="firstname" label="firstname"></s:textfield>
<s:textfield name="lastname" label="lastname"></s:textfield>
<s:textfield name="email" label="email"></s:textfield>
<s:textfield name="password" label="password"></s:textfield>
<s:textfield name="shortid" label="shortid"></s:textfield>
<s:textfield name="mobile" label="mobile"></s:textfield>
<s:textfield name="doj" label="doj"></s:textfield>
<s:textfield name="active" label="active"></s:textfield>
<s:submit name="submit" value="create"></s:submit>
<%-- add token to JSP to be used by Token interceptor --%>

</s:form>
</body>
</html>