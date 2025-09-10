package Fundamentals.Inheritance.Computer;

public class Computer {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        // Using composition
//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//
//        // Using getter method to then execute on that
//        thePC.getMotherboard().loadProgram("Windows OS");
//
//        thePC.getComputerCase().pressPowerButton();


        thePC.powerUp();
    }
}
