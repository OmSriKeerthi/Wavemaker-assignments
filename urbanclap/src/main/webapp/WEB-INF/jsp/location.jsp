<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01
Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<title>Location</title>
       <script src="https://kit.fontawesome.com/f90b4ddd1d.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" >
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    <style>
    .form-floating{
        margin-top: 50px;
        margin-bottom: 50px;
        margin-left: 50px;
        display: flex;
        flex-direction: row;
        justify-content: center;
        padding-top: 20px;
        margin-right:50px;
    }
    *{
        padding: 0px;
        margin:0px;
        box-sizing: border-box;
    }
    .container-5{
        background-color:skyblue;
        width: 100vw;
        background-size: cover;
        text-align: center;
        padding-top: 15px;
        padding-bottom: 15px;
    }
    .container-1{
        background-color: antiquewhite;
        height: 300px;
        width: 500px;
        margin-left:300px;
        margin-top: 100px;
        margin-bottom: 200px;
    }
    .form-select{
    margin-right:50px;
    margin-top:30px;
    }
    .head{
        font-size: 30px;
        padding-top: 15px;
        padding-bottom: 15px;
    }
    </style>
</head>
<body>
<div class="container-5">
<label class="head">Hello ${user.getName()} Please choose your Location</label>
</div>
<div class="container-1">
<form class="form-location" action="/urbanclap/serviceApi/services" method="get" modelAttribute="locationData" onsubmit="return validate();" id="form-location">

<input type="hidden" name="phone" id="phone" value="${user.getPhone()}" />
<input type="hidden" name="name" id="name" value="${user.getName()}" />
<input type="hidden" name="email" id="email" value="${user.getEmail()}" />
    <div class="container-1">
    <div class="form-floating1">
        <select class="form-select" required id="floatingSelectGrid" required onchange="chooseLocation(this);" name="location" id="location">
            <option selected value="">Select the city</option>
            <c:forEach var="location" items="${locations}">
               <option value="${location.getName()}">${location.getName()}</option>

            </c:forEach>


        </select>
    </div>
    </div>
</form>
</div>
</body>
<script>
    function chooseLocation(ele){
        document.getElementById("form-location").submit();
    }
    function validate(){
        var ele =document.getElementById("location")
        if(ele.value != ""){
            return true;
        }else{
            return false;
        }
    }


</script>