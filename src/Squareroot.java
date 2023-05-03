import java.util.Scanner;

public class Squareroot {


    public static void main(String[] args) {
        System.out.println("welcome to line comparison");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y2");
        int y2 = sc.nextInt();
        double length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("the length is "+length);
    }

}
