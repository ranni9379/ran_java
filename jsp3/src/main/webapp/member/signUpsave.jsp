<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- signUpSave.jsp --%>

<%-- 데이터베이스 연결 --%>
<% 
Connection conn=null;
PreparedStatement pt=null;

try{
Class.forName("com.mysql.cj.jdbc.Driver");
	String user = "ranni";
	String pass = "9379";
	String url= "jdbc:mysql://210.219.170.244:3306/ranni";
	conn = DriverManager.getConnection(url,user,pass);
}catch(Exception e){
	System.out.println("드라이버 로드 실패 및 접속 실패");
	e.printStackTrace();
}

String email = request.getParameter("email");
String password = request.getParameter("password");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
String tempYear = request.getParameter("birthYear");
String tempMonth = request.getParameter("birthMonth");
int year = Integer.parseInt(tempYear);
int month = Integer.parseInt(tempMonth);

//쿼리문 작성하여 테이블에 저장하기
String query = "insert into test_member(email,password,name,"+
" tel,birth_year,birth_month) values(?,?,?,?,?,?)";

try{
	
	pt = conn.prepareStatement(query);
	pt.setString(1, email);
	pt.setString(2, password);
	pt.setString(3, name);
	pt.setString(4, tel);
	pt.setInt(5, year);
	pt.setInt(6, month);
	pt.executeUpdate(); //쿼리문과 데이터 전달
}catch(SQLException e){
	e.printStackTrace();
	
}


%>
<%=email %>