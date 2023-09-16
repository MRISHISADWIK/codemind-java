import java.util.*;
public class sum{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0,pro=1,rem,result;
        while(n!=0)
        {
            rem=n%10;
            pro=pro*rem;
            sum=sum+rem;
            n=n/10;
        }
        result=pro-sum;
        System.out.print(result);
    }
}