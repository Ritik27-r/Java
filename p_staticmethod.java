class  mobile{
    String brand;
    int price;
    static String name;
    
    static{
        name = "Smartphone";
        System.out.println("in static block");
    }

    public mobile(){
        brand ="";
        price = 200;
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}
public class p_staticmethod {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("mobile");
        // mobile m1 = new mobile();
        // m1.brand = "Samsung";
        // m1.price = 1000;
        // mobile.name = "Smartphone";

        // mobile m2 = new mobile();
    }
}
