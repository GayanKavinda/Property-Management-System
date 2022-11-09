package methods;
import feedback.Feedback;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import servlet.*;

public class feedbackcrud {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","1234");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Feedback f){
		int status=0;
		int y = 0;
		try{
			Connection con=feedbackcrud.getConnection();
			
			PreparedStatement  ps1 = con.prepareStatement("select custID from feedbacks_detail2 where custID >= all (select custID from feedbacks_detail2)");
			
			
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				 y = Integer.parseInt(rs.getString(1));
			}
			
			PreparedStatement ps=con.prepareStatement("insert into feedbacks_detail2(custID,name,mail,selection,rateValue,comment) values (?,?,?,?,?,?)");
			int id = generateId.generateIDs(y);
			ps.setInt(1,id);
			ps.setString(2,f.getCustomerName());
			ps.setString(3,f.getCustomerMail());
			ps.setString(4,f.getAnsForQuestion1());
			ps.setString(5,f.getAnsForQuestion2());
			ps.setString(6,f.getComment());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int update(Feedback f){
		int status=0;
		
		try{
			Connection con=feedbackcrud.getConnection();
			PreparedStatement ps=con.prepareStatement("update feedbacks_detail2 set name=?,mail=?,selection=?,rateValue=?,comment=? where custID=?");
			ps.setString(1,f.getCustomerName());
			ps.setString(2,f.getCustomerMail());
			ps.setString(3,f.getAnsForQuestion1());
			ps.setString(4,f.getAnsForQuestion2());
			ps.setString(5,f.getComment());
			
			ps.setLong(6,f.getCustomerID());
			
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int delete(int custID){
		int status=0;
		try{
			Connection con=feedbackcrud.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from feedbacks_detail2 where custID=?");
			ps.setInt(1,custID);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static Feedback getFeedbackById(int custID){
		Feedback f=new Feedback();
		
		try{
			Connection con=feedbackcrud.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from feedbacks_detail2 where custID=?");
			ps.setInt(1,custID);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				f.setCustomerID(rs.getInt(1));
				f.setCustomerName(rs.getString(2));
				f.setCustomerMail(rs.getString(3));
				f.setAnsForQuestion1(rs.getString(4));
				f.setAnsForQuestion2(rs.getString(5));
				f.setComment(rs.getString(6));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return f;
	}
	public static List<Feedback> getAllFeedbacks(){
		List<Feedback> list=new ArrayList<Feedback>();
		
		try{
			Connection con=feedbackcrud.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from feedbacks_detail2");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Feedback f=new Feedback();
				f.setCustomerID(rs.getInt(1));
				f.setCustomerName(rs.getString(2));
				f.setCustomerMail(rs.getString(3));
				f.setAnsForQuestion1(rs.getString(4));
				f.setAnsForQuestion2(rs.getString(5));
				f.setComment(rs.getString(6));
				list.add(f);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
