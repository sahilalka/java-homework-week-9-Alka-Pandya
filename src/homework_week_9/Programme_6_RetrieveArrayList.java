package homework_week_9;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);


        list.add(4);  //This will add 4 at the end of the list.
        System.out.println(list);

        list.add(1,50); // This will add 50 at index 1.All the other elements will be shifted to right.
        System.out.println(list);

        List newList = new ArrayList(); // Creating a new list which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // this will add the elements present new list to list.
        System.out.println(list);

    }


}
