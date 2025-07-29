import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String cname=s.nextLine();
        int cid=s.nextInt();
        double x=s.nextDouble();
        double ser=21.00;
        if (x>=0 || x <= 100) {
            double gst=x*5/100;
            double y=x*1.5;
            double y1=y+ser;
            double t=y1+gst;
            System.out.println("Customer ID:"+ cid);
            System.out.println("Customer Name:"+cname);
            System.out.println("No.of units consumed:"+ x);
            System.out.println("total amount"+y);
            System.out.println("GST"+gst);
            System.out.println("Service charges 21 rupees added"+y1);
            if(t>500){
                System.out.println("Total amount is more than 500, so 5% discount is applied");
                t = t - (t * 5 / 100);
            } 
            System.out.println("Total electricity bill is:"+t);
        } else if(x>100 || x<=200){
            double gst=x*5/100;
            double y=x*1.5;
            double y1=y+ser;
            double t=y1+gst;
            System.out.println("Customer ID:"+ cid);
            System.out.println("Customer Name:"+cname);
            System.out.println("No.of units consumed:"+ x);
            System.out.println("total amount"+y);
            System.out.println("GST"+gst);
            System.out.println("Service charges 21 rupees added"+y1);
            if(t>500){
                System.out.println("Total amount is more than 500, so 5% discount is applied");
                t = t - (t * 5 / 100);
            } 
            System.out.println("Total electricity bill is:"+t);
        }
        else if(x>200 || x<=300){
            double gst=x*5/100;
            double y=x*1.5;
            double y1=y+ser;
            double t=y1+gst;
            System.out.println("Customer ID:"+ cid);
            System.out.println("Customer Name:"+cname);
            System.out.println("No.of units consumed:"+ x);
            System.out.println("total amount"+y);
            System.out.println("GST"+gst);
            System.out.println("Service charges 21 rupees added"+y1);
            if(t>500){
                System.out.println("Total amount is more than 500, so 5% discount is applied");
                t = t - (t * 5 / 100);
            } 
            System.out.println("Total electricity bill is:"+t);
        }
        else if(x>300){
            double gst=x*5/100;
            double y=x*1.5;
            double y1=y+ser;
            double t=y1+gst;
            System.out.println("Customer ID:"+ cid);
            System.out.println("Customer Name:"+cname);
            System.out.println("No.of units consumed:"+ x);
            System.out.println("total amount"+y);
            System.out.println("GST"+gst);
            System.out.println("Service charges 21 rupees added"+y1);
            if(t>500){
                t = t - (t * 5 / 100);
                System.out.println("Total amount is more than 500, so 5% discount is applied"+t);
            } 
            System.out.println("Total electricity bill is:"+t);
        }
            
        


    }
}