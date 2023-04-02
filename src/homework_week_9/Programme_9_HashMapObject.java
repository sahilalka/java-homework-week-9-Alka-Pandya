package homework_week_9;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapObject {
    public static void main(String[] args) {

        // create hashmap object called people
        Map<String,Integer> people = new HashMap<>();
        // Add keys and values(Name,Age)
        people.put("Rohan" , 35);
        people.put("Sahil" , 45);
        people.put("Maulik" ,38);
        people.put("Swapnil" , 36);


        for (Map.Entry<String,Integer> P : people.entrySet()){
            System.out.println("Key"  +  " "  + P.getKey() + " " + "value"  +  " "  +  P.getValue());

        }

    }



}
