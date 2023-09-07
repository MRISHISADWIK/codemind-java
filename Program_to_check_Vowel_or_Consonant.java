import java.util.*;
public class vowel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        String ans = (ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')? "Vowel":"Consonant";
        System.out.print(ans);
    }
}