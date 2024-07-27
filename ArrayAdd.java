import java.util.Scanner;
public class ArrayAdd {
    public static void main(String[] args) {
        int arr[];
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size=sc.nextInt();
        arr=new int[size];
        int sum=0;
        for(i=0;i<size;i++){
            System.out.println("Enter the element at index "+i+" :");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
           
        }
        System.out.println("Total Sum:"+ sum);
        
    }
    
}
