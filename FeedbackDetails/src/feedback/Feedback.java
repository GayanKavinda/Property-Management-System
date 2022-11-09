package feedback;

public class Feedback {
	private int custID;
	private String name;
	private String comment;
	private String mail;
	private String selection;
	private String rateValue;
	
	public int getCustomerID() 
	{
		return custID;
	}
	
	public void setCustomerID(int custID) {
		this.custID= custID;
	}
	
	public String getCustomerName() {
		return name;
	}
	
	public void setCustomerName(String name) {
		this.name= name;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment= comment;
	}
		
	public String getCustomerMail() {
		return mail;
	}
	
	public void setCustomerMail(String mail) {
		this.mail= mail;
	}
	
	public String getAnsForQuestion1() {
		return selection;
	}
	
	public void setAnsForQuestion1(String selection) {
		this.selection= selection;
	}
	
	public String getAnsForQuestion2() {
		return rateValue;
	}
	
	public void setAnsForQuestion2(String rateValue) {
		this.rateValue= rateValue;
	}
	
}
