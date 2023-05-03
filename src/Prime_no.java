import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to find it is prime or not");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0){
            System.out.println("The no is a prime no ");
        }else {
            System.out.println("The no is not a prime no");
        }
    }
}
