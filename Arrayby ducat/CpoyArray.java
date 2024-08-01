public class CpoyArray {
    public static void main(String[] args) {
        int arr[]={1,5,6,4,9,88,12};
        int x=0;
        int y=0;
        int countEven=0;
        int countOdd=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                countEven++;
            else
                countOdd++;
         }

        int []arr1=new int[countEven];
        int []arr2=new int[countOdd];

            int i=0;
            while(i<arr.length)
            {
                if(arr[i]%2==0)
                {
                    arr1[x]=arr[i];	
                    x++;
                }
                else
                {
                    arr2[y]=arr[i];
                    y++;
                }
                i++;

            }
        System.out.println(" First Array:"+java.util.Arrays.toString(arr));
        System.out.println(" Copy Array with even number:"+java.util.Arrays.toString(arr1));
        System.out.println(" Copy Array with odd number:"+java.util.Arrays.toString(arr2));
       
        }   
}
