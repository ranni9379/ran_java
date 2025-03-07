package collection3;

import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao extends DBConnect{
	 
	
public ArrayList<Member> select(){	
    String sql = "select * from member1";
    
    ArrayList<Member> list = new ArrayList<>();
    
    try {
       st = conn.createStatement();  // 데이터 조회
        rs = st.executeQuery(sql);  // 조회한 결과 넣음(?? 조회결과 확인이었나)
        
       while(rs.next()) {
          Member m = new Member(rs.getLong("id"),
                rs.getString("member_id"), rs.getString("email"), 
                rs.getString("password"), rs.getString("birth"), 
                (int)(Math.random()*21 +20));
          
          list.add(m);
          
       }
       
       
    } catch (SQLException e) {
       System.out.println("member1 전체 조회 실패");
       e.printStackTrace();
    }
    return list;
 }
 


}