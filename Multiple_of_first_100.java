import java.math.BigInteger;

public class Multiple_of_first_100 
{
    public static void main(String[] args) {

        BigInteger multiple = BigInteger.ONE;

        for (int i = 1; i <= 100; i++)
        {
            multiple = multiple.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Multiple of first 100 numbers :" + multiple);

    }
    
}
