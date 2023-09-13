<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
<link href="../estilo.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="row">
<div class="col-sm-12 fondo"></div>
<div class="col-sm-4"  ></div>
<div class="col-sm-4" id="div">
  <div class="panel panel-default a">
  
  <div class="panel-heading">
<h1>  Dojos  <img src="../kanji.png" width="100px"> Ninja</h1>
</div>
 <div class="panel-body">
<h2>Dojo : <c:out value="${dojo.getNombre()}"></c:out> </h2>

<table class="table">
<thead> 
<tr> 
<th>Nombre </th>
<th>Apellido  </th>
<th>Edad </th>

</tr>
</thead>
<tbody>

    <c:forEach var="ninja" items="${dojo.getNinjas()}">
        <tr> 
        <td> ${ninja.getNombre()}</td>
        <td> ${ninja.getApellido()}</td>
        <td> ${ninja.getEdad()}</td>
        
        </tr>
    </c:forEach>
</tbody>
</table>
 </div> 
 <div class="col-sm-4"> </div>
 
 </div>
 </div> </div>
</body>
</html>