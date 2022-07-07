<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.User"%>
<%
User registerUser = (User) session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
	<div>
		<p>下記のユーザーを登録します</p>
		<p>
			ログインID: <%=registerUser.getId()%>
		</p>
		<p>
			名前：<%=registerUser.getName()%>
		</p>
		<a href="/example/RegisterUser">戻る</a>
		<a href ="/example/RegisterUser?action=done">登録</a> <%-- getのリクエストパラメータにActionが完了した事を知らせる信号を載せる --%>
	</div>
</body>
</html>