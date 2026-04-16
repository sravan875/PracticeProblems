import java.util.Scanner;

public class ArithmeticOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("a + b * c = " + (a + b * c));
        System.out.println("c + a / b = " + (c + a / b));
        System.out.println("a % b + c = " + (a % b + c));
        System.out.println("a * b + c = " + (a * b + c));

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}