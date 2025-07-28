public class k_multidimension {
    public static void main(String[] args) {
        // Creation of multidimensional array with method 1
        int arr1[][] = {{1, 2, 3},{4, 5, 6}};

        // Creation of multidimensional array with method 2
        int arr2[][] = new int[2][3];// 2 rows and 3 columns
        // Initializing the elements of the second array
        arr2[0][0] = 10;
        arr2[0][1] = 20;
        arr2[0][2] = 30;
        arr2[1][0] = 40;
        arr2[1][1] = 50;
        arr2[1][2] = 60;

        // Printing the multidimensional arrays
        System.out.println("Multidimensional Array 1:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multidimensional Array 2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multidimensional Array 3 (Random Initialization):");
        int arr3[][]=new int[3][4];
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = (int)(Math.random()*100); // Example initialization
            }
        }
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
