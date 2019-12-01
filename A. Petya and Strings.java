import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
 
		String s,s2;
		Scanner sc = new Scanner(System.in);
           s= sc.next();
           s2= sc.next();
           int cop= s.compareToIgnoreCase(s2);
           if(cop>0) cop=1;
           else {
               if(cop<0) cop=-1;
               else       cop=0;
 
 
           }
           System.out.println(cop);
			sc.close();
	}
 
}