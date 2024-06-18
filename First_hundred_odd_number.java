public class First_hundred_odd_number 
{
    public static void main(String[] args) {
        System.out.println("The odd between 0 to 100 are :" );
        for (int i = 0; i <= 100; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
