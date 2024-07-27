import java.util.Scanner;

public class SearchMethod {
    public static int searchArray(int arr[] ,int search){// block 1 in interview 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
        }
        return -1;
         // if array element not found 
    }



    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
       int  size = sc.nextInt();
        arr = new int[size];
       for ( int i = 0; i < size; i++) {
           System.out.println("Enter the element at index " + i + " :");
           arr[i] = sc.nextInt();
       }
       System.out.println("Enter the element to be searched:");
        int search = sc.nextInt();
               
       int element= searchArray(arr, search);
             System.out.println(search  +  " is found in Array at index " + element);
             
    }
    
}
