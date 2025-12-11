import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();

        int temp;
        if(a % 2 == 1){
            temp = a*2;
        }
        else{
            temp = (a-1)*2;
        }

        for (int i = 1; i <= temp; i++) {
            if (i % 2 == 1) {
                System.out.print(i);
            }
        }
        sc.close();
    }
}
