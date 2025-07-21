import java.util.*;

public class SegmentedSieve {

    public static List<Integer> simpleSieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i)
                    isPrime[j] = false;
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i])
                primes.add(i);
        }
        return primes;
    }

    public static List<Integer> segmentedSieve(long L, long R) {
        int limit = (int) Math.sqrt(R);
        List<Integer> basePrimes = simpleSieve(limit);

        int size = (int) (R - L + 1);
        boolean[] isPrime = new boolean[size];
        Arrays.fill(isPrime, true);

        for (int prime : basePrimes) {
            long start = Math.max(prime * prime, ((L + prime - 1) / prime) * prime);
            for (long j = start; j <= R; j += prime) {
                isPrime[(int) (j - L)] = false;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (isPrime[i] && (L + i) > 1)
                result.add((int) (L + i));
        }
        return result;
    }

    public static void main(String[] args) {
        long L = 10_000_000_000L;
        long R = 10_000_001_000L;
        List<Integer> primes = segmentedSieve(L, R);
        System.out.println("Primes in range [" + L + ", " + R + "] =");
        System.out.println(primes);
    }
}
