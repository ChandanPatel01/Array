import java.util.*;
class NamePrint{
    public static void main(String[]args){
	   char name[]={'i','o','m','n'};
	   System.out.println(Arrays.toString(name));
	   int i=0;
	   while(i<name.length){
		    name[0]-=32;
			i++;
	   }
	   System.out.println(""+name[i]);
	   
	}
}