package Fundamentals.Polymorphism;

import java.util.Scanner;

public class MoviePoly {
    public static void main(String[] args) {


//        Fundamentals.Polymorphism.Movie theMovie = Fundamentals.Polymorphism.Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Fundamentals.Polymorphism.Adventure, C for Fundamentals.Polymorphism.Comedy" + "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            // If user enters a Q or q, break
            if ("Qq".contains(type)) {
                break;
            };
            System.out.println("Enter Fundamentals.Polymorphism.Movie Title: ");
            String title = s.nextLine();

            // This is an example of polymorphism, the ability to execute different behavior for different types, which are determined at runtime.
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    };
}
