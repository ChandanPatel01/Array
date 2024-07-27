class Min_Multi{
   public static void main(String[]args){
     int arr[][]={{78,41,11},{73,43,18},{86,25,68}};
	 int min=arr[0][0];
	 int i=0;
	 while(i<3){
	 int j=0;
	 while(j<3){
		 
		 System.out.print( arr[i][j] + "  ");
		 
	       if(arr[i][j]<min){
		      min=arr[i][j];
		   }
		   j++;
	  
	 }
	    System.out.println();
	  i++;
	 }
	  System.out.println("Multi min Value:" +min );
   }
}