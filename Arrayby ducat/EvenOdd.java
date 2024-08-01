import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[],size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size=sc.nextInt();
        arr=new int[size];
        
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements of the array "+ i + " ");
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                System.out.println("The number is even");
             }
             else{
                System.out.println("The number is odd");
             }
             }
             

    }
    
}
