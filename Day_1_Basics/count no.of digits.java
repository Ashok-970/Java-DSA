
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("no of digits:");
		int x=s.nextInt();
		int count=0;
		int sum=0;
		int rev=0;
		while(x>0){
		    int rem=x%10;
		    rev=rev*10+rem;
		    x=x/10;
		}
		System.out.println("reverse:"+rev);
		while(rev>0){
			int digit=rev%10;
			count++;
			sum+=Math.pow(digit,count);
			rev/=10;
		}
		System.out.println("sum:"+sum);
	    
	}
}