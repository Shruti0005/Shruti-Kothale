import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        double a = sc.nextDouble();
        System.out.println("Enter the second value");
        double b = sc.nextDouble();
        sc.nextLine();

        System.out.println("Select Operation -"+"\n"+"+ for Addition"+"\n"+"- for Subtraction"+"\n"+"* for Multiplication"+"\n"+"/ for Division");
        String typeOfOperation = sc.nextLine();

        if (typeOfOperation.equals("+")) {
            System.out.println(a + "+" + b + " = " + (a+b));
        }
        else if (typeOfOperation.equals("-")) {
            System.out.println(a + "-" + b + " = " + (a-b));
        }
         else if (typeOfOperation.equals("*")) {
            System.out.println(a + "*" + b + " = " + (a*b));
        }
         else if (typeOfOperation.equals("/")) {
           if (b == 0) {
             System.out.println("Can't divide by 0.");
           }
           else{
             System.out.println(a + "/" + b + " = " + (a/b));
           }
        }
        else{
            System.out.println("Invalid Operation.");
        }
        sc.close();
    }
}
