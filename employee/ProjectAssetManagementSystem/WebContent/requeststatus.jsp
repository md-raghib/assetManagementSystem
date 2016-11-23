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
<h3>Request Status:</h3>  
 
  
<div class="container">
  
  <table class="table table-striped">
    <thead>
      <tr>
        <th>UserID</th>
        <th>RequestID</th>
        <th>Asset Name</th>
        <th>Remarks</th>
        <th>Request Date</th>
      </tr>
    </thead>
    <tbody>
     <s:iterator  value="statusList"> <tr>
       
        <td><s:property value="userId"/></td>
        <td><s:property value="requestId"/></td>
        <td><s:property value="assetName"/></td>
        <td><s:property value="remarks"/></td>
        <td><s:property value="requestDate"/></td>
       
      </tr>
        </s:iterator> 
    </tbody>
  </table>
</div> 
 

<s:debug></s:debug>
</body>
</html>