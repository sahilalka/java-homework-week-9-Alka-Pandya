package homework_week_9;

/** 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    // function that reverse array and stored it
    // in another array

    static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        //Printing the reverse array
        System.out.println("Reversed array is : \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);

        }

    }

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};
        reverse(arr,arr.length);
    }

    }


