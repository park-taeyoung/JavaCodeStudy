<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Index page</title>
</head>
<body>
	TIME : ${time}
	</br> MESSAGE : ${message}
	
	<table>
		<tr>
			<th>순번</th>
			<th>작성자</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
	</table>
	
	<c:forEach var="board" items="${ responseList }">
		<tr>
			<td>${ board.getid }</td>
			<td>${ board.getWriter }</td>
			<td>${ board.getTitle }</td>
			<td>${ board.getContent }</td>
		</tr>
	</c:forEach>
	
</body>
</html>