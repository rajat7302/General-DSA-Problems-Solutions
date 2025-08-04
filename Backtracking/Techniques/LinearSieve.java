import java.util.*;

public class LinearSieve {

    public static void linearSieve(int n) {
        int[] spf = new int[n + 1]; // smallest prime factor
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (spf[i] == 0) {
                spf[i] = i;
                primes.add(i);
            }

            for (int p : primes) {
                if (p > spf[i] || p * i > n)
                    break;
                spf[p * i] = p;
            }
        }

        System.out.println("Primes up to " + n + ": " + primes);
    }

    public static void main(String[] args) {
        int n = 100;
        linearSieve(n);
    }
}
