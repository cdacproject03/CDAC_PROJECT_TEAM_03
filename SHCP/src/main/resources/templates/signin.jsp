<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <link rel="stylesheet" href="login1.css">
    <style>
    .login-form{
    width:360px;
    background: #f1f1f1;
    height: 580;
    padding: 80px 40px;
    border-radius: 10px;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%,-50%);

}
body{
    min-height: 100vh;
    background-color:cyan;
}
.txtb{
    border-bottom: 2px solid #adadad;
    position: relative;
    margin: 30px 0;
  }
    </style>
</head>
<body>
    <div class="login-form">
    <h1 align="center">Login</h1>
     <p class="nav-item">
    <a class="nav-link active" href="gotohome">Active</a>
 	 </p>
    <h1>welcome ${user.getName()}</h1>
    <form action="/login" method="post">
    <table align="center" cellpadding = "10">
        <tr>
            <td class="textb">User Name</td>
            <td><input type="text" name="name" maxlength="30" /></td>
        </tr>
        <tr>
            <td class="textb">Password</td>
            <td><input type="password" name="password" ></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                    <input type="submit" value="Login">
            </td>
        </tr>
        <tr>
            <td>  Dont have account?</td>
            <td><a href="signup">sign-up</a></td>
              
           
        </tr>
    </table>
    </form>
</body>
</html>
    
    
    
    
   