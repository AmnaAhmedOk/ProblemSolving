import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main{
 
	public static void main(String[] args) {
      int n,t=0,sum=0,x=1;
      int arr[];
      
        Scanner sc = new Scanner(System.in);
        
		 n=sc.nextInt();
		 arr= new int[n];
		 for (int j = 0; j < n; j++) {
			 arr[j]=sc.nextInt();
			 t+=arr[j];
		} 
 
		 		
		  Arrays.sort(arr);
		 
          for (int i =(n-1) ; i >=0; i--) {
			 sum += arr[i];
			 t-=arr[i];
 
			 if(sum<=t) 
				 {
				 x++;
				 }
 
        	  
		}
		
          
          System.out.println(x);
			sc.close();
	}
 
}
/*import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n,m,arr[],mm=0,b=0,c=0;
		n= in.nextInt();
		arr = new int [n];
		for (int i = 0; i < n; i++) {
            m= in.nextInt()	;	
            b+=m;
            arr[i]=m;
		}
		
		
		Arrays.sort(arr);
		
		for (int i = n-1; i >=0; i--) {
		
			if(mm<=b/2)
			{
				mm+=arr[i];
				c++;
			}
			
		}
		System.out.println(c);
		
		 in.close();
	}
}*/