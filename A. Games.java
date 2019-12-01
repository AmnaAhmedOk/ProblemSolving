import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
      int n,c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
   
        int []h= new int[n];
        int []g= new int[n];
 
           for (int i = 0; i < n; i++) {
        	   h[i]=sc.nextInt();
        	   g[i]=sc.nextInt();
 
			
		}
			for (int i = 0; i < n; i++) {
				
				for (int j = 0; j < n; j++) {
					if(i==j) continue;
					if (h[i]==g[j]) {
						c++;
					     
 
					}
				}
 
			}
		      System.out.println(c);
 
			sc.close();
	}
 
}