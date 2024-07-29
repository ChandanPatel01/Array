class Alt_Method _Search{
    static Boolean searchValue(Integer arr[],Integer num[]){
	      Boolean b=null;
		  int i=0;
		  while(i<arr.length){
		      if(arr[i]==num){
			  b=true;
			  break;
			  }
			  else{
			     b=false;
			  }
			i++;  
		  }
		  return b;
		  public static void main(String[]args){
		        Integer a[]={10,58,65};
				integer v=50;
				Boolean x=searchValue(a,v);
				System.out.println(x);
		  }
	}
	
	}
