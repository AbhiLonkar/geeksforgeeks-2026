import java.util.ArrayList;
import java.util.Arrays;

public class PracticeZone {
    public static int practice(int num){
        Integer i = Integer.parseInt("1234");
        System.out.println(i.getClass().getSimpleName());
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,45,6));
        int[] n1 = {1,2,3,4,6};
        System.out.println(n1.getClass().getComponentType().getSimpleName());
        String[] s1 = {"Abhi"};
        System.out.println(s1.getClass().getComponentType().getSimpleName());

        return 1;
    }
    public static void main(String[] args) {
        practice(1);
    }
}
