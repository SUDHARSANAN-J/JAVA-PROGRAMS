import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int i, n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        n = sc.nextInt();
        for (i = 2;i <= n;i++)
        {
            if (n % i == 0)
            count++;
        }
        
        if (count == 1)
        System.out.println(n+" is a Prime Number");
        else
        System.out.println(n+" is not a Prime number");

        
    }
    
}
