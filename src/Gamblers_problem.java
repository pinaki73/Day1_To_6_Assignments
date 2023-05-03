import java.util.Scanner;

public class Gamblers_problem {
    public static void main(String[] args) {
        System.out.println("enter the no of simulation");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int won = 0;
        int lost = 0;
        for (int i = 0; i < n; i++) {
            int startingamount = 100;
            int startingbet = 1;
            int count = 0;
            while (startingamount > 0 && startingamount < 200) {
                int chance = (int) (Math.random() * 10) % 2;
                if (chance == 0) {
                    startingamount = startingamount - startingbet;
                } else {
                    startingamount = startingamount + startingbet;
                }
                count++;
            }
            System.out.println("the no games the gambler played = " + count);
            System.out.println("the amount the gambler have = " + startingamount);
            if (startingamount == 0) {
                System.out.println("the gambler has lost the game ");
                lost++;
            } else {
                System.out.println("the gambler has won the game ");
                won++;

            }
        }
        System.out.println("the no of games the gambler lost = " + lost);
        System.out.println("the no of games the gambler won =" + won);
    }

}
