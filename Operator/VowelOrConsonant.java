package Operator;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Char : ");
        char ch = sc.next().charAt(0);

        String op =
                (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')?
                        (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
                           || ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?
                            ( ch + " is a Vowel"):
                            (ch + " is a Consonant"):
                        ( ch + " is not an Alphabet");

        System.out.println(op);
        sc.close();
    }
}
