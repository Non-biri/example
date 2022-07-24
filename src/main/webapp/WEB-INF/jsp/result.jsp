<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String[][] tableArray = (String[][]) request.getAttribute("tableArray");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="stylesheet.css">
<title>HTMLのプルダウンリスト表の検証</title>
</head>
<body>
	<h1>配置されました</h1>

	<div class="main" id="main">
		<table class="t1">
			<%
			for (String[] strAry : tableArray) {
			%>
			<tr>
				<%
				for (String str : strAry) {
				%>
				<td class="result"><%=str%></td>
				<%
				}
				%>
			</tr>
			<%
			}
			%>
		</table>

	</div>
</body>
</html>