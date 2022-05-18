package demo.epam;

import java.util.Arrays;

public class Solution {

    public static boolean containsDuplicate(int[] nums) {
        // example nums = {1,2,1,4,5,6,7,8,8,9}
        Arrays.sort(nums);
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == first){
                return true;
            }
            first = nums[i];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,33,4,5,6,7,8,66,9};
        System.out.println(Solution.containsDuplicate(nums));
    }
}