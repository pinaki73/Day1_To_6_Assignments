import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if( a % 2 == 0){
            System.out.println("The no is an even no");
        }else {
            System.out.println("The no is a odd no");
        }

    }

}
