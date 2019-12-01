import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
int n=0,c=0,sum;
        Scanner sc = new Scanner(System.in);
       n=sc.nextInt();
        int[][] arr=new int[n][3];
 
        for (int i = 0; i < arr.length; i++)
        {
		for (int j = 0; j < 3; j++) {
			arr[i][j]=sc.nextInt();
		}
	       }
        for (int i = 0; i < arr.length; i++)
        {
        	sum=0;	
		for (int j = 0; j < 3; j++) {
			sum +=arr[i][j];
		}
		if(sum>1)c++;
	       }
           System.out.println(c);
			sc.close();
	}
 
}