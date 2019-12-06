import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
      int lower=0,upper=0;
      String str;
        Scanner sc = new Scanner(System.in);
         str =sc.nextLine();
         for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=65&&str.charAt(i)<=90) //upper case
				upper++;
			else 
				lower ++;
				
		}
         if(upper ==lower || upper<lower)
        	str= str.toLowerCase();
         else 
        	str= str.toUpperCase();
       

        System.out.println(str);
			sc.close();
	}

}
