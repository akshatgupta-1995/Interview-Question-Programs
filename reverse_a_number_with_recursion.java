import java.util.*;
public class HelloWorld{

    int n =0;
    int size=0;
     void reverse(char[] arr, int x)
     {
        size = x;
        int fixedSize = arr.length;
        char temp;
        
        if(n<(fixedSize/2))
        {
            temp = arr[size];
            arr[size] = arr[n];
            arr[n] = temp;
            n++;
            size--;
            reverse(arr,size);
        }
        
     }
     
     public static void main(String []args){
        HelloWorld hw = new HelloWorld();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int x = arr.length-1;
        hw.reverse(arr,x);
        System.out.println(arr);
     }
}
