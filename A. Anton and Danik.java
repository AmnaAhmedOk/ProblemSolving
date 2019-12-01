import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
 
		int n,a=0,d=0;
		String s;
		Scanner sc = new Scanner(System.in);
           	n= sc.nextInt();
           	s=sc.next();
           	char arr [] = s.toCharArray();
		 for (int i = 0; i < n; i++) {
		      if (arr[i]=='A') 
		      {a++;}
		      else {d++;}
		      	    	  		
		}
		 if(a>d) System.out.println("Anton");
		 else {
			 if(a<d)
			 System.out.println("Danik");
			 else System.out.println("Friendship");
			 }
			sc.close();
	}
 
}