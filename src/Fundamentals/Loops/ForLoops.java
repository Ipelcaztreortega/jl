package Fundamentals.Loops;

public class ForLoops {
    public static void main(String[] args) {
        for (int counter = 1; counter <=5; counter++) {
            System.out.println(counter);
        };

        // Using for loop without break but having a condition
        int count = 0;
        for (int i = 10; count < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
            };
            count++;
        }

        for (double i = 7.5; i <= 10; i+= 0.25) {
            double interestAmount = calculateInterest(100.00, i);
            System.out.println("$100.00 at " + i + "% interest = $" + interestAmount);
        }
    };

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    };

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        };

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            };
        };
        return true;
    };
}
