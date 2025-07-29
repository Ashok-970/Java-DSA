package Day_4;

import java.util.*;


public class Samearrays
    public static boolean isarray(int a[],int b[]){
        if(a.length!=b.length){
            return false;
        }
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
        }
        return false;

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int[] a=new int[4];
        int[] b=new int[4];
        boolean res=true;
	    for(int i=0;i<a.length;i++){
	        a[i]=s.nextInt();
            b[i]=s.nextInt();
	    }
		boolean m=isarray(a,b);
        System.out.print(m);
	}
