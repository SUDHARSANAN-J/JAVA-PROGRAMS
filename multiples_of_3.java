public class multiples_of_3 {
    public static void main(String[] args) {
        System.out.println("Multiple numbers of 3 from 1 to 100 :");

        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
