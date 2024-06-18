import java.util.Scanner;

public class count_no_of_digits {
    public static void main(String[] args) {
        String n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextLine();

        for (int i = 1; i <= n.length(); i++)
        {
            if(i <= n.length())
            count = count+1;
        }
        System.out.println("Number of Digits in the given Number : "+count);
    }
    
}
