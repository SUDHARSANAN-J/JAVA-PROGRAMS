public class ASCII_value_of_Alphabet {                    // ASCII for uppercase alphabet starts from 65 to 90 
                                                          // ASCII for lowercase alphabet starts from 97 to 122
    public static void main(String[] args) {
        for (int i = 65; i <= 122; i++)
        {
            if(i >= 91 && i <=96)
            {
                continue;
            }
            char ASCII = (char) i;
            System.out.println("ASCII value for "+i+" is "+ASCII);
        }

        
    }
}
