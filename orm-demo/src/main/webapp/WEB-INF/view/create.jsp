<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<html>
<head>
<title>Create</title>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
 
<body>
<div class="container">
 
    <div class="page">
        <form class="form-horizontal">
            <div class="form-group">
                <label for="title" class="col-md-3 col-sm-12 control-label">제목</label>
 
                <div class="col-md-4 col-sm-12">
                    <input id="title" name="title" type="text" class="form-control"
                           required="required" placeholder="Title">
                </div>
                <div class="col-md-5"></div>
            </div>
            <div class="form-group">
                <label for="writer" class="col-md-3 col-sm-12 control-label">글쓴이</label>
 
                <div class="col-md-4 col-sm-12">
                    <input id="writer" name="writer" type="text" class="form-control"
                           required="required" placeholder="Writer">
                </div>
                <div class="col-md-5"></div>
            </div>
            <div class="form-group">
                <label for="content" class="col-md-3 col-sm-12 control-label">내용</label>
 
                <div class="col-md-6 col-sm-12">
                    <textarea id="content" name="content" required="required" class="form-control"
                              rows="8" placeholder="Your text here"></textarea>
                </div>
                <div class="col-md-3"></div>
            </div>
            <div class="form-group">
                <div class="col-md-3"></div>
                <div class="col-md-6 col-sm-12">
                    <button class="btn btn-primary" id="save_button">저장</button>
                </div>
                <div class="col-md-3"></div>
            </div>
        </form>
    </div>
</div>
 
<script>
    $("#save_button").on('click', function () {
 
        var params = {
            "title": $("#title").val(),
            "content": $("#content").val(),
            "writer": $("#writer").val()
             
        }
        $.ajax({
            type: "POST",
            url: "/save",
            data: JSON.stringify(params),
            dataType: "html",
            contentType: "application/json;",
            success: function (args) {
                alert("작성완료");
                window.location.href = "/";
            },
            error: function (e) {
                alert("오류가 발생하였습니다.");
            }
        });
    });
</script>
</body>
 
</html>