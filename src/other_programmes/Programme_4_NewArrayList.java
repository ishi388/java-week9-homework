package other_programmes;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_NewArrayList {
    public static void main(String[] args) {
        //Create a new Arraylist
        ArrayList<String> colors = new ArrayList();

        //Add some colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Black");

        //Print the collection using for-each loop
        for(String color : colors){
            System.out.println(color);
        }
    }
}
