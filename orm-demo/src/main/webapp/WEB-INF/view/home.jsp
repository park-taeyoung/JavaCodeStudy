<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
    </br>
    <table>
        <tr>
            <th>순번</th>
            <th>작성자</th>
            <th>제목</th>
            <th>내용</th>
        </tr>
        <c:forEach var="response" items="${ responseList }">
            <tr>
                <td>${ response.id }</td>
                <td>${ response.writer }</td>
                <td>${ response.title }</td>
                <td>${ response.content }</td>
            </tr>
        </c:forEach>
    </table>
    <button type="button" style="margin-top: 15px; margin-bottom:15px" onclick="location.href='/create-form'">글쓰기</button>
</body>
</html>