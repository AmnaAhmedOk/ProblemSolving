import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
      int n,c=0;
      String str;
        Scanner sc = new Scanner(System.in);
          str=sc.nextLine();
           char [] ch = str.toCharArray();
           str="";
          for (int i = 0; i <ch.length; i++)
          {
        	  if(ch[0]>96&&ch[0]<123) ch[0]-=32;
        	  str+=ch[i];
          }
 
		
          
          
          
 
		      System.out.println(str);
 
			sc.close();
	}
 
}
