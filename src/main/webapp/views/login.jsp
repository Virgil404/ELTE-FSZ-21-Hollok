<%@taglib prefix="c" uri="http.//java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@1,300&display=swap" rel="stylesheet">
<link href="login.css" rel="stylesheet">
<!------ Include the above in your HEAD tag ---------->
</head>
<header>
    <div class="topnav">
        <a href="index.jsp">HOME</a>
        <a href="register.jsp">REGISTER</a>
        <a class="active" href="login.jsp">LOGIN</a>
        <a href="carlist.jsp">CARLIST</a>
      </div>
</header>
<body>
    <c:if test="${param.error!=null}">
          <div>
              invalid username or password or one of our programmers fucked up something
          </div>
    </c:if> 
    
    <c:if test="{param.logout!=null}">
        <div>
            if everything worked as intended you have been logged out 
        </div>
        
    </c:if>
    
    <div id="login">
        <!--<h3 class="text-center text-white pt-5">Login form</h3>-->
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        
                        <form:form  id="login-form" class="form" action="login" method="POST">
                            <h3 class="text-center text-success">LOGIN</h3>
                            <div class="form-group">
                                <label for="username" class="text-success">USERNAME:</label><br>
                                <input type="text" name="username" id="username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-success">PASSWORD:</label><br>
                                <input type="password" name="password" id="password" class="form-control">
                            </div>
                            <br>
                            <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-danger btn-md" value="submit">
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<footer class="footer">
    <img src="Interface_Facebook.png"> <a class="link" href="https://www.youtube.com/watch?v=jeg_TJvkSjg">FACEBOOK</a>
    <img src="Interface_Twitter.png"> <a class="link" href="https://www.youtube.com/watch?v=OD3F7J2PeYU">TWITTER &#8192</a>
    <img src="Interface_Youtube.png"> <a class="link" href="https://www.youtube.com/watch?v=dQw4w9WgXcQ">YOUTUBE</a>
</footer>
</html>
