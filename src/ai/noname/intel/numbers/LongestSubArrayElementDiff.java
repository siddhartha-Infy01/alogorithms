package ai.noname.intel.numbers;

import java.util.Arrays;

public class LongestSubArrayElementDiff {
    public int longestSubarray(int[] nums, int limit) {
        int startIdx = 0;
        int maxLength = 0;
        int currLength = 0;
        if (nums.length == 1)
            return 1;

        for (int i = 0; i < nums.length; i++) {

            int[] subArr = Arrays.copyOfRange(nums, startIdx, i + 1);
            if (!checkMaxDiff(subArr, limit))
                startIdx += 1;
            else
                currLength = subArr.length;


            if (currLength > maxLength)
                maxLength = currLength;


        }


        return maxLength;
    }

    public boolean checkMaxDiff(int[] input, int limit) {
        StringBuilder arr = new StringBuilder();
        Arrays.sort(input);
        return Math.abs(input[input.length - 1] - input[0]) <= limit;
    }

    public int longestSubarray2(int[] nums, int limit) {
        int startIdx = 0;
        int maxLength = 0;
        int currLength = 0;
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);

            if (Math.abs(max - min) <= limit) {
                currLength = i - startIdx + 1;
            } else {
                startIdx += 1;
                min = Arrays.stream(Arrays.copyOfRange(nums, startIdx, i+1)).min().getAsInt();
                max = Arrays.stream(Arrays.copyOfRange(nums, startIdx, i+1)).max().getAsInt();
            }

            if (currLength > maxLength)
                maxLength = currLength;


        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] input = {1,5,6,7,8,10,6,5,6};
        int limit = 4;
        LongestSubArrayElementDiff longestSubArrayElementDiff = new LongestSubArrayElementDiff();
        int len = longestSubArrayElementDiff.longestSubarray2(input, limit);
        System.out.println("---------------------------------------------------");
        System.out.println("Length::" + len);
    }

}
