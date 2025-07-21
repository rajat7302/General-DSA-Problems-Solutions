import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Sieve {//This method is called Sieve of Eratostheness that is a technique to check prime numbers upto a certain limit

    public List<Integer> count (int n)
    {
        List<Integer> ans = new ArrayList<>();
       boolean isPrime[] = new boolean[n];
       if (n == 0 || n == 1) return new ArrayList<>();
       Arrays.fill(isPrime, true);
       isPrime[0] = false;
       isPrime[1] = false;
       for (int i = 2; i * i < n; i++)
       {
        if (isPrime[i]){
        for (int j = i * i; j < n; j += i)
        {
            isPrime[j] = false;
        }
       }
    }
    
     for (int i = 1; i < n; i++)
     {
        if (isPrime[i]) ans.add(i);
     }
     return ans;
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n;
       System.out.println("Enter a number");
       n = in.nextInt();
       Sieve ob = new Sieve();
       System.out.println("The number of prime numbers upto it is " +ob.count(n));
    }
}
