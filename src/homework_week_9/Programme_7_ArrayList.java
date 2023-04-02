package homework_week_9;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayList {
    public static void main(String[] args) {

        // Creating an empty integer array list
        ArrayList<Integer> arr = new ArrayList<Integer>(10);

        // Check the list is empty or not using function
        boolean ans = arr.isEmpty();
        if (ans == true) {
            System.out.println("The ArrayList is empty");

        } else {
            System.out.println("The ArrayList is not empty");

            // addition of a element to the arraylist
            arr.add(1);

            // Check if the list is empty or not
            ans = arr.isEmpty();
            if (ans == true) {
                System.out.println("The Arraylist  is empty");
            } else {
                System.out.println("The ArrayList is not empty");
            }


        }

    }

}