<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model.User"%>
<%
User registerUser = (User) request.getAttribute("registerUser");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
	<div>
		<p>登録が完了しました</p>
		<p>
			名前：<%= registerUser.getName() %></p>
		<a href="/example/RegisterUser">戻る</a>

	</div>

</body>
</html>