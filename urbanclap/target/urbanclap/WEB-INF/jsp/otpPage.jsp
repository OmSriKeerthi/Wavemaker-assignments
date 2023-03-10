<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01
Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<title>otp page</title>
<style>
*{
    padding: 0px;
    margin:0px;
    box-sizing: border-box;
}
.container-5{
    background-color:antiquewhite;
    width: 100vw;
    background-size: cover;
    text-align: center;
    padding-top: 20px;
    padding-bottom: 20px;
}
.container-2{
    background-color: beige;
    height:300px;
    width:600px;
    margin-left:300px;
    margin-top: 200px;
    margin-bottom: 200px;
}
.form-container{
    text-align: center;
    padding-top: 20px;
}
#otp{
    margin-top: 70px;
    text-align: center;
    height:40px;
    width:200px;

}

.button-container{
    height: 40px;
    width:100px;
    border-width:0px;


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
<label class="head">Hello ${user.getName()} Enter your otp</label>
</div>
<div class="container-2">
<form class="form-otpValidate" action="/urbanclap/userService/validate" method="post" modelAttribute="otpData" onsubmit="return verify();">
<div class="form-container">
<input type="hidden" name="phone" id="phone" value="${user.getPhone()}" />
<input type="hidden" name="name" id="name" value="${user.getName()}" />
<input type="hidden" name="email" id="email" value="${user.getEmail()}" />

OTP(1234):  <input type="text" name="otp" id="otp"/><br>
<button type="submit" id="otp">Continue</button>
</div>
</form>
</div>


</body>
</html>