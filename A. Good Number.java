import java.util.Scanner;
 
public class vanyaandFence {
 
	public static void main(String[] args) {
      int n,k,t=0;
      String num;  
        Scanner sc = new Scanner(System.in);
         n =sc.nextInt();
         k =sc.nextInt();
         for (int i = 0; i <n; i++) 
         {    
           boolean []arr=new boolean[10];
			num=sc.next();
		    if(num.length()>=k)
		    {
		    	boolean good=true;
			for (int j = 0; j <num.length(); j++) 
			{ 
				
			     arr[num.charAt(j)-48]=  true;  
 
			}
			for (int j = 0; j <=k;j++) 
			{
				if(!arr[j])
					{good=false;
				    break;
					}
					
			}
         	 if (good) 
	        	t++;
	
		    }
 
         
		}
         
        System.out.println(t);
			sc.close();
	}
 
}