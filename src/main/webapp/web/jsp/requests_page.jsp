<%--
  Created by IntelliJ IDEA.
  User: Wil i.m
  Date: 4/27/2022
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <a href = "/user/${userId}">
     Профиль
 </a>
 <a href ="/create-request">
     Создать запрос
 </a>
 <br><br>
<c:if  test="$(ThisIsCreationRequestSage == false)">
    hi
</c:if>
<c:if test="$(ThisIsCreationRequestSage == true)">
    <form method="post" action="/create-request">
        <input type="text" name="requestName" placeholder="Напишите сюда ваше Имя" autofocus><br>
        <input type="text" name="requestMessage" placeholder="Напишите сюда вашу проблему" autofocus><br>
        <button type="submit">Создать запрос</button> <br>
    </form>

</c:if>

</body>
</html>
