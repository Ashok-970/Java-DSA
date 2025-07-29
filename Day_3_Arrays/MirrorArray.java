

import java.util.*;
public class MirrorArray
{
	public static boolean mirrorArray(int n,int a[]){
        if(n%2==1){
            return false;
        }
        for(int i=0;i<n/2;i++){
                if(a[i]!=a[n-1-i]){
                    return false;
                }
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int[] arr=new int[6];
        int n=arr.length;
        boolean res=true;
	    for(int i=0;i<arr.length;i++){
	        arr[i]=s.nextInt();
	    }
        boolean result=mirrorArray(n,arr);
        System.out.print(result);
           
	    

	
		
	}
}