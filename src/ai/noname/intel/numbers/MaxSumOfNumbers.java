package ai.noname.intel.numbers;

import java.util.Arrays;

public class MaxSumOfNumbers {

    public int maxScore(int[] input, int maxCards) {
        int maxSum = 0;
        int sum = 0;
        int[] leftArr = new int[maxCards];
        int[] rightArr = new int[maxCards];
        if (input.length == maxCards)
            return sumArr(input, rightArr);
        else {
            for (int i = 0; i < maxCards; i++) {
                leftArr = Arrays.copyOfRange(input, 0, i);
                rightArr = Arrays.copyOfRange(input, input.length-1 - maxCards + i, input.length - 1);
                sum = sumArr(leftArr, rightArr);
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }

    public int sumArr(int[] leftArr, int[] rightArr) {
        int sum = 0;
        for (int i = 0, j = rightArr.length-1; i < leftArr.length; i++) {
            System.out.println("leftArr"+leftArr[i]);
            System.out.println("rightArr"+rightArr[j]);
            if (j > 0) {
                sum = sum + leftArr[i] + rightArr[j];
                j--;
            } else {
                sum = sum + leftArr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        MaxSumOfNumbers maxSumOfNumbers = new MaxSumOfNumbers();
        System.out.println(maxSumOfNumbers.maxScore(arr, 3));
    }
}
