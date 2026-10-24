package leetcode._11_bit_manipulation;

public class _06_MaximumOddBinaryNumber_2864 {
    public static void Counter(String s) {
//      Can be optimized more with an array
        int count = 0;
        int num = Integer.parseInt(s, 2);
        int l1 = s.length() - 1;
        StringBuilder res = new StringBuilder(l1+1);
        res.append("0".repeat(Math.max(0, l1+1)));
        while(num>0){
            num=num&(num-1);
            count++;
        }
        if(count >= 1){
            res.setCharAt(s.length()-1, '1');
            count--;
            for(int i=0; i<count;i++){
                res.setCharAt(i,'1');
            }
        }
//        if(count==1){
//            res.setCharAt(s.length()-1, '1');
//        }
//        else {
//            res.setCharAt(s.length()-1, '1');
//            count--;
//            for(int i=0; i<count;i++){
//                res.setCharAt(i,'1');
//            }
//        }
        // res is a stringBuilder
        System.out.println(res);
        System.out.println(res.length());
    }
    public static void main(String[] args) {
        Counter("0111000110");
    }
}
