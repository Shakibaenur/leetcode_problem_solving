import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums= {13,55,2,7,11,15};
        System.out.println(twoSum( nums,9));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];                            // this is result array which stores indices of two numbers
        Map<Integer, Integer> map = new HashMap<>();          // map to store number and its indices
        for(int i=0;i<nums.length;i++){                       // put number and indices into hashmap
            map.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++){                       // traverse element in the array
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){   // Check diff = target-num exist in the hashmap if exist check if its reffering input_y
                int index = map.get(target-nums[i]);                             // get the index of target_x
                result[0]=i;                                                     // store index(input_y)
                result[1]=index;                                                 // store index(input_x)
                break;
            }
        }

        return result;    // return the result
    }
}
