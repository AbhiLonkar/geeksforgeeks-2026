package geeksforgeeks._02_bit_magic;

public class _02_DecimalToBinary {
    public static String Converter(int num) {
        String binaryNum = "";
        if(num==0){
            return "0";
        }
        while (num > 0) {
            int remainder = num%2;
            binaryNum=remainder+binaryNum;
            num=num/2;
        }
        return binaryNum;
    }

    public static void main(String[] args) {
        System.out.println(Converter(4));
        System.out.println(1%2);
    }
}
