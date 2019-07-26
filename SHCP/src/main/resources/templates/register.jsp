<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>REGISTER PAGE</title>
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
        rel="stylesheet">
  <link href="/css/login1.css" rel="stylesheet">
</head>
<body>
<div class="jumbotron">
<form action="/form" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Name:</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" placeholder="Enter Name">
       
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Select Role</label>
    <select class="form-control" id="exampleFormControlSelect1" name="type">
      <option value="select">select</option>
      <option value="NGO">NGO</option>
      <option value="NEEDY">NEEDY</option>
      <option value="Volunteer">Volunteer</option>
      <option value="Admin">Admin</option>
    </select>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="/js/main.js"></script>
</body>
</html>