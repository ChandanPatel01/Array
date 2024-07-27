class ArrPrimeNumber{
    public static void main(String[]args){
	     int []arr={12,14,7,9,3};
		      int prime=0;
			  
		 for(int i=0;i<arr.length;i++){
		      if(arr[i]%i==0){
			       prime++;
			  }
		 }
			  int []arr1=new int[prime];
			  int x=0;
			  for(int i=0;i<arr.length;i++){
			  arr1[x]=arr[i];
                    x++;
			  }
			  System.out.println(" First Array:"+java.util.Arrays.toString(arr));
        System.out.println(" Copy Array with even number:"+java.util.Arrays.toString(arr1));
			  
		 }
		 
	}
