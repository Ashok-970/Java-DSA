package Day_4;
import java.util.*;
public class Arr
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int[] arr=new int[10];
	    for(int i=0;i<arr.length;i++){
	        arr[i]=s.nextInt();
	    }
		System.out.println(Arrays.toString(arr));
		for(int value:arr){
		    System.out.println(value+" "); 
		}
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]+" ");
		}
	}
}