package other_programmes;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    public static void main(String[] args) {
        // Creating HashMap object called people
        Map<String, Integer> people = new HashMap();
        // Adding some key-value pairs to map
        people.put("Ishita", 1);
        people.put("Hiral", 2);
        people.put("Akta", 3);
        people.put("Khushi", 4);
        people.put("Dhara", 5);
        people.put("Bhavika", 6);
        people.put("Roma", 7);
        people.put("Parul", 8);
       // Using for-each loop to iterate over the values in map
        for (int roll : people.values()){
            System.out.println("Roll: " + roll);
        }

    }
}
