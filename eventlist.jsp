<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Search result: Authors</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">
	<style>
	.col-md-3{
	margin-right:180px;
	}
	.jumbotron{
	margin-top:50px;
	}
	</style>
  </head>
  <body bgcolor="#fdcba9">
    <div class="container">
    <div class="jumbotron">
      <c:forEach items="${events}" var="events">
        <div class="row">
        <div class="col-xs-3">
			<c:out value="${events.getEventName()}" />
          </div>
          <div class="col-xs-3">
 			<button type="submit" class="btn btn-primary btn-block fa fa-edit">EDIT</button>
          </div>
          <div class="col-xs-3">
			<button type="submit" class="btn btn-danger btn-block fa fa-trash">DELETE</button>
          </div>
          </div>
      </c:forEach>
    </div>
    </div>
    	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  </body>
</html>