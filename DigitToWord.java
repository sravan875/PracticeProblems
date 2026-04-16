import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] words = {
            "Zero","One","Two","Three","Four",
            "Five","Six","Seven","Eight","Nine"
        };

        if (n >= 0 && n <= 9) {
            System.out.println(words[n]);
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}