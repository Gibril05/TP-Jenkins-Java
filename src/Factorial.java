public class Factorial {
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Le nombre doit être positif!");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Factorial <nombre>");
            return;
        }
        int number = Integer.parseInt(args[0]);
        System.out.println("Factorielle de " + number + " = " + factorial(number));
    }
}
