public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean isPrime;
        String primes = "";
        int counter = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                counter++;
            }
        }
        int percentage = counter * 100 / n;
        System.out.println("There are " + counter + " primes between 2 and "+ n +
            " ("+ percentage +"% are primes)");
    }
}