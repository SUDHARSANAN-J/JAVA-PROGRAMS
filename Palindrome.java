import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        String word, reverse;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number/ String :");
        word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
        reverse = sb.reverse().toString();

        if(reverse.equals(word))
        System.out.println("The given String is a Palindrome");
        else
        System.out.println("The given String is not a Palindrome");


    }
    
}
