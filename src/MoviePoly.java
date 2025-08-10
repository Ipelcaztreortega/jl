import java.util.Scanner;

public class MoviePoly {
    public static void main(String[] args) {


//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy" + "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            // If user enters a Q or q, break
            if ("Qq".contains(type)) {
                break;
            };
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();

            // This is an example of polymorphism, the ability to execute different behavior for different types, which are determined at runtime.
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    };
}
