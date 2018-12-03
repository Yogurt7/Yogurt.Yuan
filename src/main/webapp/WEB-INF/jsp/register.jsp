<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="en" class="no-js">
<head>
<meta charset="utf-8">
<title>用户注册</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- CSS -->
<link rel="stylesheet" href="<%=basePath%>assets/css/reset.css">
<link rel="stylesheet" href="<%=basePath%>assets/css/supersized.css">
<link rel="stylesheet" href="<%=basePath%>assets/css/style.css">
<script type="text/javascript">
<!--注册表 -->
	function disable() {
		document.getElementById("btnRegister").disabled = true
		$(".info_inner button").attr("style", "background:#c0c0c0");
	}
	function enable() {
		document.getElementById("btnRegister").disabled = false
		$(".info_inner button").attr("style", "background:#2abba3");
	}
</script>


</head>

<body>
	<input id="basePath" type="hidden" value="<%=basePath%>" />
	<div class="page-container">
		<h1>注册</h1>
		<form id="" action="/user/register" method="post">
			<input type="text" id="telephone" name="telephone" class="telephone"
				placeholder="请输入手机号" pattern="^1(3|4|5|7|8)\d{9}$"
				required="required"> <input type="password" id="password"
				name="password" class="password" pattern="[A-Za-z0-9]{6,12}"
				required="required" placeholder="请输入密码"> <label class="left">
				<input type="checkbox"
				onclick="if (this.checked) {enable()} else {disable()}"
				class="left mt4" style="margin-right: 20px;" />我已阅读同意
			</label> <a href="#" class="left">《用户注册协议》</a>
			<button id="btnRegister" type="submit" disabled="disabled">注册</button>
			<div id="login-error" style="color: #F00">${requestScope.message}</div>
		</form>
	</div>

	<!-- Javascript -->
	<script src="<%=basePath%>assets/js/jquery-1.8.2.min.js"></script>
	<script src="<%=basePath%>assets/js/supersized.3.2.7.min.js"></script>
	<script src="<%=basePath%>assets/js/supersized-init.js"></script>
	<script src="<%=basePath%>assets/js/scripts.js"></script>



</body>

</html>


