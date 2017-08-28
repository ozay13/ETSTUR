<%-- 
    Document   : detail
    Created on : Aug 28, 2017, 8:09:32 PM
    Author     : ozaytunctan13
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Otel Detayları</h1>
        <c:forEach items="otel" var="a">
           Title: <c:out value="${a.title}"/>
            Location: <c:out value="${a.location}"/>
             Puan: <c:out value="${a.score}"/>
        </c:forEach>
    </body>
</html>
