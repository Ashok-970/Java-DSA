
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("do you want to perform additon");
	    char c=s.next().charAt(0);
	    while(c=='Y'||c=='y'){
	        int a=s.nextInt();
	        int b=s.nextInt();
	        System.out.println("sum:"+(a+b));
	        System.out.println("do you want to continue:");
	        c=s.next().charAt(0);
	    }
	}
}