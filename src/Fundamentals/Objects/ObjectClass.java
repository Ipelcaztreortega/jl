package Fundamentals.Objects;

public class ObjectClass extends java.lang.Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max.toString()); // Prints out class name + @ + hashcode (integer unique to an instance in the running code)

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 7, "Carol");
        System.out.println(jimmy);

    };
}

class Student {
    private String name;
    private int age;

    // Creating constructor
    Student (String name, int age) {
        this.name = name;
        this.age = age;
    };

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "Fundamentals.Objects.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

// Extends Fundamentals.Objects.Student, added attribute/field,
class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}