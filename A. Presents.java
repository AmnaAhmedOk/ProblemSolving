import java.util.Scanner;
 
public class vanyaandFence {
 
	public static void main(String[] args) {
      int n,num;
     int arr []= new int[105];
      
        Scanner sc = new Scanner(System.in);
        
		 n=sc.nextInt();
		 for (int i =1 ; i < n+1; i++) 
		 {
			 num = sc.nextInt();
			arr[num]=i;
		}

		 for (int i = 1; i < n+1; i++) {
			 System.out.print(arr[i]+" ");

		}
		
			sc.close();
	}
 
}
