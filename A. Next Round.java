import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
      int n,k,c=0;
      int arr[];
      
        Scanner sc = new Scanner(System.in);
        
		 n=sc.nextInt();
		 k=sc.nextInt();
		 arr= new int[n];
		 for (int j = 0; j < n; j++) {
			 arr[j]=sc.nextInt();
		} 

for (int i = 0; i < arr.length; i++) {
	if(arr[i]>=arr[k-1]&&arr[i]>0)c++;
}
		
			 System.out.print(c);

		
		
			sc.close();
	}
 
}
