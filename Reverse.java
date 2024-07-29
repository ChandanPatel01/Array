class Reverse{
   public static void main(String[]args){
      int num=9632;
	  System.out.println("Your Value : " +num);
	  int rev=0;
	  while(num>0){
	    rev=num%10;
		System.out.print(" "+ rev );
		num=num/10;
		
	  }
    System.out.println(" ");
	  System.out.print(" Your Reverse Value");
   }
}