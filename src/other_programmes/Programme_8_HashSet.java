package other_programmes;

import java.util.HashSet;
import java.util.Set;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        // Add numbers 4,7,8 to the set
        set.add(4);
        set.add(7);
        set.add(8);
        System.out.println(set);

        int i;
        for (i = 1; i < 10; i++) ;
        if (set.contains(i)) {
            System.out.println(i + " Number is in set. ");
        } else {
            System.out.println(i + " Number is not in the set");
        }
    }
}
