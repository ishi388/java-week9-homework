package other_programmes;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_EmptyArray {
    public static void main(String[] args) {
        //Create an empty arraylist
        ArrayList<String> color = new ArrayList();

        //check if ArrayList is empty
        if(color.isEmpty()){
            System.out.println("The ArrayList is empty. ");
        } else {
            System.out.println("The ArrayList is not empty. ");
        }
        // Add an element to the ArrayList
        color.add("green");
        color.add("blue");
        color.add("black");
        color.add("white");
        color.add("orange");
        color.add("pink");


        boolean ans = color.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");

    }

    }


