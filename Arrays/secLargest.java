import java.util.*;

public class secLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
    
        System.out.println("Array Elements are: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]  +" ");
        }

        int max = arr[0];
        int max2 = arr[1];

        for(int i=1; i<n; i++) {
            if(arr[i]>max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i]<max){
            max2 = arr[i];
            }
           
            }
        

        System.out.println("The Largest element in array is: " +max);
        System.out.println("The Second Largest element in array is: " +max2);
        
            
    }
    
}
