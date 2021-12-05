<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
--%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@1,300&display=swap" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<!------ Include the above in your HEAD tag ---------->
<header>
    < <div class="topnav">
        <a class="active" href="index.jsp">HOME</a>
        <a href="register.jsp">REGISTER</a>
        <a href="login.jsp">LOGIN</a>
        <a href="carlist.jsp">CARLIST</a>
      </div>
    <div>
        <form:form action="/logout">
            <input type="submit" value="logout"/>
        </form:form>
    </div>
    User, <sec:authentication property="name"/>
</header>
</header>
<body>
    
    <div id="register">
        <!--<h3 class="text-center text-white pt-5">Register form</h3>-->
        <div class="container">
            <div id="register-row" class="row justify-content-center align-items-center">
                <div id="register-column" class="col-md-6">
                    <div id="register-box" class="col-md-12">
                        
                        <form id="register-form" class="form" action="/adduser" method="post">
                            <h3 class="text-center text-danger">REGISTER</h3>
                            <div class="form-group">
                                <label for="username" class="text-danger">USERNAME:</label><br>
                                <input type="text" name="username" id="username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-danger">PASSWORD:</label><br>
                                <input type="password" name="password" id="password" class="form-control">
                                <br>
                                <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-danger btn-md" value="Register">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<footer class="footer">
    <img src="source/Interface_Facebook.png"> <a class="link" href="https://www.youtube.com/watch?v=jeg_TJvkSjg">FACEBOOK</a>
    <img src="source/Interface_Twitter.png"> <a class="link" href="https://www.youtube.com/watch?v=OD3F7J2PeYU">TWITTER &#8192</a>
    <img src="source/Interface_Youtube.png"> <a class="link" href="https://www.youtube.com/watch?v=dQw4w9WgXcQ">YOUTUBE</a>
</footer>
