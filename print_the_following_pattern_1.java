import java.util.*;
public class pattern1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int p=1;
            for(int j=i;j<=n;j++)
            {
                System.out.print(p++ +"");
            }
            System.out.println();
        }
    }
}