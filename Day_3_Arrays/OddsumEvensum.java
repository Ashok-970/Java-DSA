/******************************************************************************
odd sum-even sum-------->(element based )
even sum - odd sum--------->(Index Based)

*******************************************************************************/
import java.util.*;
public class OddsumEvensum
{
	public static void osum_esum(arr,even,odd){
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even+=arr[i];
			}
			else{
				odd+=arr[i];
			}
		}
		return odd-even;
	}
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int[] arr=new int[10];
	    int odd=0;
	    int even=0;
	    for(int i=0;i<arr.length;i++){
	        arr[i]=s.nextInt();
	    }
	    osum_esum(arr,even,odd);
	

	
		
	}
}