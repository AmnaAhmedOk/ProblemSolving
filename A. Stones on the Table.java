import java.util.Scanner;
 
public class  Main
{
 
	public static void main(String[] args) {
      int n,c=0;
      String s1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        s1= sc.next();
         char [] s= s1.toCharArray();
 
           
			for (int i = 0; i < n-1; i++) {
				
				if(s[i]==s[i+1]) c++;
			}
      System.out.println(c);
			sc.close();
	}
 
}
