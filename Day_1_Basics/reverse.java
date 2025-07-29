public class reverse{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int x=s.nextInt();
        int rev=0;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        System.out.println("Reversed number: " + rev);
    }
}