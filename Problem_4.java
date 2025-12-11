import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int lengthOfArray = sc.nextInt();

        int a[] = new int[lengthOfArray];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element: "+ (i+1));
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int []result = new int[10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= 9; j++) {
                if (a[i] % j == 0) {
                    result[j]++;
                }
            }
        }
        for (int j = 1; j <= 9; j++) {
            System.out.println(j + " : " + result[j]);
        }
        sc.close();
    }
}
