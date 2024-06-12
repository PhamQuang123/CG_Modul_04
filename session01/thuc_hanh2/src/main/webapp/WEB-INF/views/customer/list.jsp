<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/06/2024
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customers</title>
</head>
<body>
<table border="1px solid red">
  <thead>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
  </tr>
  </thead>
  <tbody>
 <c:forEach items="${customers}" var="c">
   <tr>
     <td>${c.id}</td>
     <td><a href="/edit?id=${c.id}">${c.name}</a></td>
     <td>${c.email}</td>
     <td>${c.address}</td>
   </tr>
 </c:forEach>
  </tbody>
</table>
</body>
</html>
