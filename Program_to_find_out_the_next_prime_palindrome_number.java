import java.util.*;
public class PrimePalindrome{
    static int prime(int k){
        int c=0;
        for(int i=2;i<k;i++)
        {
            if(k%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
static int palindrome(int s)
{
    int rem,rev=0,temp=s;
    while(temp!=0)
    {
        rem = temp%10;
        rev = rev*10+rem;
        temp =temp/10;
    }
    if(rev==s)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=n+1;;i++){
           if(prime(i)==1 && palindrome(i)==1)
           {
               System.out.print(i);
               break;
           }
       }
    }
}