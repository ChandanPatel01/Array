class static void main(String[]args){
    int num=3964;
	int max=0;
	int max1=0;
	while(num>0){
	  max=num%10;
	  if(max1>max){
	   max=max1;
	  }
	  num=num/10;
	}
	System.out.println("Max Value:"+max);
	
}
