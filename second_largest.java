import java.util.Arrays;

public class second_largest {

    public static void main(String[] args){
        int[] a={32,46,24,78,5,34};
        Arrays.sort(a);

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("second largest:"+a[a.length-2]);
    
        
    }
    
}
