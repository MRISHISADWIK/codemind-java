import java.util.*;
public class colorCode{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        if(a=='V' || a=='v'){
            System.out.print("Violet");
        }
        else if(a=='I' || a=='i')
        {
            System.out.print("Indigo");
        }
        else if(a=='B'|| a=='b')
        {
            System.out.print("Blue");
        }
        else if(a=='G' || a=='g')
        {
            System.out.print("Green");
        }
        else if(a=='Y' || a=='y')
        {
            System.out.print("yellow");
        }
        else if(a=='O' || a=='o')
        {
            System.out.print("Orange");
        }
        else if(a=='R' || a=='r')
        {
            System.out.print("Red");
        }
        else{
            System.out.print("-1");
        }
    }
}