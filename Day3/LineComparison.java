package Day3;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Line 1
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Line 2
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        System.out.println("Length1 = " + length1);
        System.out.println("Length2 = " + length2);

        if(length1 == length2) {
            System.out.println("Lines are Equal");
        } else if(length1 > length2) {
            System.out.println("Line1 is Greater");
        } else {
            System.out.println("Line2 is Greater");
        }
    }
}