<%-- 
    Document   : LoginPage
    Created on : 16 mars 2016, 13:32:47
    Author     : safa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html class='no-js' lang='en'>
  <head>
    <meta charset='utf-8'>
    <meta content='IE=edge,chrome=1' http-equiv='X-UA-Compatible'>
    <title>Sign in</title>
    <meta content='lab2023' name='author'>
    <meta content='' name='description'>
    <meta content='' name='keywords'>
    <link href="./assets/css/application-a07755f5.css" rel="stylesheet" type="text/css" />
    <link href="./assets/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <!--<link href="assets/images/favicon.ico" rel="icon" type="image/ico" />-->
    <!-- Bootstrap -->
    <!--<link href="./assets/css/bootstrap.min.css" rel="stylesheet">-->
    
  </head>
  <body class='login'>
    <div class='wrapper'>
      <div class='row'>
        <div class='col-lg-12'>
          <div class='brand text-center'>
            <h1>
              <div class='image'>
                  <image src="./assets/images/logo.png"></image>
              </div>
              </h1>
          </div>
        </div>
      </div>
      <div class='row'>
        <div class='col-lg-12'>
          <form>
            <fieldset class='text-center'>
              <legend>Login to your account</legend>
              <div class='form-group'>
                  <label for="inputEmail" class="sr-only">Email address</label>
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus >
              </div>
              <div class='form-group'>
                  <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required >
              </div>
              <div class='text-center'>
                <div class='checkbox'>
                  <label>
                    <input type='checkbox'>
                    Remember me on this computer
                  </label>
                </div>
                  <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                <!--<a class="btn btn-lg btn-primary btn-block" type="submit" >Sign in</a>-->
                <br>
                <a href="http://localhost:29770/STRfinal-war/forgotPassword.jsp">Forgot password?</a>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
    <!-- Footer -->
    <!-- Javascripts -->
    <!--<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js" type="text/javascript"></script><script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js" type="text/javascript"></script><script src="//cdnjs.cloudflare.com/ajax/libs/modernizr/2.6.2/modernizr.min.js" type="text/javascript"></script><script src="assets/javascripts/application-985b892b.js" type="text/javascript"></script>-->
    <!-- Google Analytics -->
<!--    <script>
      var _gaq=[['_setAccount','UA-XXXXX-X'],['_trackPageview']];
      (function(d,t){var g=d.createElement(t),s=d.getElementsByTagName(t)[0];
      g.src=('https:'==location.protocol?'//ssl':'//www')+'.google-analytics.com/ga.js';
      s.parentNode.insertBefore(g,s)}(document,'script'));
    </script>-->
  </body>
</html>
