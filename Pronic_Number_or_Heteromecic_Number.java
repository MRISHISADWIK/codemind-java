import java.util.*;
public class pronicNumbe{
    static boolean pronic(int n)
    {
         for(int i=1;i<n;i++)
        {
            if(i*(i+1)==n)
                {
                   return true;
                }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(pronic(n))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
       
        
    }
}