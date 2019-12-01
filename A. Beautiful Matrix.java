import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
int x=0,y=0,move;
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[5][5];
 
        for (int i = 0; i < 5; i++)
        {
		for (int j = 0; j < 5; j++) {
			arr[i][j]=sc.nextInt();
			if(arr[i][j]==1)
			{
				x=i;
				y=j;
			}
		}
	       }
 
        move=Math.abs(x-2)+Math.abs(y-2);
           System.out.println(move);
			sc.close();
	}
 
}