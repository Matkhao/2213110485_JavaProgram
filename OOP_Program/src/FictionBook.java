
public class FictionBook implements Author1 , Book1 {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title , int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public boolean checkEmail() {
		
	}
	
	public String getLastName() {
		
	}
	public String getFirstName() {
		
	}
	
	public int totalPublicYear() {
		
	}
	
	public boolean checkFormatName() {
		return true;
	}
	
	public String toString() {
		return getTitle()+"write by " + "." + "(" + ")" + "Published for " + "years.";
	}
}
