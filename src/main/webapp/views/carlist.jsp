<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@1,300&display=swap" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<html>
<!------ Include the above in your HEAD tag ---------->
<header>
    <div class="topnav">
        <a href="index.jsp">HOME</a>
        <a href="register.jsp">REGISTER</a>
        <a class="active" href="carlist.jsp">CARLIST</a>
        <div id="profile"> <a class="active">User:<sec:authentication property="name"/></a></div>

        <div id="logout"> <a  class="btn btn-primary" href=<c:url value="/logout"/>>LOGOUT</a> </div>
      </div>
    
          
</header>
<body>
       <div> 100000 ${userbalance.balance}</div>
    <table id="tb1">
        <tr>
          <th><img src="source/pickup.png" style="max-width: 100%; height:auto;"><br></th>
          <th><img src="source/suv.png" style="max-width: 100%; height:auto;"><br></th>
        </tr>
        <tr>
            <th><br><div class="form-group">
                <input type="submit" name="pickup" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>

            <th><div class="form-group">
                <input type="submit" name="suv" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>

          </tr>
        <tr>
          <td><img src="source/sport+.png" style="max-width: 100%; height:auto;"></td>
          <td><img src="source/transit.png" style="max-width: 100%; height:auto;"></td>
        </tr>
        <tr>
            <th><br><div class="form-group">
                <input type="submit" name="sport+" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>

            <th><br><div class="form-group">
                <input type="submit" name="transit" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>
            
          </tr>
        <tr>
          <td><img src="source/hothatch.png" style="max-width: 100%; height:auto;"></td>
          <td><img src="source/electric.png" style="max-width: 100%; height:auto;"></td>
        </tr>
        <tr>
            <th><br><div class="form-group">
                <input type="submit" name="hothatch" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>

            <th><br><div class="form-group">
                <input type="submit" name="electric" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>
            
          </tr>
        <tr>
          <td><img src="source/sport.png" style="max-width: 100%; height:auto;"></td>
          <td><img src="source/compact.png" style="max-width: 100%; height:auto;"></td>
        </tr>
        <tr>
            <th><br><div class="form-group">
                <input type="submit" name="sport" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>

            <th><br><div class="form-group">
                <input type="submit" name="compact" class="btn btn-success btn-md" href="order.jsp" value="ORDER">
            </div></th>
            
          </tr>
      </table>
      <br>
      <br>
</body>
<footer class="footer">
    <img src="source/Interface_Facebook.png"> <a class="link" href="https://www.youtube.com/watch?v=jeg_TJvkSjg">FACEBOOK</a>
    <img src="source/Interface_Twitter.png"> <a class="link" href="https://www.youtube.com/watch?v=OD3F7J2PeYU">TWITTER &#8192</a>
    <img src="source/Interface_Youtube.png"> <a class="link" href="https://www.youtube.com/watch?v=dQw4w9WgXcQ">YOUTUBE</a>
</footer>

</html>