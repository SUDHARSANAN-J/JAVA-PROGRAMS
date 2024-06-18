
import java.util.Arrays;
import java.util.Scanner;

public class Descending_order {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        
        int  n;
        System.out.print("Enter the limit of digits :");
        n = sc.nextInt();                   // getting no of digits 
        int a[] = new int[n];               // storing in 'a' array of 'n' no. of elements
        
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter the "+i+" Number :");
            a[i] = sc.nextInt();             // getting input into array
        }
        Arrays.sort(a);                      // for sorting the array
        

        System.out.println("The Descending order of the given nummber :");

        for(int i = n-1; i >= 0;i--)
        {
            System.out.println(a[i]);         // after sorting, printing the index value in ascending order
        }


    }
    
}