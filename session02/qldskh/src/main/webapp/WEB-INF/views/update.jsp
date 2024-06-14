<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/06/2024
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Customer</title>
</head>
<body>
<table border="1px solid red">
  <tr>
    <td>Id</td>
    <td><input type="text" name="id" value="${customer.id}" readonly></td>
  </tr>
  <tr>
    <td>Name</td>
    <td><input type="text" name="name" value="${customer.name}"></td>
  </tr>
  <tr>
    <td>Email</td>
    <td><input type="text" name="email" value="${customer.email}"></td>
  </tr>
  <tr>
    <td>Address</td>
    <td><input type="text}" name="address" value="${customer.address}"></td>
  </tr>
  <tr>
    <td colspan="2"><a href="#">Update</a></td>
  </tr>
</table>
<br>
<br>
<a href="/customer">Back to list</a>
</body>
</html>
