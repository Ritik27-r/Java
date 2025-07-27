public class j_array {
    public static void main(String[] args) {
        //Creation of array with method 1
        int arr1[] = {1, 2, 3, 4, 5};

        //Creation of array with method 2
        int arr2[] = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
        //Printing the arrays
        System.out.println("Array 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Array 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
