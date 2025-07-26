public class c_typeconversion {
public static void main(String[] args) {
    //TYPE-CONVERSION
    /*
     * I.)Widening--Converting a smaller type to a larger type size   (AUTOMATICALLY)
     * byte->short->char->int->long->float->double
     * 
     * II.)Narrowing--Converting a larger type to a smaller size type  (MANUALLY)
     * double->float->long->int->char->short->byte
     */

    //Widening
    System.out.println("-Widening");
    int a=3;
    float f=a;
    double d=f;
    System.out.println(a);
    System.out.println(f);
    System.out.println(d);

    //Narrowing
    System.out.println("-Narrowing");
    double D=9.78d;
    int I = (int) D;
    System.out.println(D);
    System.out.println(I);
}
}
