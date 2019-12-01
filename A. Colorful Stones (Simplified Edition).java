import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
int c=1;
 
String s1,s2;
        Scanner sc = new Scanner(System.in);
           s1= sc.next();
           s2= sc.next();
          char [] s= s1.toCharArray();
          char [] t= s2.toCharArray();
 
           
			for (int i = 0,j=0; i < t.length; i++) {
				if(s[j]==t[i])
					{j++;
					c++;
					
					}
			}
      System.out.println(c);
			sc.close();
	}
 
}