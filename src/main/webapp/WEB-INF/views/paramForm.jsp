<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

아이디 : ${param.id} <br/>
나이 : ${param.age } <br/>
이름 : ${param.name }

${sessionScope.login } 님은 접속중

</body>
</html>