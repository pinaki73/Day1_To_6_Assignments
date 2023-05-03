import java.util.Scanner;

public class Harmonic_number {
    public static void main(String[] args) {
        double hn = 0;
        double i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find its harmonic no");
        double n = sc.nextInt();
        for (i = 1; i <= n; i++){
            hn = (hn + 1/i);
        }
        System.out.println("The harmonic no for the given value of n is ="+hn);
    }

}
