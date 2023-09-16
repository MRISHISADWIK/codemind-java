import java.util.*;
public class NeonNumber{
    public static void main(String args[]){
        int sq,rem,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sq=n*n;
        temp=sq;
        while(temp>0)
        {
            rem = temp%10;
            sum = sum+rem;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
    }
}