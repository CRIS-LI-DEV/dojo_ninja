<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="ninjas">
    <h1>Ninjas</h1>
    

    <c:forEach begin="1" end="${totalPages}" var="index">
        <a href="/pages/${index}">${index}</a>
    </c:forEach>
    <table class="table" border="!">
        <thead>
            <th>Dojo Name</th>
            <th>Nombre</th>
            <th>Apellido</th>
        </thead>
        <tbody>
   
            <c:forEach var="ninja" items="${ninjas.content}">                 
            <tr>
            <td><c:out value="${ninja.dojo.nombre}"></c:out></td>
                <td><c:out value="${ninja.nombre}"></c:out></td>
                <td><c:out value="${ninja.apellido}"></c:out></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>