/*public class Interface {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.sum(10, 20);
        obj.mul(5, 20);
    }
}
interface First {
    abstract void sum(int a, int b);
    abstract void mul(int a, int b);
}
class Second implements First {
    @Override
    public void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
    
    @Override
    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }
}*/



public class Interface {
    public static void main(String[] args) {
        Fourth obj = new Fourth();
        obj.sum(10, 20);
        obj.mul(5, 20);
        obj.sub(30, 10);
        obj.sum(10, 3);
    }
}
interface First {
    abstract void sum(int a, int b);
}
interface Second extends First {
    abstract void mul(int a, int b);
    
}
interface Third extends Second {
    abstract void sub(int a, int b);
}
class Fourth implements Third {
    public void sum(int a, int b){
        System.out.println("Sum: " + (a + b));
    }
    public void mul(int a, int b){
        System.out.println("Multiplication: " + (a * b));
    }
    public void sub(int a, int b){
        System.out.println("Subtraction: " + (a - b));
    }
}

