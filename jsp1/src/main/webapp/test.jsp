<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    String
    <%
    // 스크립틀릿- 변수, if, while, arraylist 가능, 그러나 메서드 선언, 클래스 정의 안됨!
    age =25;
    %>
    <%!
    int age =0;
    int[] arr =new int[]{10,20,30,40,50,60};
    // 선언문 - 변수, 메서드 선언, 클래스 정의(for문  if문  계산식 안됨!)
    %>
    <%=age
    //출력용
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<h1><%=age%></h1>
 	<ul>
 		<%
 			for(int i=0; i<arr.length; i++){
 		%>
 		<li> <%=arr[i] %></li>
 		<% } %>
 	</ul>
</body>
</html>