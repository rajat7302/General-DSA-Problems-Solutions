public class Bits {
    public static void main(String args[])
    {
        int n = 500;
        int bitMask = 3;
        StringBuilder ans = new StringBuilder();
        while (n != 0)
        {
            int res = bitMask & n; //Gets the n - 1 th bit of the number
           ans.insert(0, res);
            n = n >> 2;
        }
        System.out.println(ans);
    }
}
//This converts to base 4