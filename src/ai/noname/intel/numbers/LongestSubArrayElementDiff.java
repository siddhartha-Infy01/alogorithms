package ai.noname.intel.numbers;

import java.util.Arrays;

public class LongestSubArrayElementDiff {

    public int longestSubarray(int[] nums, int limit) {
        int startIdx = 0;
        int maxLength = 0;
        int currLength = 0;
        if (nums.length == 1)
            return 1;
        for (int i = 1; i < nums.length; i++) {
            if (!checkMaxDiff(Arrays.copyOfRange(nums, startIdx, i), limit))
                startIdx += 1;
            else
                currLength = i - startIdx + 1;


            if (currLength > maxLength)
                maxLength = currLength;

            System.out.println("i::" + i + "::currLength::" + currLength + "::maxLength::" + maxLength + "::startIdx::" + startIdx);
        }


        return maxLength;
    }

    public boolean checkMaxDiff(int[] input, int limit) {
        Arrays.sort(input);
        System.out.println("highest::" + input[input.length - 1]);
        System.out.println("lowest::" + input[0]);
        if (Math.abs(input[input.length - 1] - input[0]) > limit)
            return false;
        return true;
    }

}
