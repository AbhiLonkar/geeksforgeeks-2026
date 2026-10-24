package leetcode._12_math;

public class _01_AddDigits_258 {
    // Classic Method
    public static int Sum_of_digits_V1(int num){
        int sum=0;
        while(num!=0){
            int lastDigit = num%10; // taking remainder
            sum=sum+lastDigit;
            num=num/10;  //decrementing num
        }
        if (sum/10!=0){
            return Sum_of_digits_V1(sum);
        }
        return sum;
    }

//  Using digital root
//  All of these are mathematical rules
    public static int Sum_of_digits_V2(int num){
        int sum = 0;
        if(num==0){
            sum=0;
        }
        else if(num%9==0){
            sum=9;
        }
        else {
            sum=num%9;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum_of_digits_V1(67));
        System.out.println(Sum_of_digits_V2(123456));
    }
}
