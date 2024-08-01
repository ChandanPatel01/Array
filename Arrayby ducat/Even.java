class Even{
   public static void main(String[]args){
      int num=9632;
	  System.out.println("Your Value : " +num);
	  int even=0;
	  while(num>0){
	       even=num%10;
		   if(num%2==0){
		     System.out.println("even" +even);
		  }
		  num=num/10;
	  }
	  
	 
   }
}