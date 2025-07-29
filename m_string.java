public class m_string {
    public static void main(String[] args) {
        String name = "John";
        //OR String name = new String("John Doe"); This is a string object created using the String constructor
        System.out.println("Hello "+name+"!");

        /*
        below are some common string methods in Java

        System.out.println(name.length()); // Length of the string
        System.out.println(name.toUpperCase()); // Convert to uppercase
        System.out.println(name.toLowerCase()); // Convert to lowercase
        System.out.println(name.charAt(0)); // Get character at index 0
        System.out.println(name.indexOf("Doe")); // Find index of substring "Doe"
        System.out.println(name.substring(0, 4)); // Get substring from index 0 to 4
        System.out.println(name.replace("John", "Jane")); // Replace "John" with "Jane"
        System.out.println(name.contains("Doe")); // Check if "Doe" is in the string
        System.out.println(name.startsWith("John")); // Check if string starts with "John"
        System.out.println(name.endsWith("Doe")); // Check if string ends with "Doe"
        */

        name = name + " Doe"; // Concatenating strings
        System.out.println(name);

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true, because both refer to the same string literal in the string pool in the heap memory
    }
}
