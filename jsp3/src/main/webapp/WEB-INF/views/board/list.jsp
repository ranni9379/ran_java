<%@page import="DTO.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%--signIn.jsp --%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 게시판 </title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel="icon" href="http://localhost:8080/jsp3/static/images/무민러브.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp3/static/css/defalt.css">

<style>

	#main{
		padding:30px 100px;
		position: relative;
	}
	#boardTop{
		position:relative;
		width:100%;
		font-size:20px;
		text-align:center;
	}
	#boardTop .write-bt{
		position:absolute;
		top:0; right:0;
		
	}
	#boardlist{
		width:100%;
		margin: 20px 0;
	}
	#boardlist .list-table{
		width:100%;
		border-collapse: collapse;
	}
	#boardlist .list-table td{
		boder-bottom:1px solid #ccc;
		padding: 15px 0;
		font-size:17px;
	}
	#boardlist .list-table .num{ width:10%; }
	#boardlist .list-table .title{ width:40%; }
	#boardlist .list-table .writer{ width:25%; }
	#boardlist .list-table .date{ width:25%; }
	
	#boardlist .list-table tbody tr:nth-child(odd){
		background:#eee;
	}
	

</style>



</head>
<body><div id="wrap"><%@ include file="../header.jsp" %>
  
  <%
   ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("boardList");

%>
  
  
  
  <div id="main"> <div id = "boardTop">
            <b>러브가 무엇이오</b>
            <a href="/jsp3/board/write" class="write-bt">글쓰기</a>
         </div>
         
         <div id = "boardlist">
            
            <div>
             검색: <input type="text" id="keyword">
            </div>
            
            <table class="list-table">
            
               <thead>
                  <tr> 
                     <th class="num">번호</th>
                     <th class="title">제목</th>
                     <th class="writer">작성자</th>
                     <th class="date">작성일</th>
                  </tr>
               </thead>
            
               <tbody id="dataList">
               
               <%
               
               for(Board board : list){
               
               %>
               
               
               <tr>
               <td class="num"><%= board.getBoardId() %></td>
               <td class="title"><%= board.getTitle() %></td>
               <td class="writer"><%=board.getWriter() %></td>
               <td class="date"><%=board.getWriteDate() %></td>
               
               </tr>
               
               <% } %>
				</tbody>
			</table>
			</div>

		</div>
		<%@ include file="../footer.jsp"%>

</div>
</body>
</html>
<script>
$("#keyword").on("keyup",function(){
	var key = $(this).val();
	$("#dataList tr").filter(function(){
		$(this).toggle($(this).text().indexOf(key) > -1)
	})
})
</script>