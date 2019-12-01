import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
int c=0;
String str;
        Scanner sc = new Scanner(System.in);
           str= sc.next();
          char [] arr= str.toCharArray();
          Arrays.sort(arr);
           
        for (int i = 0; i < arr.length-1; i++)
        {
	          if (arr[i]==arr[i+1]) 
				c++;
			
		}
	       
 if ((arr.length-c)%2==0)  System.out.println("CHAT WITH HER!");
 else       System.out.println("IGNORE HIM!");
			sc.close();
	}
 
}