<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<br>
<div class="row">
<div class="col-sm-6">
<s:form action="requestAction">

<s:textfield name="userId" label="userId " placeholder="User Id"></s:textfield>

<s:select name="assetName" list="{'choose','laptop','mobile','datacard'}"></s:select>




<s:submit name="submit" value="request"></s:submit>

</s:form>
</div>
</div>

</div>
</body>
</html>