import java.util.*;
public class VowelOrConsonant{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch=='A' ||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'||ch=='a' ||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' )
        {
            System.out.printf("Vowel");
        }
        else
        {
            System.out.printf("Consonant");
        }
    }
}