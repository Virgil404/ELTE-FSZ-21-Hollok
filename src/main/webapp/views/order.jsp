<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

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
      </div>
    
    <form:form action="/logout">
        <input type="Submit" class="btn btn-primary" value="logout"/>
    </form:form>

    User, <sec:authentication property="name"/>
</header>
<body>

<form method="post"> 
    <div class="form-group" action="/orderfilter">
        <label for="colorpick"> Color Picker</label>
        <select class="form-control" id="colorpick">
            <option>Red</option>
            <option>Green</option>
            <option>Black</option>
        </select>
</div> 
    <div class="form-group">
        <label for="package">Pacgakes</label>
        <select class="form-control" id="package">
            <option>STANDARD</option>
            <option>GOLD</option>
            <option>PLATINUM</option>
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
</div>

<br>

<input type="submit" name="compact" class="btn btn-success btn-md" href="order.jsp" value="ORDER">

</form>
    
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
    	<td>${orders.price}</td>
        <td>${orders.package}</td>
        <td>${orders.category}</td>
    </tr>
	</c:forEach>
</table>

</body>