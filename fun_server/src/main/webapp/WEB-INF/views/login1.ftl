<#assign ctx=request.contextPath />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
        "http://www.w3.org/TR/html4/strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base id="ctx" href="${ctx}">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <script type="text/javascript" src="${ctx}/assets/js/libs/jquery-2.1.1.min.js"></script>

</head>
<body>
<form action="/rest/msg/login1" method="post">
    ID：<input type="text" name="id"><br>
    <input type="submit" value="登录" >
</form>
</body>
</html>