import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
				
		System.out.println("-".repeat(50));
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("A for Adventure \nC for Comedy \nD for Drama \nQ for Quit : ");
			String type = s.nextLine();
			if ("qQ".contains(type)) {
				break;
			}
			System.out.print("Enter movie title : ");
			String title = s.nextLine();
			Movie movie = Movie.getMovie(title, type);
			movie.watchMovie();
		}
	}
}
