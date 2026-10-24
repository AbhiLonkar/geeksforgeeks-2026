public class GfgArrays_FrequenciesOfElements {
    public static void FrequenciesOfElements(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            int count = 1;
            while(i+1<n && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+":"+count);
            i++;
        }
    }
    public static void main(String[] args) {
        FrequenciesOfElements(new int[] {1,2,3,4,5,6});
    }
}
