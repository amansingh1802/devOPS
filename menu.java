package test;
import java.util.Date;
import java.util.Scanner;

public class menu 
{
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) 
	{  
		
		//menu 1 for owner ,member , librariarn
		int choice;
		System.out.println("0 EXIT");
		System.out.println("1 SIGN IN");
		System.out.println("2 SIGN UP");
		System.out.println("enter your choice");
		choice = sc.nextInt();
		
		switch (choice) 
		{
		case 0:
			System.exit(0);
		case 1:
			//call signin function
			signIn();
			break;
		case 2:
			//call signup function
			signUp();
		default:
			System.out.println("INVALID INPUT...TRY AGAIN");
		}

		public void signIn()
		{
			
		}
		public void signUp()
		{
			
		}
		//menu 2 for edit profile
		int choice1  ;
		System.out.println("0. sign out");
		System.out.println("1. edit profile");
		System.out.println("2. change password");
		System.out.println("3. subjectwise copies report");
		System.out.println("4. Bookwise copies report");
		System.out.println("5. fees/fine ");
		choice1 = sc.nextInt();

		
		switch (choice1)
		{
		case 0:
			//signout function
			signOut();
			break;
		case 1:
			//edit profiile funct
			break;
		case 2:
			//change password
			break;
		case 3:
			// subject wise copies report
			break;
		case 4:
			//bookwise copies report
			break;
		case 5:
			//Fees/fine rport
			break;
		
		default:
			break;
		}
		
		//meni for finding the book by name 
		int choice3;
		System.out.println("0. sign out");
		System.out.println("1. edit profile");
		System.out.println("2. change password");
		System.out.println("3. find book by name");
		System.out.println("4. check book availability");
		System.out.println("5. add new book");
		System.out.println("6. add new copy ");
		System.out.println("7. issue book copy");
		System.out.println("8. return book copy");
		System.out.println("9. list issued books");
		System.out.println("10. edit book");
		System.out.println("11. change rack");
		System.out.println("12. add number");
		System.out.println("13. take payment");
		System.out.println(" payment history");
		choice3 = sc.nextInt();

		switch (choice3)
		{
		case 0:
			//signout function
			break;
		case 1:
			//edit profiile funct
			break;
		case 2:
			//change password
			break;
		case 3:
			//find book by nmae
			
			break;
		case 4:
			//check book availability;
			break;
		case 5:
			//add new book;
			break;
		case 6:
			//add newcopy
			break;
		case 7:
			// issue book copy
			break;
		case 8:
			//return book copy
			break;
		case 9:
			//list issued books
			break:
		case 10:
			//edit book
			break;
		case 11:
			//change rack
			break;
		case 12:
			//add member
			break;
		case 13:
			// take payment
			break;
		case 14:
			// payment history
		default:
			break;
		}
		
		
		//meni for librarian
				int choice4;
				System.out.println("0. sign out");
				System.out.println("1. edit profile");
				System.out.println("2. change password");
				System.out.println("3. find book by name");
				System.out.println("4. check book availability");
				System.out.println("5. add new book");
				System.out.println("6. add new copy ");
				System.out.println("7. issue book copy");
				System.out.println("8. return book copy");
				System.out.println("9. list issued books");
				System.out.println("10. edit book");
				System.out.println("11. change rack");
				System.out.println("12. add number");
				System.out.println("13. take payment");
				System.out.println(" payment history");
				choice3 = sc.nextInt();

				switch (choice3)
				{
				case 0:
					//signout function
					
					break;
				case 1:
					//edit profiile funct
					break;
				case 2:
					//change password
					break;
				case 3:
					//find book by nmae
					
					break;
				case 4:
					//check book availability;
					break;
				case 5:
					//add new book;
					break;
				case 6:
					//add newcopy
					break;
				case 7:
					// issue book copy
					break;
				case 8:
					//return book copy
					break;
				case 9:
					//list issued books
					break:
				case 10:
					//edit book
					break;
				case 11:
					//change rack
					break;
				case 12:
					//add member
					break;
				case 13:
					// take payment
					break;
				case 14:
					// payment history
					break;
				case 15:
					//list all users
					break;
					
				default:
					break;
				}
				
		
		
	}
} 
class books
{
	private int id;
	private String name;
	private String author;
	private String subject;
	private float price;
	private String isbn;
	
	public books(int id, String name, String author, String subject, float price, String isbn) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.subject = subject;
		this.price = price;
		this.isbn = isbn;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	
	
	

}


class issuerecord
{
	private int id;
	private int copyid;
	private int memberid;
	private Date issue_date;
	private Date return_duedate;
	private Date return_date;
	private float fine_amount;
	

	public issuerecord(int id, int copyid, int memberid, Date issue_date, Date return_duedate, Date return_date,
			float fine_amount) {
		super();
		this.id = id;
		this.copyid = copyid;
		this.memberid = memberid;
		this.issue_date = issue_date;
		this.return_duedate = return_duedate;
		this.return_date = return_date;
		this.fine_amount = fine_amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCopyid() {
		return copyid;
	}
	public void setCopyid(int copyid) {
		this.copyid = copyid;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public Date getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}
	public Date getReturn_duedate() {
		return return_duedate;
	}
	public void setReturn_duedate(Date return_duedate) {
		this.return_duedate = return_duedate;
	}
	public Date getReturn_date() {
		return return_date;
	}
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	public float getFine_amount() {
		return fine_amount;
	}
	public void setFine_amount(float fine_amount) {
		this.fine_amount = fine_amount;
	}
	
}

class 

