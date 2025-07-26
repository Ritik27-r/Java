public class f_loops {
public static void main(String[] args) {
    //While loop
    int x=0;
    System.out.println("While loop");
    while(x<3){
        System.out.println(x);
        x++;
    }

    //Do-While loop
    int y=0;
    System.out.println("Do-while loop");
    do{
        System.out.println(y);
        y++;
    }
    while(y<3);

    //For loop
    System.out.println("For loop");
    for(int i=0;i<3;i++){
        System.out.println("For"+i);
    }
}
}
