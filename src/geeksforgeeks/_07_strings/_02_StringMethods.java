package geeksforgeeks._07_strings;

public class _02_StringMethods {
    // contains()
    // equals()
    // indexOf() - first occurence of s2 in s1
    // lastIndexOf() - last occurence of s2 in s1
    // equals()
    public static void main(String[] args) {
        // s1 == s2 because they point to the same reference ie storage point
        String s1 = "geeks";
        String s2 = "Abhi";
        // s1 != s3 because s3 creates a new reference in memory
        String s3 = new String("Abhi");
        System.out.println(s1 == s3);
        StringBuilder s4 = new StringBuilder("geeks");
        System.out.println(s4.equals(s1));
    }
}
