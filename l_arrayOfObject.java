class Student{
    int roll_no;
    String name;
    int marks;
}
public class l_arrayOfObject {
    public static void main(String[] args) {
        // int nums[]= new int[6];
        // nums[0] = 10;
        // nums[1] = 20;
        // nums[2] = 30;
        // nums[3] = 40;
        // for(int n: nums) {
        //     System.out.print(n + " ");
        // }
        // System.out.println();

        Student s1 = new Student();
        s1.roll_no = 1;
        s1.name = "Alice";
        s1.marks = 85;

        Student s2 = new Student();
        s2.roll_no = 2;
        s2.name = "Bob";
        s2.marks = 90;

        Student s3 = new Student();
        s3.roll_no = 3;
        s3.name = "Charlie";
        s3.marks = 95;

        // Creating an array of Student objects
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i=0;i< students.length; i++) {//with normal for loop
            System.out.println("Roll No: " + students[i].roll_no + ", Name: " + students[i].name + ", Marks: " + students[i].marks);
        }
        System.out.println();
        for(Student s: students) { //with enhanced for loop
            System.out.println("Roll No: " + s.roll_no + ", Name: " + s.name + ", Marks: " + s.marks);
        }
    }
}
