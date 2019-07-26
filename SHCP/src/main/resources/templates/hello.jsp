<!DOCTYPE html> 
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<!-- <link rel="stylesheet" href="FirstTempCss.css"> -->
<body>


	<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li
 
a
:hover
:not
 
(
.active
 
)
{
background-color
:
 
#111
;


}
.active {
	background-color: #4CAF50;
}

.right {
	margin-left: 620px;
}

.signup {
	margin: 50px, 30px, 50px, 80px;
}

img {
	opacity: 0.5;
	filter: alpha(opacity = 50); /* For IE8 and earlier */
}
</style>
</head>
<body>

	<ul>
		<li><a class="active" href="#home">Home</a></li>
		<li><a href="admin">Admin</a></li>
		<li><a href="ngo">NGO</a></li>
		<li><a href="contact">Contact Us</a></li>
		<li><a href="Volunteer">Volunteer</a></li>
		<li><a href="about">About</a></li>
		<li class="hide-small dropdown-hover"><a
			href="javascript:void(0)" title="More">Help <i
				class="fa fa-caret-down"></i></a></li>
		<li><a href="signin" class="right">sign-in</a></li> \
		<li><a href="signup" class="signup">sign-up</a></li>
	</ul>

			

	<!-- Automatic Slideshow Images -->
	<div class="mySlides display-container center">
		<img src="/images/image1.jpg" style="width: 100%; height: 20%" } />
		<div
			class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
		</div>
	</div>

	<div class="mySlides w3-display-container w3-center">
		<img src="/images/image2.png" style="width: 100%"/">
		<div
			class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">

		</div>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="/js/main.js"></script>
</body>
</html>