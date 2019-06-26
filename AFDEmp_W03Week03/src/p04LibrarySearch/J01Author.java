package p04LibrarySearch;

public class J01Author {
	private String name;
	private String email;
	private String gender;
	
	
	public J01Author() {}
	
	public J01Author (String name, String email, String gender) {
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
	public String getGender() {
		return gender;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
