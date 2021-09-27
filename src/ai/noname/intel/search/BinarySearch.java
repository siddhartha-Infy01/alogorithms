package ai.noname.intel.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int pivot = 0, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[left] == target)
                return pivot;
            else if (nums[pivot] > target)
                left = pivot + 1;
            else
                right = pivot - 1;
        }
        return -1;
    }

    private int binarySearch(int[] nums, int target, int lastpivot) {

        int arrLen = nums.length;
        int pivot = 0;
        if (arrLen % 2 == 0)
            pivot = arrLen / 2;
        else
            pivot = arrLen / 2 + 1;
        if (target < nums[pivot]) {
            return binarySearch(Arrays.copyOfRange(nums, 0, pivot), target, lastpivot + pivot - 1);
        } else if (target > nums[pivot]) {
            return binarySearch(Arrays.copyOfRange(nums, pivot, arrLen), target, pivot);
        } else {
            return lastpivot;
        }
    }

    public static void main(String[] args) {
        System.out.println("Module::"+3%7);
    }

    public int fib(int n) {
        Map<Integer,Integer> cache=new HashMap<>();

        if(n==1||n==0)
            return n;

        Integer firstVal=cache.get(n-1);
        Integer secondVal=cache.get(n-2);

        int fibValue=(firstVal==null?fib(n-1):firstVal)+(secondVal==null?fib(n-2):secondVal);
        cache.put(n-1,firstVal);
        cache.put(n-2,secondVal);
        return fibValue;

    }

    public int fib1(int n) {
        if(n==1||n==0)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
