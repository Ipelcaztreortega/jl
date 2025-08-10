package dev.ipo;

public class Main {
    public static void main(String[] args) {
//        Item firstItem = new Item("Burger");
        com.abc.first.Item firstItem = new com.abc.first.Item("Burger"); // Using the FQCN
        System.out.println(firstItem);
    }
}
