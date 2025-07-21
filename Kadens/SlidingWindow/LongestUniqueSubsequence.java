import java.util.HashSet;
import java.util.Set;
public class LongestUniqueSubsequence{//Continuous one
public static int maxLength(String s)
{
Set<Character> set = new HashSet<>();
int len = s.length();
int maxLen = 0;
int start = 0, stop = 0;
String fin = "";
while (stop < len)
{
    while (set.contains(s.charAt(stop)))
    {
        set.remove(s.charAt(start));
        start++;
    }
   set.add(s.charAt(stop));
   maxLen = Math.max(maxLen , stop - start + 1);
   if (stop - start + 1 > fin.length())
   {
    fin = s.substring(start, stop + 1);
   }
   stop++;
}
System.out.println(fin);
return maxLen;
}
public static void main(String args[])
{
    String s = "hhfkfhkfkhhfkdkxndndjdisl";
    System.out.println("The longest one is "+maxLength(s));
}
}