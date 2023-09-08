import java.util.Scanner;
public class ElectricityBill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double n = sc.nextDouble();
        double mon,charge;
        if(n<199)
        {
            mon = n*1.20;
        }
        else if(n>=200 && n<400)
        {
            mon = n*1.50;
        }
        else if(n>=400 && n<600)
        {
            mon = n*1.80;
        }
        else
        {
            mon = n*2.00;
        }
        if(mon>400)
        {
           charge = mon+(mon*0.15);
        }
        else
        {
            charge = mon+100;
        }
        System.out.printf("%.2f",charge);
    }
}