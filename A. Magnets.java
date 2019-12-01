import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
      int n,c=1;
      int g[];
        Scanner sc = new Scanner(System.in);
          n=sc.nextInt();
          g=new int[n];
          for (int i = 0; i <n; i++)
          {  g[i]=sc.nextInt();
          }
 
		
          for (int i = 0; i <n-1; i++)
          {
        	  if(g[i] !=g[i+1]) c++;
          }
          
          
 
		      System.out.println(c);
 
			sc.close();
	}
 
}