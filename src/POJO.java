public class POJO {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudentPOJO s = new LPAStudentPOJO("S9300" + i,
                    //  Using switch expression as an argument
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass"
                    );
            System.out.println(s); // Built-in feature, every object when passed to println() will have the toString method implicitly implemented if you have to the method created.
        };

        // Viewing the printing of each and how they are different
        StudentPOJO pojoStudent = new StudentPOJO("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudentPOJO recordStudent = new LPAStudentPOJO("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        // How using getters for each differs
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList()); // records use the name of the component/field

        // How using setters for each differs, records are meant to be immutable, so we can't really set the new classList
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Examp 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());


    };
}
