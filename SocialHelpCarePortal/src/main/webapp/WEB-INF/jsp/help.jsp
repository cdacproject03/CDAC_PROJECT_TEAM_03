<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="/css/help.css">
    	<link href="/css/header.css" rel="stylesheet">
</head>
<body>

	<ul>
		<li><a class="active fa fa-home" href="home">Home</a></li>
		<li><a href="contact" class="fa fa-phone">Contact Us</a></li>
		<li><a href="aboutus" class="fa fa-info-circle">About</a></li>
		<li><a href="help" class="fa fa-question-circle">Help</a></li>
		<li><a href="signin" class="right fa fa-sign-in" style="font-size:15px;color:#00b33c">sign-in</a></li> 
		<li><a href="signup" class="signup fa fa-sign-out" style="font-size:15px;color:red">sign-up</a></li>
	</ul>
<div class="sidebar">
  
  <a class="active" href="faq" target="iframe_a">FAQ's</a>
  <a href="Instruction" target="iframe_a">Instructions</a>
  
</div>

<!-- Page content -->
<div class="content">
  ..
</div>
<h2>How Can We Help You?</h2>

    <form class="example" action="/action_page.php">
  <input style="padding:8px" type="text" placeholder="Find Query" name="search">
  <button style ="font-size:18px"type="submit">search<i class="fa fa-search"  aria-hidden="true"></i></button>
</form>

<iframe src=""  name="iframe_a" height="500" width="850" style="border:none;"> 
</iframe>
</body>
</html>