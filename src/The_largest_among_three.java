import java.util.Scanner;

public class The_largest_among_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println("The largest no is " + a);
        }else if (b>a && b>c) {
            System.out.println("The largest nos is " + b);
        }else {
            System.out.println("The largest no is " +c);
        }

    }

}
