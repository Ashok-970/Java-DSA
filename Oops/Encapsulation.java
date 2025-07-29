public class Encapsulation {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Ashok");
        System.out.println(s.getName());
        s.updateName("Chandu");
        System.out.println(s.getName());
    }
}
class Student{
    private String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void updateName(String n){
        name=n;
    }
}
