
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author() {
		this.name = "";
		this.email = "";
		this.gender = 0;
	}
	public Author(String name , String email) {
		this.name = name;
		this.email = email;
	}
	
	public Author(String name , String email , char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGenderName() {
		if(gender=='M') {
			return "Male";
		}else if (gender=='F') {
			return "Female";
		}
		return null;
	}
	
	public String toString() {
		return String.format("Author name: " +getName()+ " ("+getEmail()+";"+getGenderName()+")");
	}
}
