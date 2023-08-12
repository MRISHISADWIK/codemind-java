import java.util.Scanner;
public class diskCapapcity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(512*2*a*b*c);
    }
}