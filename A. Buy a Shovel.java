import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
      int k,r,mul,c=1;
        Scanner sc = new Scanner(System.in);
         k =sc.nextInt();
         r =sc.nextInt();
    	 mul=k*c;

         while(!(mul%10==0)&&!(mul%10==r) )
         {
        	 mul=k*c;
        	 c++;
         }
       
         c=(c>1)?--c:1;
        System.out.println(c);
			sc.close();
	}

}
