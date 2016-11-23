<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<h3>All Records:</h3>  <hr>
<table class="table table-striped">
<tr>
	<th>User ID</th>
	<th>Manager ID</th>
	<th> First name</th>
	<th>Last Name</th>
	<th>email</th>
	<th>mobile</th>
	<th>d-o-j</th>
	<th>isActive</th>
	

</tr>

<s:iterator  value="empList">
<tr>


	<td><s:property value="userId"/></td>
	<td><s:textfield name="managerId" value='%{managerID}' /></td>
	<td><s:textfield name="firstName" value='%{firstName}'/> </td>
	<td><s:textfield name="lastName" value='%{lastName}'/></td>
	<td><s:textfield name="email" value='%{email}'/></td>
	<td><s:textfield name="mobileNumber" value='%{mobileNumber}'/></td>
	<td><s:textfield name="dateOfJoining" value='%{dateOfJoining}'/></td>
	<td><s:textfield name="isActive" value='%{isActive}'/></td>
	<td><a href="modifyuseraction"><button class="btn btn-success">UPDATE</button></a></td>

</tr>
</s:iterator>  


</table>



  
  



 

</div>
</body>
</html>