public class e_condition {
public static void main(String[] args) {
    int x=1;
    //Condition 1
    if (5>4) {
        System.out.println("5 is greater than 4");
    }

    //Condition 2
    if(x!=1){
        System.out.println("not one");
    }
    else{
        System.out.println("5 is not greater than 4");
    }

    //Condition 3
    if(x<1){
        System.out.println("Smaller");
    }
    else if(x>1){
        System.out.println("greater");
    }

    //Condition 4
    switch (x) {
        case 1:
            System.out.println("value is 1");
            break;
    
        default:
            System.out.println("value is not 1");
            break;
    }

    //Ternary
    String result;
    result = x%2==0 ? "Even":"Odd";
    System.out.println(result);
}
}
