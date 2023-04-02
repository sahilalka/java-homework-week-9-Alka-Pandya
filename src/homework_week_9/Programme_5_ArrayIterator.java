package homework_week_9;

import java.util.ArrayList;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme_5_ArrayIterator {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("German");
        languages.add("Spanish");
        languages.add("French");
        languages.add("Dutch");
        languages.add("Greek");
        languages.add("English");
        System.out.println("ArrayList :  " + languages);


    // using for loop
          System.out.println("Iterating over Arraylist using for loop : ");
           for(int i = 0;  i<languages.size();i++){
               System.out.println(languages.get(i));
               System.out.println(" , ");
           }






}

}
