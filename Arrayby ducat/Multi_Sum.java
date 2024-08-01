class Multi_Sum{
   public static void main(String[]args){
     int arr[][]={{3,4,1},{3,4,1},{8,2,6}};
	 int sum=0;
	 int i=0;
	 while(i<3){
	 int j=0;
	 while(j<3){
		 
		 System.out.print( arr[i][j] + " + ");
	   sum=sum+arr[i][j];
	   j++;
	 }
	    System.out.println();
	  i++;
	 }
	 System.out.println("Total_Sum :" + sum );
   }
}