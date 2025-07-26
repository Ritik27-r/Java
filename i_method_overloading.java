class Calculator {
    int num =5;
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class i_method_overloading {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(10.10, 19.90));

        Calculator obj1=new Calculator();
        obj1.num=8;
        System.out.println(obj1.num);
        System.out.println(obj.num);

    }
}