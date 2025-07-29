import java.util.Scanner;
public class LibraryFine{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if(x<=5){
            System.out.println("total fine is:"+x*2);
        }
        else if(x>5 && x<=10){
            System.out.println("total fine is:"+x*3);
        }
        else if(x>10){
            System.out.println("total fine is:"+x*5);
        }
        else{
            System.out.println("data not valid");
        }
        


    }
}