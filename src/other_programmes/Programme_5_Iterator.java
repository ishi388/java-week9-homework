package other_programmes;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_Iterator {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("red");
        colorList.add("blue");
        colorList.add("Pink");
        colorList.add("Yellow");
        colorList.add("Brown");
        colorList.add("Purple");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Green");
        colorList.add("Orange");


        ListIterator<String> iterate = colorList.listIterator();
        System.out.println("Iterating over ArrayList: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
    }
}
