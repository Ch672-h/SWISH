import java.util.*;
import java.lang.*;

public class IntrestCalc
{  
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int u = 0;
        int x = 0;
        String k = s.nextLine();
        String q[] = k.split(" ");
        int i = Integer.parseInt(q[0]);
        int j = Integer.parseInt(q[1]);
        u = i;
        while(i>1){
        u= u + (i-((int)(i*j*0.01)));
        i = i - (int)(i*j*0.01);
        }
        System.out.println(u);
        
    }
}
