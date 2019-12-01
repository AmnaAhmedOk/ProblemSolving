import java.util.Arrays;
import java.util.Scanner;
 
public class Main
{
 
	public static void main(String[] args) {
int c=0;
      int [] arr=new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
        Arrays.sort(arr); 
          for (int i = 0; i < arr.length-1; i++)
          { 
        	  
				if(arr[i]==arr[i+1]) c++;
			
		 }
           System.out.println(c);
			sc.close();
	}
 
}