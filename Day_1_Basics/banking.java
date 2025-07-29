import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String cname=s.nextLine();
        int cid=s.nextInt();
        int x=s.nextInt();
        switch(x){
            case 1:
                System.out.println("Welcome "+cname+" your account number is "+cid);
                System.out.println("Your balance is 1000");
                break;
            case 2:
                System.out.println("Enter the amount to deposit");
                int deposit=s.nextInt();
                if(deposit<=0 || deposit > 50000){
                    System.out.println("Invalid amount");
                }else{
                    System.out.println("Deposited "+deposit+" successfully");
                }
                break;
            case 3:
                System.out.println("Enter the amount to withdraw");
                int withdraw=s.nextInt();
                if(withdraw<=0 || withdraw > 50000){
                    System.out.println("Invalid amount");
                }else{
                    System.out.println("Withdrawn "+withdraw+" successfully");
                }
                break;
            default:
                System.out.println("Invalid option selected");
        }
            
        


    }
}