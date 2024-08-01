import java.util.Scanner;

public class Min_Value {
    public static int minNumber(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<min){
             
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element at index " + i + " :");
			
             arr[i] = sc.nextInt();
        }
		int min = minNumber(arr);
            System.out.println(" Your min Value:"+ min);
    }
    
}
