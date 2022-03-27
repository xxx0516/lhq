<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
	<title>login</title>
	<link rel="stylesheet" type="text/css"
		  href="css/style.css"/>
</head>

<body>
<div id="wrap">
	<div id="top_content">
		<div id="header">
			<div id="rightheader">
				<p>
					2009/11/20
					<br/>
				</p>
			</div>
			<div id="topheader">
				<h1 id="title">
					<a href="#">主页</a>
				</h1>
			</div>
			<div id="navigation">
			</div>
		</div>
		<div id="content">
			<p id="whereami">
			</p>
			<h1>
				登录
			</h1>
			<form action="${pageContext.request.contextPath}/login" method="post">
				<table cellpadding="0" cellspacing="0" border="0"
					   class="form_table">
					<tr>
						<td valign="middle" align="right">
							username:
						</td>
						<td valign="middle" align="left">
							<input type="text" class="inputgri" name="adminName" placeholder="请输入管理员名称"/>
							<p style="color: red">${loginMessage}</p>
						</td>
					</tr>
					<tr>
						<td valign="middle" align="right">
							password:
						</td>
						<td valign="middle" align="left">
							<input type="password" class="inputgri" name="adminPwd"/>
						</td>
					</tr>
				</table>
				<p>
					<input type="submit" class="button" value="Submit &raquo;"/>
				</p>
			</form>
		</div>
	</div>
	<div id="footer">
		<div id="footer_bg">
			ABC@126.com
		</div>
	</div>
</div>
</body>
</html>
