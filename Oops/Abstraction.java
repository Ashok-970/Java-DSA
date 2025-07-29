/*public class Abstraction {
    public static void main(String[] args) {
        Second second = new Second();
        second.sum();
        second.sub();
        second.mul();
        second.div();
    }
}
abstract class First{
    int a, b;
    First(int x, int y) {
        a = x;
        b = y;
    }
    void sum(){
        System.out.println("Sum: " + (a + b));
    }
    abstract void sub();
    abstract void mul();
    abstract void div();
}

class Second extends First {
    Second() {
        super(50,5);
    }
    
    @Override
    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }
    
    @Override
    void mul() {
        System.out.println("Multiplication: " + (a * b));
    }
    
    @Override
    void div() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}


*/

abstract  class First{
    abstract void sum(int a, int b);
    abstract void mul(int a, int b);
    
}
abstract class Second extends First {
    @Override
    void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    
    abstract void mul(int a, int b);
}
class Third extends Second {
    @Override
    void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
    
    
}
public class Abstraction {
    public static void main(String[] args) {
        Third third = new Third();
        third.sum(10, 20);
        third.mul(1, 20);
    }
}