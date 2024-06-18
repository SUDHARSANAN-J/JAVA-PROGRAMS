import java.util.Scanner;

public class Multiplication_tables {

    public static void main(String[] args) {
        
        int number , product;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = sc.nextInt();
        System.out.println("Multiplication table for  : "+  number);
        for (int i = 1; i<=20; i++)
        {
            product = i * number;
            System.out.println(i + " * " + number + " = " + product);
        }


    }
    
}
