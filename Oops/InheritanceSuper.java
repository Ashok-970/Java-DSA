/* SUPER KEYWORD EXAMPLE
class InheritanceSuper {
    int a;
    int b;

    InheritanceSuper(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("Value of a (parent): " + a);
        System.out.println("Value of b (parent): " + b);
    }
}

class SuperExChild extends InheritanceSuper {

    SuperExChild(int a, int b) {
        super(a, b);
    }

    @Override
    void display() {
        System.out.println("Value of a (child): " + a);
        System.out.println("Value of b (child): " + b);
        super.display(); // Call parent display
    }

    public static void main(String[] args) {
        SuperExChild obj = new SuperExChild(10, 20);
        obj.display();
    }
}*/


//super class variables accessing

/*class First{
    int a=10;

    First() {
        System.out.println("First class constructor");
    }
    
}
class Second extends First{
    int a=15;

    Second() {
        System.out.println("Second class constructor");
    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(a*super.a);
    }
}
public class InheritanceSuper{
    public static void main(String[] args) {
        Second s=new Second();
        s.display();
    }
}
*/
//Calling methods with super keywords
class First{
    int a,b;

    First() {
        System.out.println("First class constructor");
    }

    First(int x ,int y) {
        a = x;
        b = y;
    }
    void sum(){
        System.out.println("sum:"+(a+b));
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
    
    
}
class Second extends First{


    Second() {
        super(10,15);
        super.sum();
        super.display();
    }
    
}
public class InheritanceSuper{
    public static void main(String[] args) {
        Second s=new Second();

    }
}