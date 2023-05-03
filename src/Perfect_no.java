import java.util.Scanner;

public class Perfect_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to check whether it is a perfect no or not ");
        int n = sc.nextInt();
        int y = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                y = y + i;
            }
        }
        if (y == n) {
            System.out.println(+n+ " "+ "is a perfect no");
        } else {
            System.out.println(+n+ " " +"is not a perfect no");
        }
    }

}
