public class Main extends Object {
	public static void main(String[] args) {
		Student onur = new Student("onur", 24);
		System.out.println(onur.toString()); // Student@5acf9800
		System.out.println(onur); // Student{name=onur, age=24}
		
		PrimaryStudent fero = new PrimaryStudent("fero", "onur", 24);
		System.out.println(fero);
	}
}

class Student{
	private String name;
	private int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		return super.toString();
//	}
	
	@Override
	public String toString() {
		return "Student{name=" + name + ", age=" + age + "}";
	}
}

class PrimaryStudent extends Student{
	private String parentName;
	
	PrimaryStudent(String parentName, String name, int age){
		super(name, age);
		this.parentName = parentName;
	}
	
	@Override
	public String toString() {
		return "Student{parentName=" + parentName + "}" + super.toString();
	}
}