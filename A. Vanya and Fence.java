import java.util.Scanner;
 
public class vanyaandFence {
 
	public static void main(String[] args) {
 
		int h,n,c=0;
		Scanner sc = new Scanner(System.in);
           	n= sc.nextInt();
	     int [] arr = new int[n];
         h= sc.nextInt();
 
		for (int i = 0; i < n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
			if(arr[i]>h)
				c+=2;
			else c+=1;
		}
		System.out.println(c);
	sc.close();
	}
 
}
