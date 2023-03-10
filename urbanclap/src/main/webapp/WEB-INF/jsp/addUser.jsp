<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01
Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<title>SignUp User</title>
<style>
*{
    padding: 0px;
    margin:0px;
    box-sizing: border-box;
}
.container-5{
    background-color:skyblue;
    width: 100vw;
    background-size: cover;
}
.heading-1{
    text-align: center;
    font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
    font-size: 28px;
    font-weight: 400;
    padding: 15px;
}
.container-2{
    background-color: beige;
    height:500px;
    width:600px;
    margin-left:300px;
    margin-top: 200px;
    margin-bottom: 200px;
}
.form-container{
    text-align: center;
    padding-top: 20px;

}
#name{
margin-top: 90px;
height:40px;
width:200px;
}
#email{
    margin-top: 30px;
    height:40px;
    width:200px;
}
#signup{
    margin-top:30px;
    height: 40px;
    width: 100px;
    border-width: 0px;
}



</style>


</head>

<body>
<div class="container-5">
        <h1 class="heading-1"> Heyy Welcome <br> Please SignUp here </h1>
    </div>


    <div class="container-2">
    <form class="form-addUser" action="/urbanclap/userService/create" method="post" modelAttribute="userData" onsubmit="return signup();">

        <!-- Phone : <input type="text" value="${phone}" id="phone" name="phone"/> -->
        <div class="form-container">
        Name: <input type="text" id="name" name="name"/><br>
        Email: <input type="text" id="email" name="email"/><br>
        <button type="submit" id="signup">SignUp</button><br>

        </div>
        </form>
        </div>
<script>
 function signup(){
    var phone = document.getElementById("phone").value;
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    if(phone == "" || name == "" || email == ""){
        return false;
    }else{
        return true;
    }
 }
</script>
</body>
</html>


