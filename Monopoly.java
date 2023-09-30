import java.util.*;
public class main
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a>b+c||b>a+c||c>a+b)
            System.out.println("YES");
            else
            System.out.println("NO");
            t-=1;
        }
    }
}