import java.util.Scanner;
 
public class vanyaandFence {
 
	public static void main(String[] args) {
      int n;
     String str,s="";
      
        Scanner sc = new Scanner(System.in);
        
		  str= sc.next();
		  str=str.toLowerCase();
		  str=str.replaceAll("[auyieo]", "");
		     for (int i = 0; i < str.length(); i++) 
		     {
		    	 s+="."+str.charAt(i);
			}
 
System.out.println(s);
		
			sc.close();
	}
 
}