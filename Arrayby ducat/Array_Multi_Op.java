class Array_Multi_Op{
    public static void main(String[]args){
	   
		
		int [][]arr={{3,4,1},{3,4,1},{8,2,6}};
	     int [][]arr1 = new int[arr.length][arr[0].length];
		 System.out.println("2D Array");
		 for(int i=0;i<arr.length;i++){
			 for(int j=0;j<arr[i].length;j++){
				 System.out.print(arr[i][j]+" ");
				 arr1[i][j]=arr[i][j];
				 
			 }
			 
			 System.out.println();
		 }
		     System.out.println("2D Copied  Array");
			 for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr1[i].length;j++){
					System.out.print(arr1[i][j]+" ");
				} 
				System.out.println();
			 }
		 

		   }
		 }
		   
		  
		 
		  
		 
	


		 
		 