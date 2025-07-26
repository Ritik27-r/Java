class cal {
    public int add(int x, int y) {
        int sum = x + y;
        System.out.println("sum");
        return sum;
    }
}

public class g_class_and_objects {
    int x = 5;

    public static void main(String[] args) {
        // Object= properties(what i know) and behaviour(what i do)

        // g_class_and_objects obj1 = new g_class_and_objects();
        // System.out.println(obj1.x);
        // g_class_and_objects obj2 = new g_class_and_objects();
        // System.out.println(obj1.x);
        // System.out.println(obj2.x);

        int a = 4, b = 6;
        cal c = new cal();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(a,b));

    }
}
