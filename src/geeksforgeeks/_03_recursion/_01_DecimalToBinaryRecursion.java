package geeksforgeeks._03_recursion;

public class _01_DecimalToBinaryRecursion {
    static StringBuilder bin = new StringBuilder();
    public static void Converter(int n){
        if(n==0){
            return;
        }
        Converter(n/2);
        bin.append(n%2);
    }
    public static void getAns(int n){
        Converter(n);
        System.out.println(bin.reverse().toString());
    }


    public static void main(String[] args) {
        getAns(13);
    }
}
