<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
<link href="estilo.css" rel="stylesheet">
</head>
<body>

<div class="row">
<div class="col-sm-4"></div>

<div class="col-sm-4">
<div class="panel panel-default  a">
  
  <div class="panel-heading"><h1>  Dojos  <img src="kanji.png" width="100px"> Ninja</h1>  </div>
 <div class="panel-body">
<table class="table">
<thead>
<tr id="b">
<th> Dojo</th>
<th> Cantidad de ninjas</th>
</tr>
    </thead>
    
    
    <tbody>
  
   
      <c:forEach var="x" items="${dojos}">
   <tr>
   <td>    ${x.getNombre()}</td> 
   <td>    ${x.getNinjas().size()}</td> 

    </tr>
    
    </c:forEach>
    
    </tbody>
    </table>
</div>
</div>
</div>

<div class="col-sm-4"></div> 
</div>
</body>
</html>