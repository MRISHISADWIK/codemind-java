import java.util.*;
public class ReverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev=0,temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.print(rev);
    }
}