package other_programmes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Strawberry");
        fruits.add("Pineapple");
        fruits.add("Cherry");
        fruits.add("Pomegranate");
        fruits.add("Guava");

        System.out.println(fruits);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any index number: ");
        int index = scanner.nextInt();
        System.out.println(fruits.get(index));
    }
}
