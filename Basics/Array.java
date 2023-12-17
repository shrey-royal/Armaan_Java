import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Random r = new Random();
        for(int i=0; i<5; i++) arr[i] = r.nextInt(100);
    
        //foreach loop // advanced for loop
        for(int i : arr) {
            System.out.println(i);
        }
    
    }
}
