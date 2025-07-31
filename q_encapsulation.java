class human{
    private int age; //private variable(can only be accessed within the class)
    private String name;
    public int getAge() { //public method to access private variable
        return age;
    }
    public void setAge(int a) { //public method to modify private variable
        this.age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
}
public class q_encapsulation {
    public static void main(String[] args) {
        human h = new human();
        h.setAge(25); // Setting age using setter method
        h.setName("Ritik"); // Setting name using setter method
        System.out.println(h.getAge() + " " + h.getName());
    }
}
