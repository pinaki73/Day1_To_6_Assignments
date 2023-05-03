public class Fibonacci_series {

    public static void main(String[] args) {
        int n = 20;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

}
