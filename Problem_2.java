import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();

        for (int i = 1; i <= a*2; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
            }
        }
        sc.close();
    }
}
