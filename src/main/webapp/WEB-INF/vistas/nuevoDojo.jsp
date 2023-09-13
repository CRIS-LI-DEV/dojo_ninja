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
<h2>CREAR DOJO</h2>

<form action="/dojos" method="post">
NOMBRE:
<input type="text" name="nombre" class="form-control" >

<input type="submit" value="Crear Dojo" class="form-control">

</form>

</div>  </div>  </div>  </div>  
</body>
</html>