<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="./page3.css" rel="stylesheet">
        <script src="https://kit.fontawesome.com/f90b4ddd1d.js" crossorigin="anonymous"></script>
     <style>
     *{
         padding: 0px;
         margin:0px;
         box-sizing: border-box;
     }
     .bg-container8{
         background-color: pink;
         width: 100vw;
         background-size: cover;

     }
     .heading-9{
         color:black;
         font-size:23px;
         font-weight:500;
         text-align: center;
         /* margin: 30px; */
         padding: 20px;
     }
     .image-property{
         margin:40px;
     }
     .heading-1{
         color:black;
         font-size:30px;
         font-weight: 400;
         padding: 15px;
         padding-top: 50px;
         text-decoration: underline;
     }
     .checked {
         color: orange;

       }
       .star-con{
         margin-left: 100px;
       }
       .heading-2{
         color: black;
         font-size:25px;
         font-weight:200;
         padding-left:80px;
       }
       .list-items{
         list-style-type: disc;
         margin-left: 100px;
       }
       .main-container{
         display: flex;
         flex-direction: row;
         justify-content: start;
       }
       .heading-3{
         text-decoration: underline;
         color:purple;
         font-size:19px;
         padding-left: 80px;
         margin-top: 20px;
         cursor:pointer;
       }



     </style>





    </head>



    <body>
        <div class="bg-container8">
            <h1 class="heading-9">Here are the list of salons.</h1>
            </div>
            <div class="main-container">
            <div>
             <img src='<c:url value="/images/image2.png"></c:url>' />
            <img src="/images/image1.jpeg" alt="image8" height="280" width="320" class="image-property">
            </div>
            <div>
                <h1 class="heading-1"> Naturals Hair salon for women</h1>
                <div class="star-con">
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star checked"></span>
                    <span class="fa fa-star"></span>
                    </div>
                    <h2 class="heading-2"> Services offered:</h2>
                    <ul class="list-items">
                        <li> Long Airy Layers  [Rs.2999] </li>
                        <li> Baby Bangs  [Rs.3999] </li>
                        <li> Blunt Bobs and Lobs  [Rs.5999] </li>
                        <li> Bobby pin hair styles  [Rs.6999] </li>
                        <li>Bridal Packages(Starts at Rs.11,999)</li>

                    </ul>

                    <h3 class="heading-3" onclick="salon1()"> Check our services and Book the Appointment.</h3>
            </div>
            </div>
            <div class="main-container">
                <div>
                    <img src="./image9.png" alt="image8" height="280" width="320" class="image-property">
                </div>
                <div>
                    <h1 class="heading-1"> Glow Trends</h1>
                    <div class="star-con">
                    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star"></span>
                        <span class="fa fa-star"></span>
                        </div>
                        <h2 class="heading-2"> Services offered:</h2>
                        <ul class="list-items">
                            <li> Long Airy Layers  [Rs.1999] </li>
                            <li> Baby Bangs  [Rs.2999] </li>
                            <li> Blunt Bobs and Lobs  [Rs.4999] </li>
                            <li> Bobby pin hair styles  [Rs.5999] </li>
                            <li>Bridal Packages(Starts at Rs.7999) </li>

                        </ul>

                        <h3 class="heading-3" onclick="salon2()"> Check our services and Book the Appointment.</h3>
                </div>
                </div>
                <div class="main-container">
                    <div>
                        <img src="./image8.png" alt="image8" height="280" width="320" class="image-property">
                    </div>
                    <div>
                        <h1 class="heading-1"> Miss & Mrs Hair salon for women</h1>
                        <div class="star-con">
                        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            <span class="fa fa-star checked"></span>
                            </div>
                            <h2 class="heading-2"> Services offered:</h2>
                            <ul class="list-items">
                                <li> Long Airy Layers  [Rs.3999] </li>
                                <li> Baby Bangs  [Rs.5999] </li>
                                <li> Blunt Bobs and Lobs  [Rs.6999] </li>
                                <li> Bobby pin hair styles  [Rs.7999] </li>
                                <li>Bridal Packages(Starts at Rs.10,999)</li>

                            </ul>

                            <h3 class="heading-3" onclick="salon3()"> Check our services and Book the Appointment.</h3>
                    </div>
                    </div>
    <script>
        function salon1(){
          window.location.href="http://127.0.0.1:5500/salon1.html"
        }
        function salon2(){
         window.location.href="http://127.0.0.1:5500/salon2.html"
        }
        function salon3(){
          window.location.href="http://127.0.0.1:5500/salon3.html"
        }
    </script>

                </body>
</html>