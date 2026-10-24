package leetcode._11_bit_manipulation;

public class _01_AddBinaryString_67 {
    public static void addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length()-1;
        int j = a.length()-1;
        int carry = 0;

        while (i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            res.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }
        if(carry!=0){
            res.append(carry);
        }
        System.out.println(res.reverse().toString());
    }

    public static void main(String[] args) {
        addBinary("1101", "1011");
    }
}
