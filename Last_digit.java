import java.util.Scanner;

public class Last_digit {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        n = sc.nextInt();
        System.out.print("The last digit of the given number :");
        System.out.println(n % 10);


    }

}

