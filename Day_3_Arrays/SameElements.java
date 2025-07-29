

import java.util.*;


public class SameElements
    public static boolean Abc(int a[],int b[]){
        if(a.length!=b.length){
            return false;
        }
        int[] freq=new int[10];
        for(int i:a){
            fre[i]++;
        }
        for(int i:b){
            freq[i]--;
        }
        for(int i:freq){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int[] a=new int[4];
        int[] b=new int[4];
        boolean m=true;
	    for(int i=0;i<a.length;i++){
	        a[i]=s.nextInt();
            b[i]=s.nextInt();
	    }
        m=Abc(a,b);
		System.out.print(m);
    }
