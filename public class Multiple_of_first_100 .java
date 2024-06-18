class Multiple_of_first_100 
{
    public static void main(String[] args) {

        int multiple = 1;

        for (int i = 1; i <= 100; i++)
        {
            multiple = multiple * i;
        }
        System.out.println("Multiple of first 100 numbers :" + multiple);
    }
    
}