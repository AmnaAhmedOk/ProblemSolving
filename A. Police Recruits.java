import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
      int n,num,neg=0,pos=0;
        Scanner sc = new Scanner(System.in);
          n=sc.nextInt();
         
         while(n>0)
         {
             num=sc.nextInt();
        	 if(num==-1)//crime accur
        	 {
        		if(pos>0)pos--;
        		else neg++; 
        		 
        	 }
        	 else {
        		 pos+=num;
        	 }
        	 
        	 n--;
         }
        System.out.println(neg);
			sc.close();
	}

}
