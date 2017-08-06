<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: script972
  Date: 05.08.2017
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cards</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>Card Group</th>
                <th>Barkode</th>
                <th>Photo Front</th>
                <th>Photo Back</th>
                <th>Description</th>
                <th>Rang</th>
                <th>Last Request</th>
                <th>Auther</th>
                <th>Inspection</th>
                <th>date Add</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${cards}" var="card">
                <tr>
                    <td>${card.id}</td>
                    <td><a href="cards.jsp?cardid=${card.id}">${card.cardGroup.description}</a></td>
                    <td>${card.barkode}</td>
                    <td>${card.photoFront}</td>
                    <td>${card.photoBack}</td>
                    <td>${card.description}</td>
                    <td>${card.rang}</td>
                    <td>${card.lastRequest}</td>
                    <td>${card.auther}</td>
                    <td>${card.inspection}</td>
                    <td>${card.access}</td>
                    <td>${card.dateAdd}</td>
                </tr>
            </c:forEach>

        </tbody>
    </table>

</body>
</html>
