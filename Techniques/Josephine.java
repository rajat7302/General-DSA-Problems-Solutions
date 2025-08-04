import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Josephine {
    int findLastPerson(int n, int k)
    {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++)ans.add(i);
        int p = 0;
         while(ans.size() > 1){
            int curr = (p + k - 1) % ans.size();
            ans.remove(curr);
            if (curr < ans.size()) p = curr;
            else p = 0;
        }
        return ans.get(0);
    }
    public static void main(String args[])
    {
   Scanner in = new Scanner(System.in);
   Josephine ob = new Josephine();
   System.out.println("Enter n and k respectively");
   int n = in.nextInt();
   int k = in.nextInt();
   System.out.println("The last man standing is " + ob.findLastPerson(n, k));
   in.close();
    }
}
