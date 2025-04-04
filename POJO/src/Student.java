
public class Student {
	private String id;
	private String name;
	private String dateOfBirth;
	private String classList;
	
	public Student(String id, String name, String dateOfBirth, String classList) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.classList = classList;
	}
	
	@Override
	public String toString() {
		return "Student\n{\n" + 
				" id = '" + id + "',\n" +
				" name = '" + name + "',\n" +
				" date of birth = '" + dateOfBirth + "',\n" +
				" class = '" + classList + "',\n}\n";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDateOfBirth() {
		return id;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getClassList() {
		return classList;
	}
	public void setClassList(String classList) {
		this.classList = classList;
	}
}