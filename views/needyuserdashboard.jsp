<!DOCTYPE html>
<html lang="en">
<head>
    
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 
 <link rel="stylesheet" href="style.css">
</head>
<body>

<nav class="navbar navbar-inverse visible-xs">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Dashboard</a></li>
      
      </ul>
    </div>
  </div>
</nav>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav hidden-xs">
      <h2>Logo</h2>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">Dashboard</a></li>
        <li><a href="#section2"></a></li>
        <li><a href="chart.html">Chart</a></li>
       
        <li><a href="#section3"></a></li>
      </ul><br>
    </div>
    <br>
    
    <div class="col-sm-9">
      <div class="well">
        <h4>Social Help-Care Portal</h4>
        <p></p>
      </div>
      <div class="row">
        
        <div class="col-sm-3">
          <div class="well">
        <a href="needyuser.html" target="iframe_a"> <h4>Ngo List</h4>
            <p></p> 
          </div>
        </div>
        <div class="col-sm-3">
          <div class="well">
        <a href="requeststatus.html" target="iframe_a"> <h4>Check Request Status</h4>
            <p></p> 
          </div>
        </div>
        
      </div>
      
        <iframe src=" "  name="iframe_a" height="300" width="850" style="border:none;">
            <p>Your browser does not support iframes.</p>
          </iframe>

</body>
</html>
