import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int arr[], search,size,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
         size = sc.nextInt();
         arr = new int[size];
        for ( i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
         search = sc.nextInt();

        for ( i = 0; i < size; i++) {
            if (arr[i] == search) {
                System.out.println("Element  " + search + "  found at index " + i);
                break;

                
            }

        }
        if(i==size)   /* Element to search isn't present */  
        {
            System.out.println("Element "+ search + " Not Found in Aarray");
        }
       

    }
}