import java.util.*;
public class sumOfSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for(int i=0;i<n;i++){
            sum=sum+1/(float)(1+i);
        }
        System.out.printf("%.2f",sum);
    }
}