public class NextMoviePoly {
    public static void main(String[] args) {

        // Creating a variable with Movie type, and assigning the result of this static call
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        // You can cast instances as well, when can you assign an object of one type to a reference of a different type
//        Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws");
//        jaws.watchMovie();

        // This just assumes that it is an Object, when you try to call movie method because compiler cannot locate that method on the object class
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy(); // Cannot compile on just a movie reference, we need to cast to a more specific type comedy

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else  if (unknownObject instanceof ScienceFiction syfy){ // pattern matching for the isntanceof operator
            syfy.watchScienceFiction();
        }
    }
}
