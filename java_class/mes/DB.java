package mes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;



public class DB {
	Connection conn = null;
	String msg = null;
    
    String sql;
	public Connection MakeConnection(){
	
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		String url = "jdbc:mariadb://localhost/msg_db";
		
		conn = DriverManager.getConnection(url, "root","sql1234");
		System.out.println("연결 성공");
		
	}catch(ClassNotFoundException e){
		System.out.println("class name error");
		
	} catch (SQLException e) {
		System.out.println("에러 : " + e);
	}	
	return  conn;
}
	
	public void saveLog(String log) {
	  try {	
       Connection conn = MakeConnection();
	   Statement st = conn.createStatement();
	   String s = "INSERT INTO msg_log (msg) VALUES ";
	   s +="('"+log+"')";
	   System.out.println(s);
	   int i = st.executeUpdate(s);
	   if(i==1)
	   {
		   System.out.println("성공");
	   }else {
		   System.out.println("실패");
	   }
	   conn.close();
		
	  }catch(SQLException e)
	  {
		  System.out.println(e.getMessage());
	  }
	}
	public void saveID(String ID, String pass)
	{
		try {
			Connection conn = MakeConnection();
			String s = "INSERT INTO user_table(uid,pwd) VALUES(?,?)";
			PreparedStatement psmt = conn.prepareStatement(s);
			psmt.setString(1, ID);
			psmt.setString(2, pass);
			
			int result = psmt.executeUpdate();
			if(result==1)
			{
			     System.out.println("성공");
			}else
			{
				System.out.println("실패");
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
     public String IDPASS(String ID)
     {
    	 String pw= new String();
    	 try {
    		 Connection conn = MakeConnection();
    		 String s = "SELECT pwd FROM user_table WHERE uid=?";
    		 PreparedStatement psmt = conn.prepareStatement(s);
    		 psmt.setString(1, ID);
    		 ResultSet rs = psmt.executeQuery();
    	     while(rs.next())
    	     {
    	    	 pw = rs.getString(1);
    	    	
    	     }
    	
    		 
    	 }catch(SQLException e)
    	 {
    		 e.printStackTrace();
    	 }
    	 finally {
    	 return pw;
    	 }
     }
	
	
}
