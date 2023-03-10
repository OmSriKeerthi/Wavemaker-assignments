<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css"
        rel="stylesheet">
    <script src="https://kit.fontawesome.com/f90b4ddd1d.js" crossorigin="anonymous"></script>
<style>
    *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
.container{
    background-color: black;
    background-size: cover;
}
.image-property{
    margin-top: 30px;
    margin-bottom: 30px;

}
.form-floating{
    margin-top: 50px;
    margin-bottom: 50px;
    margin-left: 50px;
    display: flex;
    flex-direction: row;
    justify-content: center;
    padding-top: 20px;
}
.bg-con1{
    background: skyblue;

    width: 650px;
    margin-left: 300px;
    margin-top: 50px;
    margin-right: 300px;
    padding: 70px;
    margin-bottom:50px;

}
.form-floating1{
    margin-top: 0px;
    margin-left: 50px;
    margin-bottom: 50px;
    display: flex;
    padding-top: 0px;
    flex-direction: row;
    justify-content: center;

}

#floatingInputGrid{
    height:40px;
    width:300px;
}
#floatingSelectGrid{
    height:40px;
    width:300px;
}
.bgcon-para{
    color: black;
    text-align: center;
    font-family: 'Times New Roman', Times, serif;
    font-size: 25px;
    font-weight: 400;
}
a{
    text-decoration: underline;
    color:black;
    font-size: 18px;
    display: flex;
    flex-direction: row;
    justify-content: center;
    cursor: pointer;
}
   .heading2{
    margin: 20px;
    font-family: 'Times New Roman', Times, serif;
    font-size: 30px;
    font-weight: bold;
    text-align: center;
   }
   .heading3{
    color:black;
    font-size: 21px;
    font-weight:300;

    margin-left:20px;
   }
    .image-container{
        display: flex;
        flex-direction: row;
        justify-content: center;
    }
    .image-container2{
        margin-left:40px;
        margin-bottom: 30px;
    }
    .container4{
        background: black;
        background-size: cover;
        width:100vw;
    }
    .heading4{
        color:white;
        font-size:16px;
        display:inline;
        /* margin-left:12px; */
        font-weight: normal;
        margin-top:40px;
        padding: 20px;
        margin:10px;

    }
    .heading5{
        color:white;
        font-size:16px;
        display:inline;

        font-weight: normal;
        padding:20px;
        margin:10px;


    }
    .bi{
        margin:4px;

    }
    .icons-container{
        display: flex;
        flex-direction: row;
        justify-content: center;
    }
    .heading{
    color:White;
    font-size:40px;
    text-align:center;
    font-weight:500;
    padding-top:20px;
    padding-bottom:20px;
    }
    .form-control{
    height:40px;
    width:200px;
    border-width:0px;
    }

</style>

  </head>
      <body>
          <nav class="navbar bg-body-tertiary">
            <div class="container">
              <a class="navbar-brand" href="#">
                <h1 class="heading">URBAN CLAP</h1>
              </a>
            </div>
          </nav>
          <div class="bg-con1">
            <p class="bgcon-para" style="text-align: center;"> Are you ready to avail the services?? <br><br>Then Why late...Just Login and grab the offers till your fate.</p>
            <div class="row g-2">
              <div class="col-md">
                <div class="form-floating">
                  <form action="">
                    <input type="phone" class="form-control" id="phoneNumber" placeholder="Enter your Mobile Number" required>
                  </form>
                </div>
              </div>

            <a onclick="validate()">Let's Go </a>
          </div>
         <script>
          function validate(){
            var phone = document.getElementById("phoneNumber").value;
            if(phone.length != 10 || !hasNumbers(phone) ){
                alert("Invalid Phone Number");
            }else{
                window.location.href="http://127.0.0.1:8080/urbanclap/userService/user?phone="+phone;
            }
          }
          function hasNumbers(t)
          {
              var regex = /\d/g;
              return regex.test(t);
          }
         </script>


        </body>
</html>
