<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
	<form action="/example/RegisterUser" method="post">
		<p>
			ログインID：<input type="text" name="id">
		</p>
		<p>
			パスワード：<input type="password" name="pass">
		</p>
		<p>
			名前：<input type="text" name="name">
		</p>
		<p>
			<input type="submit" value="確認">
		</p>
	</form>
</body>
</html>