import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
      int n,s=0,d=0,m,c=0;
      int arr[];
        Scanner sc = new Scanner(System.in);
          n=sc.nextInt();
          arr=new int[n];
          for (int i = 0; i <n; i++)
          {  arr[i]=sc.nextInt();
          }
 
		m=n-1;
          for (int i = 0; i <=m; )
          {int v;
        	  if(arr[i]>arr[m]) { v=arr[i]; i++;}
        	  else {v= arr[m]; m--;  }
        	if(c%2==0) s+=v;
        	else d+=v;
        	c++;
          }
          
          
 
		      System.out.println(s+" "+d);
 
			sc.close();
	}
 
}