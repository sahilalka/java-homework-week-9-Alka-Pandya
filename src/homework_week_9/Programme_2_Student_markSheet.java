package homework_week_9;

import java.util.Scanner;

/**  2. Rewrite the student mark sheet programme (From java-homework-week3

 programmes) using if else and while loop.
 *
  */
public class Programme_2_Student_markSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter student Name    \t\t:\t");
        String name = scanner.next();
        System.out.println("Enter student roll Number \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter marks of Subject Maths \t:\t");
        int mathsMarks = scanner.nextInt();
        boolean mathsResult = true;
        while (mathsResult) {
            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("\nInvalid input,Marks should between 0 to 100");
                System.out.println("\nPlease enter correct marks\t\t:\t");
                mathsMarks = scanner.nextInt();
            } else {
                mathsResult = false;
            }

        }
        System.out.println("Enter Marks of Subject science\t:\t");
        int scienceMarks = scanner.nextInt();
        boolean scienceResult = true;
        while (scienceResult) {
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("\nInvalid input,Marks should between 0 to 100");
                System.out.println("\nPlease enter correct marks\t\t:\t");
                scienceMarks = scanner.nextInt();
            } else {
                scienceResult = false;
            }
        }
        System.out.println("Enter Marks of Subject English\t:\t");
        int englishMarks = scanner.nextInt();
        boolean englishResult = true;
        while (englishResult) {
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("\nInvalid input,Marks should between 0 to 100");
                System.out.println("\nPlease enter correct marks\t\t:\t");
                englishMarks = scanner.nextInt();

            }else{
                englishResult = false;
            }
            int total = sum(mathsMarks, scienceMarks, englishMarks);
            int percentage = (total * 100) / 300;
            String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
            String grade = calculateGrade(percentage, result);
            printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
            //closing the scanner object
            scanner.close();
        }
    }      //Calculating the sum
        public static int sum(int a,int b,int c){
        return a + b + c;
        }

          // Calculating the results on subject marks
           public static String calculateResult(int mathsMarks,int englishMarks,int scienceMarks){
        if(mathsMarks < 35 ||  scienceMarks < 35 || englishMarks < 35){
            return "Fail";

        }else{
            return "Pass";

        }


    }
        // Calculating the results on subject marks
    public static String calculateGrade(int percentage,String result){
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");

    }

}
