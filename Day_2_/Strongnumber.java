package Day_3;
import java.util.*;
public class Strongnumber
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++){
			int result=0,n=i,temp=i;
			while(n>0){
				int d=n%10;
				f=1; 
				for(int j=1;j<=d;j++){
					f=f*j; 
				}
				result+=f; 
				n/=10; 
			}
			if(result==temp){ 
				System.out.println(temp + " is a strong number");
			}

		}
		
	}
	
}
