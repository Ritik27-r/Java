public class n_strinBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        /*
        System.out.println(sb.capacity()); // Default capacity is 16 + length of string
        System.out.println(sb.length()); // Length of the string in the buffer
        */
        sb.append(" Reddy");
        System.out.println(sb);
        String str = sb.toString(); // Convert StringBuffer to String
        System.out.println(str);
        sb.insert(0, "Hello "); // Insert at the beginning
        System.out.println(sb);
        sb.delete(0, 6); // Delete "Hello " 
        System.out.println(sb);
        sb.replace(0, 5, "Hi"); // Replace "Navin" with "Hi"
        System.out.println(sb);
        sb.reverse(); // Reverse the string
        System.out.println(sb);
        sb.setLength(5); // Set length to 5, truncating the string  
        System.out.println(sb);
        sb.ensureCapacity(50); // Ensure capacity is at least 0
        System.out.println(sb.capacity()); // Check capacity after ensuring

    }
}
