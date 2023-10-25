package Java_Dersleri1;

public class C01_Array {
    public static void main(String[] args) {


    }

public int maxspan(int[] nums){

    if (nums.length==0)
        return 0;
    int span = 1;
    for (int i = 0; i < nums.length ; i++) {
        int j;
        for (j = nums.length - 1; i != j; j--) {
        }
        if (nums[j] == nums[i])
            span = Math.max(span, j - i + 1);

    }
return span;
    }


}
