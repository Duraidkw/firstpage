
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
	Scanner S =new Scanner(System.in);
	System.out.println("Enter the squence duraion");
	int n=S.nextInt();
	int f=-1;
 int s=1;
 System.out.println("The fibanocci series is");
//System.out.print(" "+f+" "+s);
 int t,i;
 for ( i=0;i<=n;i++) {
	 t=f+s;
	 System.out.print(" "+t);
	 f=s;
	 s=t;
	 
 }
	}

}
