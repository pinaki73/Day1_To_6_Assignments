import java.util.Scanner;

public class Vowel_or_consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a alphabet");
        char apt = sc.next().charAt(0);
        if(apt == 'a' || apt == 'e' || apt == 'i' || apt == 'o' ||apt == 'u'){
            System.out.println("The alphabet entered is a vowel");
        }else if (apt>='a' && apt<='z') {
            System.out.println("The alphabet is a constant");
        }else {
            System.out.println("it is not an alphabet");
        }

    }

}
