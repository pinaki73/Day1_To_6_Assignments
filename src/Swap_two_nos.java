import java.util.Scanner;

public class Swap_two_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no ");
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("The swapped nos are " +a+ " " +b);
    }

}
