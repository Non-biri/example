<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
	<h1>スッキリ健康診断</h1>
	<form action="/example/HealthCheck" method="post">

		<p>
			身長：<input type="text" name="height">(cm)
		</p>
		<p>
			体重：<input type="text" name="weight">(kg)
		</p>
		<input type="submit" value="診断">
	</form>
</body>
</html>