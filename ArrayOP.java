class ArrayOP{
    public static void main(String[]args){
	   
		int sum=0;
		int []arr={4,5,6,7};
	     int []arr1= new int[arr.length];
		 int []arr2= new int[arr.length];
		 int []arr3= new int[arr.length];
		 int []arr4= new int[arr.length];
		 for(int i=0;i<arr.length;i++){
           arr1[i]=arr[i];
		   arr2[i]=arr[i]*2;
		   arr3[i]=arr[i]*arr[i];
		   arr3[i]=arr[i]*arr[i];
		   arr4[i]=arr[i]*arr[i]*arr[i];
		   sum+=+arr[i];
		 
		 }
		   
		 System.out.println(" First Array:"+java.util.Arrays.toString(arr));
		   System.out.println(" Copied Array:"+java.util.Arrays.toString(arr1));
		   System.out.println("Double Array:"+java.util.Arrays.toString(arr2));
		   System.out.println(" Square Array:"+java.util.Arrays.toString(arr3));
		   System.out.println("Cube Array:"+java.util.Arrays.toString(arr4));
		   System.out.println( "Sum of First Array :"+ sum);
		  
		 
	}
}

		 
		 