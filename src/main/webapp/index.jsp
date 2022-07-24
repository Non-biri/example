<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int max_col = 5, max_row = 5;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="stylesheet.css">
<title>HTMLのプルダウンリスト表の検証</title>
</head>
<body>

	<h1>位置を選択してください</h1>

	<div class="main" id="main">
		<div class="form">
			<form action="/example/Main" method="post">
				<table class="t1">
					<%
					for (int row_i = 0; row_i < max_row; row_i++) {
					%>
					<tr>
						<%
						for (int col_j = 0; col_j < max_col; col_j++) {
						%>
						<td><select name="cell_<%=col_j%><%=row_i%>">
								<option value="none"></option>
								<option value="W">W</option>
								<option value="D">D</option>
								<option value="S">S</option>
						</select></td>
						<%
						}
						%>
					</tr>
					<%
					}
					%>
				</table>
				<p class="submit">
					<input type="submit" value="確定">
				</p>
			</form>
		</div>

	</div>
</body>
</html>