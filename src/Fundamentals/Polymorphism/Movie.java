package Fundamentals.Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    };

    public void watchMovie() {
        // Calling built in java class, that returns class type info about the run time instance
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    };

    // Anyone can call this method to get a movie instance  with the type and title

    // This returns a new instance object is called a factory method, gives us a way to create an object without knowing the details of how to make one
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) { // Grabs the uppercase first letter
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
};

class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie(); // This calls the base class watchMovie(), with the overriden extra
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens"
                );
    };

    public void watchAdventure() {
        System.out.println("Watching an adventure movie");
    }
}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie(); // This calls the base class watchMovie(), with the overriden extra
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending"
        );
    };

    public void watchComedy() {
        System.out.println("Watching a comedy movie");
    }
};

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie(); // This calls the base class watchMovie(), with the overriden extra
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens",
                "Space Guys",
                "Blows up"
        );
    };

    public void watchScienceFiction() {
        System.out.println("Watching a science fiction");
    }
}