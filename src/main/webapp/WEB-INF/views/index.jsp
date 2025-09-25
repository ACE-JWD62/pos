<%--
  Created by IntelliJ IDEA.
  User: ict-appimplement08
  Date: 24/09/2025
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../resources/css/global.css" />
    <link rel="stylesheet" type="text/css" href="../../resources/css/login.css" />
</head>
<body>


<div class="Main-Container">


    <div class="left-img-conatiner">
        <img src="https://placehold.co/600x600" alt="" srcset="">
    </div>


    <div class="right-container">

        <form method="post" action="auth/login">
            <h2>Welcome from JD POS</h2>
            <input type="text" placeholder="username"  name="username"/>
            <input type="password" placeholder="password" name="password" />


            <button class="login-button" >LOGIN</button>
        </form>
    </div>


</div>


</body>
</html>
