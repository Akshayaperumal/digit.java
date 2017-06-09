# digit.javaimport java.io.*;
import java.util.*;
public class sum2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i=0;
        int a=s.nextInt();
        while(a>0)
        {
         a=a/10;
         i++;
        }
        System.out.println(i);
      
    }
}
