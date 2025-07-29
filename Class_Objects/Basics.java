//method calling with using parameters
//static method calling with parameters

/*class Main {
    public static void main(String[] args) {
        Basics b=new Basics();
        Basics b1=new Basics();

        b.display("Ashok",538,8.1);
        b1.display("John",123,9.5);
    }
}



public class Basics {
    static String name;
    static int rollno;
    static double cgpa;
    static void display(String name, int rollno, double cgpa) {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("CGPA: " + cgpa);
    }

    
}*/



//method calling with using parameters
/* static method calling with parameters and using static variables
class Main {
    public static void main(String[] args) {
        Basics b=new Basics();
        Basics b1=new Basics();

        b.display(b.name,b.rollno,b.cgpa);
        b1.display("John",123,9.5);
    }
}



public class Basics {
    static String name="Ashok";
    static int rollno=538;
    static double cgpa=8.1;
    static void display(String name, int rollno, double cgpa) {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("CGPA: " + cgpa);
    }

    
}*


//Constructor calling with parameters
//1  . Default Constructor
class Constructor{
    String name;
    int rollno;
    double cgpa;

    Constructor() {
        name = "Ashok";
        rollno = 538;
        cgpa = 8.1;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("CGPA: " + cgpa);
    }
}
public class Basics {
    public static void main(String[] args) {
        Constructor c = new Constructor();
        c.display();
    }
}
*

/// 2. Parameterized Constructor
class Constructor{
    String name;
    int rollno;
    double cgpa;

    Constructor(String n, int r, double c) {
        name = n;
        rollno = r;
        cgpa = c;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("CGPA: " + cgpa);
    }
}
public class Basics {
    public static void main(String[] args) {
        Constructor c = new Constructor("Ashok", 538, 8.1);
        c.display();
    }
}*
// this is a parameterized constructor that initializes the object's attributes with the provided values.
// The `display` method prints the values of these attributes to the console.
public class Basics {
    public static void main(String[] args) {
        Constructor c = new Constructor(20, 30, 40);
        c.sum();
    }
}
public class Constructor {
    int a = 10;
    int b = 20; 
    int c = 30;

    Constructor(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void sum() {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
        
    }
}*/

  /* Method Overloading
   Method overloading is a feature that allows a class to have more than one method with the same name, 
   but with different parameters (different type, number, or both).
   
    This allows methods to perform similar functions but with different types or numbers of inputs.
    *//* Example of Method Overloading
public class Basics {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.display("Ashok");
        mo.display("John", 123);
        mo.display("Alice", 456, 9.5);
    
    }
}

class MethodOverloading {
    void display(String name) {
        System.out.println("Name: " + name);
    }

    int display(String name, int rollno) {
        System.out.println("Name: " + name);
        System.out.println("rollno: " + rollno*2);
        return 0;
    }

    double display(String name, int rollno, double cgpa) {
        System.out.println("cgpa: " + cgpa/2);
        return 0;
    }

}*/

//Constructor Overloading
/* Constructor overloading is a feature in Java that allows a class to have multiple constructors with different
   parameter lists. This enables the creation of objects in different ways, depending on the parameters passed during instantiation.
   
   Each constructor can initialize the object's attributes differently based on the provided arguments.
*/
public class Basics {
    public static void main(String[] args) {
        ConstructorOverloading co1 = new ConstructorOverloading();
        ConstructorOverloading co2 = new ConstructorOverloading("Ashok");
        ConstructorOverloading co3 = new ConstructorOverloading("John", 123);
        ConstructorOverloading co4 = new ConstructorOverloading("Alice", 456, 9.5);
    }
}
class ConstructorOverloading {
    String name;
    int rollno;
    double cgpa;

    // Default constructor
    ConstructorOverloading() {
        name = "Default Name";
        rollno = 0;
        cgpa = 0.0;
        display();
    }

    // Constructor with one parameter
    ConstructorOverloading(String name) {
        this.name = name;
        this.rollno = 0;
        this.cgpa = 0.0;
        display();
    }

    // Constructor with two parameters
    ConstructorOverloading(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = 0.0;
        display();
    }

    // Constructor with three parameters
    ConstructorOverloading(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
        display();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------------");
    }
}

