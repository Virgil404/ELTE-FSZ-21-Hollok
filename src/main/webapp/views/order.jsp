<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@1,300&display=swap" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!------ Include the above in your HEAD tag ---------->
<header>
    <div class="topnav">
        <a href="index.jsp">HOME</a>
        <a class="active" href="carlist.jsp">CARLIST</a>
        <div id="profile"> <a class="active">User:<sec:authentication property="name"/></a></div>
        <div id="logout"> <a  class="btn btn-primary" href=<c:url value="/logout"/>>LOGOUT</a> </div>
      </div>
    
</header>
<body>

<form method="post"> 
    <div class="form-group" action="/orderfilter">
        <label id="colorpicker" for="colorpick"> Color Picker</label>
        <select class="form-control" id="colorpick">
            <option value="red">Red</option>
            <option value="green">Green</option>
            <option value="black">Black</option>
            <option value="matered">Mate-Red</option>
            <option value="mategreen">Mate-Green</option>
            <option value="mateblack">Mate-Black</option>
            <option value="glossyred">Glossy-Red</option>
            <option value="glossygreen">Glossy-Green</option>
            <option value="glossyblack">Glossy-Black</option>
            <option value="pearlred">pearl-Red</option>
            <option value="pearlgreen">pearl-Green</option>
            <option value="pearlblack">pearl-Black</option>
        </select>
</div> 
    <div class="form-group">
        <label id="packages" for="package">Pacgakes</label>
        <select class="form-control" id="package">
            <option value="standard">STANDARD</option>
            <option value="gold">GOLD</option>
            <option value="platinum">PLATINUM</option>
        </select>
</div>

<div class="form-group">
    <label for="FormControlName">Name</label>
            <input type="text" class="form-control" placeholder="Name">
        </div>
    </div>
    <label for="FormControlEmail">Email</label>
    <input type="email" class="form-control" id="FormControlEmail" placeholder="name@example.com">
    <label for="FormControlAdress">Adress</label>
    <input type="text" class="form-control" placeholder="Budapest, Petofi koz 17">
    <label for="FormControlCard">Credit Card</label>
    <input type="text" class="form-control" placeholder="xxxx-xxxx-xxxx-xxxx">
</div>
<script>
function getRandomArbitrary(min, max) {
  return Math.random() * (max - min) + min;
}
</script>
<br>

<div id="osszeg"></div>


<button onclick="myFunction()" name="compact" class="btn btn-success btn-md">ORDER</button>


<script>
function myFunction() {
  alert("CONGRATULATION!");
}
</script>
</form>
<<<<<<< HEAD
=======
    
<tabel>
    <tr>
        <th>price</th>
        <th>package</th>
        <th>color</th>
        <th>doors</th>
        <th>category</th>
    </tr>
        <c:forEach items="${order}" var="orders">
    <tr>
    	<td><c:out value="${orders.price}"/></td>
        <td><c:out value="${orders.package}"/></td>
        <td><c:out value="${orders.category}"/></td>
    </tr>
	</c:forEach>
</table>
>>>>>>> 2f70b7ccd229e0360fb5afc102e972fa3a96c13d

</body>