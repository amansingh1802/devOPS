package intergroup_competition;

import java.util.Date;

public class program 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}

public class copies
{
	private int id;
	private int bookid;
	private int rack;
	private String status;
	public copies()
	{	}
	public copies(int id, int bookid, int rack, String status) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.rack = rack;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getRack() {
		return rack;
	}
	public void setRack(int rack) {
		this.rack = rack;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "copies [id=" + id + ", bookid=" + bookid + ", rack=" + rack + ", status=" + status + "]";
	}
}

public class users
{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String passwd;
	private String role;
	public users(int id, String name, String email, long phone, String passwd, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.passwd = passwd;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", passwd=" + passwd
				+ ", role=" + role + "]";
	}
}

public class payments
{
	private int id;
	private int userid;
	private float amount;
	private String type;
	private Date transaction_time;
	private Date nextpayment_duedate;
	public payments(int id, int userid, float amount, String type, Date transaction_time, Date nextpayment_duedate) {
		super();
		this.id = id;
		this.userid = userid;
		this.amount = amount;
		this.type = type;
		this.transaction_time = transaction_time;
		this.nextpayment_duedate = nextpayment_duedate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getTransaction_time() {
		return transaction_time;
	}
	public void setTransaction_time(Date transaction_time) {
		this.transaction_time = transaction_time;
	}
	public Date getNextpayment_duedate() {
		return nextpayment_duedate;
	}
	public void setNextpayment_duedate(Date nextpayment_duedate) {
		this.nextpayment_duedate = nextpayment_duedate;
	}
	@Override
	public String toString() {
		return "payments [id=" + id + ", userid=" + userid + ", amount=" + amount + ", type=" + type
				+ ", transaction_time=" + transaction_time + ", nextpayment_duedate=" + nextpayment_duedate + "]";
	}
	
}


public 