<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/06/2024
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<form action="/convert" method="post">
   <div>
       <lable>VND</lable>
       <input type="number" name="vnd"  value="23000">
   </div>
    <div>
        <lable>USD</lable>
        <input type="number" name="usd" value="${usd}" >
    </div>
    <div>
        <lable>Result</lable>
        <input type="number" name="result" value="${result}" >
    </div>
    <button type="submit">Convert</button>
</form>
</body>
</html>
