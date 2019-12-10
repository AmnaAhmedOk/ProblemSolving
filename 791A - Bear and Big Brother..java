import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
      int a,b,c=0;
        Scanner sc = new Scanner(System.in);
         a =sc.nextInt();
         b =sc.nextInt();

         while(a<b|| a==b)
         {
        	 a*=3;
        	 b*=2;
        	 c++;
             //System.out.println(c);

         }
         
       
        System.out.println(c);
			sc.close();
	}

}
