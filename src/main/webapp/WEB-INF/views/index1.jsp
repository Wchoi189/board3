<%--
  Created by IntelliJ IDEA.
  User: Carrot
  Date: 2022-06-27
  Time: 오후 3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Hello Page</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link href="${path}/resources/css/index.css" rel="stylesheet"/>
</head>
<body>
    <h4 class="index">Hello. Welcome to index page.</h4>
    <p>This page is a JSP</p>
</body>
</html>
