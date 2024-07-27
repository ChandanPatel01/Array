import java.util.Scanner;

public class Max_Value {
    public static int maxNumber(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>max){
               
                max=arr[i];
            }
        }
        return max;
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
		int max = maxNumber(arr);
            System.out.println(" Your max Value:"+ max);
    }
    
}
