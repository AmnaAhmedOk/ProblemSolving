import java.util.Scanner;

 
public class Main{
 
	public static void main(String[] args) {
 
		String str;
        Scanner sc = new Scanner(System.in);
        str= sc.nextLine();
		while(str.startsWith("WUB"))
		{
			str=str.substring(3, str.length());
		}	  
		
		while(str.endsWith("WUB"))
		{
			str=str.substring(0, str.length()-3);
		}	  
          
		str= str.replaceAll("WUB", " ");
				
          System.out.println(str);
			sc.close();
	}
 
}
