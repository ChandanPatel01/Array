import java.util.Scanner;

public class ArraySumMethod {
    public static int  sumMethod(int arr[]){
         int sum = 0;
         for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
         }
         return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element at index " + i + " :");
            arr[i] = sc.nextInt();

        }
        System.out.println("The sum of the array is: " + sumMethod(arr));

    }

    
}
