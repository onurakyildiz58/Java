public class Nextmain {
	public static void main(String[] args) {
		
		Movie movie = Movie.getMovie("jaws", "a");
		movie.watchMovie();
		
		//casting
		Adventure jaws = (Adventure) Movie.getMovie("jaws", "a");
		jaws.watchMovie();
		
		Object comedy = Movie.getMovie("comedy", "c");
		Comedy comedyMovie = (Comedy) comedy;
		comedyMovie.watchComedy();
		
		var movie1 = Movie.getMovie("comedy", "c");
		movie1.watchMovie();
		
		var plane = new Comedy("comedy");
		plane.watchComedy();
		
		Object unknown = Movie.getMovie("comedy", "c");
		if(unknown.getClass().getSimpleName() == "Comedy") {
			Comedy c = (Comedy) unknown;
			c.watchComedy();
		}else if (unknown instanceof Adventure) {
			((Adventure) unknown).watchAdventure();	
		}else if (unknown instanceof Drama drm) {
			drm.watchDrama();
		}
	}
}
 