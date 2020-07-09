
package lab3;
import java.util.Arrays;
public class bt1them {

    
    public static void main(String[] args) {
        
        String arr[]={"Hồng","Hà","Loan"};
        System.out.println("Các phần tử mảng là:");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
   }
       Arrays.sort(arr);
        System.out.println("\n mảng sau khi sắp :");
        for (String x : arr) {
            System.out.println(x);
        }
    
}
}
