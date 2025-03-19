package service;

import java.util.ArrayList;

import DAO.BoardDao;
import DTO.Board;
import jakarta.servlet.http.HttpServletRequest;

public class BoardService {
private BoardDao d = new BoardDao();
	public void save(HttpServletRequest request) {
		// request객체에서 파라미터 값 가져와 Board 클래스 객체에 저장
		//  Board클라스 객체를 DAO에 넘겨주기
		 String writer = request.getParameter("writer");
		 String title = request.getParameter("title");
		 String content = request.getParameter("content");
		 
		 Board b =new Board();
		b.setWriter(writer);
		b.setTitle(title);
		b.setContent(content);
		
		 
		 d.insert(b);
		
		
		
		
	}
	public void allSelect(HttpServletRequest request) {
		ArrayList<Board> list = d.select();
		// 조회 결과를 ArrayList에 저장하고 request의 Attribute로 저장하기
		request.setAttribute("boardList", list);
	}
}
