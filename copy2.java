public class copy2 {
    public static void main(String[] args) {
        int arr[]={10,20,5,6,4};
        int arr2[]=new int[arr.length];
        int i=0;
        while(i<arr.length){
            if(arr[i]%2==0){
                arr2[i]=arr[i];
            }
        }
        
        for (i=0;i<arr.length;i++){
            if(arr2[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
}

