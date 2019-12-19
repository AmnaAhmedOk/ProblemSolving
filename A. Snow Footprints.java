import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
      int s=0,l=0,n;
     String str;
      
        Scanner sc = new Scanner(System.in);
         n=sc.nextInt();
        
		     str= sc.next();
		     for (int i = 0; i <n; i++) {
		    	 if(str.charAt(i)!='.')
		    	 {  
		    		 if(str.charAt(i)=='R')
		    		 {  
		    			 while(str.charAt(i)=='R') i++;
 
		    		        System.out.println(i+" "+(i+1));
 
		    		 }
		    		 else
		    		 {
		    		        System.out.println(i+1+" "+i);
 
		    		 }
		    		 break;
		    	 }
		    		 
		    			 
		     }
        //System.out.println(s+"  "+l);
			sc.close();
	}
 
}