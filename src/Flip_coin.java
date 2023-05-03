public class Flip_coin {
    public static void main(String[] args) {
        int n = 10;
        double H = 0;
        double T = 0;
        double countH = 0;
        double countT = 0;
        for (int i = 1; i <= n; i++) {
            int Flip = (int) (Math.random() * 10) % 2;
            if (Flip == 0) {
                System.out.println("It is a head");
                countH++;
            } else {
                System.out.println("It is a tail");
                countT++;
            }
        }
        System.out.println("The no of heads = " + countH);
        System.out.println("The no of tails = " + countT);
        H = (countH / 10 * 100);
        T = (countT / 10 * 100);
        System.out.println("The percentage of heads is " + H);
        System.out.println("The percentage of tails is " + T);
    }

}


