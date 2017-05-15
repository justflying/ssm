<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>

    <meta charset="utf-8">
    <title>Fullscreen Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel="stylesheet" href="static/css/reset.css">
    <link rel="stylesheet" href="static/css/supersized.css">
    <link rel="stylesheet" href="static/css/style.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>

<body>

<div class="page-container">
    <h1>Login</h1>
    <form action="shiro/loginAdmin" method="post">
        <input type="text" name="username" class="username" placeholder="Username">
        <input type="password" name="password" class="password" placeholder="●●●●●●">
        <button type="submit">Sign me in</button>
        <div class="error"><span>+</span></div>
    </form>
    <div class="connect">
        <p>Or connect with:</p>
        <p>
            <a class="facebook" href=""></a>
            <a class="twitter" href=""></a>
        </p>
    </div>
</div>
<!-- Javascript -->
<script src="static/js/jquery.min.js"></script>
<script src="static/js/supersized.3.2.7.min.js"></script>
<script src="static/js/supersized-init.js"></script>
<script src="static/js/scripts.js"></script>

</body>
<footer>
    <div>
       Collect from <a href="">@2017</a>
    </div>
</footer>
</html>