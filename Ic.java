import java.util.*;
import java.lang.*;

public class Ic
{  
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = 0;
        String b = s.nextLine();
        String c[] = b.split(" ");
        int i = Integer.parseInt(c[0]);
        int j = Integer.parseInt(c[1]);
        a = i;
        while(i>1)
        {
            a= a + (i-((int)(i*j*0.01)));
            i = i - (int)(i*j*0.01);
        }
        System.out.println(a);
        
    }
}
