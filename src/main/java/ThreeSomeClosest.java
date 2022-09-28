import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSomeClosest {
    public static void main(String[] args) {

        int[] array = {-1,4,-1,0,1,2};//-4,-1,-1,0,1,2
        System.out.println(threeSumClosest(array,1));
    }


    public static int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                System.out.println("Sum: "+ sum);
                int diff = Math.abs(sum - target);
                System.out.println("diff: "+ diff);
                if(diff == 0) return sum;
                if (diff < min) {
                    min = diff;
                    result = sum;
                }
                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
