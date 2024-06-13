<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>

<form action="/translate" method="post" >
    <table>
        <thead>
        <tr>
            <th>
                <label>English: </label>
            </th>
            <td>
                <input type="text" name="english" placeholder="input english..." value="${english}">
            </td>
            <th>
                <label>Vietnamese: </label>

            </th>
            <td>
                <input type="text" name="vietnamese" value="${vietnamese}" readonly>

            </td>
            <br>
            <input type="submit" value="Translate">
        </tr>
        </thead>
    </table>
</form>
<p style="color: red">${errMsg}</p>


</body>
</html>