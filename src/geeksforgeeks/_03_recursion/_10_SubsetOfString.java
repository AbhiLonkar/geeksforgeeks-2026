package geeksforgeeks._03_recursion;

public class _10_SubsetOfString {
    public static void subsetString(String str, String curr, int index){
        if(index==str.length()){
            System.out.println(curr);
            return;
        }
        // Exclude current char
        subsetString(str, curr, index+1);
        // Include current char
        subsetString(str, curr+str.charAt(index), index+1);
    }
    public static void main(String[] args) {
        String str = "ABC";
        String curr = "";
        int index = 0;
        subsetString(str, curr, index);
    }
}
