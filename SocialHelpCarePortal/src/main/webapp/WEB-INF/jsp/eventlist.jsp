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
  </head>
  <body bgcolor="white">
    Here are all authors matching your search critera:
    <table>
      <TH>Name</th>
      <TH>Id</th>
      <c:forEach items="${events}" var="events">
        <tr>
          <td><c:out value="${events.getEventName()}" /><td>
          <td><button type="submit" class="btn btn-primary btn-block">EDIT</button></td>
          <td><button type="submit" class="btn btn-danger btn-block">DELETE</button></td>
        </tr>
      </c:forEach>
    </table>
    	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  </body>
</html>