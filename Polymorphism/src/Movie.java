
public class Movie {
	private String title;
	
	public Movie(String title) {
		this.title = title;
	}
	
	public void watchMovie() {
		System.out.println(title + " is a " + this.getClass().getSimpleName() + " movie.");
	}
	
	public static Movie getMovie(String title, String type) {
		return switch (type.toUpperCase().charAt(0)) {
			case 'A' -> new Adventure(title);
			case 'C' -> new Comedy(title);
			case 'D' -> new Drama(title);
			default -> new Movie(title);
		};
	}
	
	public void watchAdventure() {
		System.out.println("watching adventure");
	}
	
	public void watchComedy() {
		System.out.println("watching comedy");
	}
	
	public void watchDrama() {
		System.out.println("watching drama");
	}
}

class Adventure extends Movie {
	 
	public Adventure(String title) {
		super(title);
	}
	
	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf("...%s%n".repeat(3), "Adrenaline", "Pleasant Scene", "Excitement");
	}
}

class Drama extends Movie {
	 
	public Drama(String title) {
		super(title);
	}
	
	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf("...%s%n".repeat(3), "Crying", "Tears", "Runny Nose");
	}
}

class Comedy extends Movie {
	 
	public Comedy(String title) {
		super(title);
	}
	
	@Override
	public void watchMovie() {
		super.watchMovie();
		System.out.printf("...%s%n".repeat(3), "Laughter", "Happy Scene", "Happiness");
	}
}
