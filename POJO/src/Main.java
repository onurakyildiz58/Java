public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			StudentRecords s = new StudentRecords(
					"stu" + i, 
					switch (i) {
					case 0 -> "onur";
					case 1 -> "dexter";
					case 2 -> "debra";
					case 3 -> "hannah";
					case 4 -> "masuka";
					default -> "anonymous";
					}, 
					"21.02.2001", 
					"CS"
			);
			System.out.println(s);
		}
		
		Student pojo = new Student("stu5", "pojoOnur", "21.02.2001", "CS");
		StudentRecords record = new StudentRecords("stu6", "recordOnur", "21.02.2001", "CS");
		
		System.out.println(pojo);
		System.out.println(record);
		
		System.out.println(pojo.getName() + " is study " + pojo.getClassList());
		System.out.println(record.name() + " is study " + record.classList());
	}

}
