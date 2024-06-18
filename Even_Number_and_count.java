import java.util.Scanner;

public class Even_Number_and_count {
    public static void main(String[] args) {
        int n, count=0;

        Scanner a = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        n = a.nextInt();

        System.out.println("Even Numbers from 0 :");
        for (int i = 0; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
                count = count+1;
            }
        }
        System.out.println("Total No of Even Numbers from 0 to the limit : "+count);

    }
    
}
