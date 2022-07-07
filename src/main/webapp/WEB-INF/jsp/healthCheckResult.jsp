<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Health"%>
<%
// リクエストスコープ上に保存されたHealthインスタンスを取得
Health health = (Health) request.getAttribute("health");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
	<div>
		<h1>スッキリ健康診断の結果</h1>
		<div>
			<p>
				身長：<%=health.getHeight()%></p>
			<p>
				体重：<%=health.getWeight()%></p>
			<p>
				BMI：<%=health.getBmi()%></p>
			<p>
				体型：<%=health.getBodyTybe()%></p>
		</div>
		<a href="/example/HealthCheck">戻る</a>
	</div>
</body>
</html>