class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show1(mobile m){
        System.out.println(m.brand + " " + m.price + " " + name);
    } 
}
public class o_staticvariable {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.brand = "Samsung";
        m1.price = 50000;
        mobile.name = "Smartphone";

        mobile m2 = new mobile();
        m2.brand = "Apple";
        m2.price = 100000;
        mobile.name = "Smartphone";

        m1.show();
        m2.show();
        mobile.show1(m1);
    }
}
