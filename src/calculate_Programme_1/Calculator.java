package calculate_Programme_1;

/** Create four methods with manes “addition”, “subtraction”, “division”,
 and “multiplication”. All methods are instance methods and it doesn’t
 return anything. But it has two parameters with the names “int a” and
 “int b”. Also each method has System.out.println(). This prints the
 result. Also create one more method with the name “calculateResult”
 with three parameters with name int a, int b and char symbol. Write the
 logic in the calculateResult method that when the user enters first
 number and second number and symbol based on symbol it does
 calculate.
 *
 */
public class Calculator {
    public void addition(int a, int b){
        System.out.println(a+b);
    }
     public void subtraction(int a,int b){
         System.out.println(a-b);
     }
      public void division(int a,int b){
          System.out.println(a/b);
      }
      public void multiplication(int a,int b){
          System.out.println(a*b);
      }

       public static void calculationResult(int a,int b,char symbol) {
        if(symbol == '+'){
            System.out.println(a + " + " + b + " = " + (a+b));
        }else if (symbol == '-'){
            System.out.println(a + " - " + b + " = " + (a-b));
        } else if (symbol == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (symbol == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));

        }


       }


}
