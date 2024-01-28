package member_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jdbc_p.PersonDTO;

public class MemberDAO {

	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql;
	
	public MemberDAO() {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			//1. db 연결
			con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/jsp_db", 
					"green", 
					"123456");
			
			//2. sql구문 실행 객체
			stmt = con.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	void close() {
		//5. sql 실행 객체 해제
		if(rs!=null) { 
			try {rs.close();} catch (SQLException e) {} 
		}
		if(stmt!=null) { 
			try {stmt.close();} catch (SQLException e) {} 
		}
		
		
		//6. db 연결 해제
		if(con!=null) { 
			try {con.close();} catch (SQLException e) {} 
		}
	
	}
	
	
	
	
	public ArrayList<MemberDTO> list(){
		ArrayList<MemberDTO> res = new ArrayList<MemberDTO>();
		
		try {
			sql = "select * from member";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setNick_name(rs.getString("nick_name"));
				dto.setId(rs.getString("id"));
				dto.setPwd(rs.getString("pwd"));
				dto.setEmail(rs.getString("email"));
				dto.setPhone_number(rs.getString("phone_number"));
				dto.setReg_date(rs.getDate("timestamp"));
				dto.setGender(rs.getInt("gender"));
				dto.setJumin1(rs.getString("jumin1"));
				dto.setJumin2(rs.getString("jumin2"));
				
				res.add(dto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			close();
		}
		
		return res;
	}
	
	public MemberDTO login(MemberDTO dto) {
		MemberDTO ttt =null;
		sql ="select id,nick_name from `member` where id ='"+dto.getId()+"' and pwd='"+dto.getPwd()+"'";
		
		try {		
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				ttt =new MemberDTO();
				ttt.setId(rs.getString("id"));
				ttt.setNick_name(rs.getString("nick_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
			
		}finally {
			close();
		}
		return ttt;
		
	}
	
	public int write(MemberDTO dto){
		 int res=0;
		
		try {
			sql = " insert into member "
			+" (nick_name, id, pwd,email,phone_number,reg_date,gender,jumin1,jumin2) "
			+ " values "
			+ " ('"+dto.getNick_name()+"','"+dto.getId()
			+"','"+dto.getPwd()+"','"+dto.getEmail()
			+"','"+dto.getPhone_number()+"', sysdate()"
			+","+dto.getGender()+",'"+dto.getJumin1()
			+"', '"+dto.getJumin2()+"')";
			
			System.out.println(sql);
			
					
			
			res = stmt.executeUpdate(sql);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return res;
	}

}