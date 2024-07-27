public class CopyCube{
    public static void main(String[]args){
	      int temp=0;
		  int x=0;
	       int []arr={1,5,4,9};
		   int[]arr1=new int[arr.length];
		   
		   for(int i=0;i<arr.length;i++){
		        arr1[i]=arr[i]*arr[i]*arr[i];
				
		   }
		   
		   
		   System.out.println(" First Array:"+java.util.Arrays.toString(arr));
		   System.out.println(" First Array:"+java.util.Arrays.toString(arr1));
		   
	}

}