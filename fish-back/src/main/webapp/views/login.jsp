<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Floating labels example for Bootstrap</title>
    <jsp:include page="common/public.jsp"/>
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">

</head>

<body>
<form id="loginForm" class="form-signin" action="${pageContext.request.contextPath}/login" method="post">
    <div class="text-center mb-4">
        <h1 class="h3 mb-3 font-weight-normal">User Login</h1>
    </div>

    <div class="form-group">
        <input type="text" class="form-control" name="userId" aria-describedby="emailHelp" placeholder="Enter email">
    </div>
    <div class="form-group">
        <input type="password" class="form-control" name="userNickName" placeholder="Password">
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
</form>

<script src="${pageContext.request.contextPath}/js/login/login.js"></script>
</body>
</html>
