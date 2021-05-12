package ai.noname.intel.numbers;

import java.util.Arrays;
import java.util.Collections;

public class MaxSumOfNumbers {

    public int maxScore(int[] input,int maxCards){
        int maxSum = 0;
        int sum = 0;
        int[] leftArr = new int[maxCards];
        int[] rightArr = new int[maxCards];
        if (input.length == maxCards)
            return sumArr(input, rightArr);
        else {
            for (int i = 0; i < maxCards; i++) {
                leftArr = Arrays.copyOfRange(input, 0, i);
                rightArr = Arrays.copyOfRange(input, input.length - maxCards + i, input.length);
                sum = sumArr(leftArr, rightArr);
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }

    public int sumArr(int[] leftArr, int[] rightArr) {
        int sum=0;
        int i = 0;

        if(leftArr.length>rightArr.length) {
            int[] temp=rightArr;
            rightArr=leftArr;
            leftArr=temp;
        }
        for (int j = rightArr.length-1; j >= 0; j--) {
            if (i <= leftArr.length-1) {
                sum = sum + leftArr[i] + rightArr[j];
                i++;
            } else {
                sum = sum + rightArr[j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {96,90,41,82,39,74,64,50,30};
        MaxSumOfNumbers maxSumOfNumbers = new MaxSumOfNumbers();
        System.out.println(maxSumOfNumbers.maxScore(arr, 8));
    }
}
