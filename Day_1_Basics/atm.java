import java.util.Scanner;
public class Atm{
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        
        int x=s.nextInt();
        if(x<=0)||(x[100]=0){
            System.out.println("Invalid amount");
        }
        else{
            if(x>=500){
                int f=x/500;
                x=x%500;
                System.out.print(f);
            
            }
            if(x>=200){
                int t=x/200;
                x=x%200;
                System.out.print(t);
            }
             if(x>=100){
                int h=x/100;
                x=x%100;
                System.out.print(h);
            }
        }


    }
}