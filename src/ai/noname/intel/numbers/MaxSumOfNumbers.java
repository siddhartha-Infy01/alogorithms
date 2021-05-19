package ai.noname.intel.numbers;

import java.util.Arrays;
import java.util.Collections;

public class MaxSumOfNumbers {

    public int maxScore(int[] input, int maxCards) {
        int maxSum = 0;
        int sum = 0;
        if (input.length == maxCards) {
            int[] rightArr = new int[maxCards];
            return sumArr(input, rightArr);
        } else {
            for (int i = 0; i <= maxCards; i++) {
                int[] leftArr = Arrays.copyOfRange(input, 0, i);
                int[] rightArr = Arrays.copyOfRange(input, input.length - maxCards + i, input.length);
                sum = sumArr(leftArr, rightArr);
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }

    public int sumArr(int[] leftArr, int[] rightArr) {
        int sum = 0;
        int i = 0;
        if (leftArr.length > rightArr.length) {
            int[] temp = rightArr;
            rightArr = leftArr;
            leftArr = temp;
        }
        for (int j = rightArr.length - 1; j >= 0; j--) {

            if (i <= leftArr.length - 1) {
                sum = sum + leftArr[i] + rightArr[j];
                i++;
            } else {
                sum = sum + rightArr[j];
            }
        }
        return sum;
    }

    public int maxScoreSW(int[] cardPoints, int k) {
        int totalScore=sumTheArray(cardPoints);
        int minSubarrayScore=totalScore;
        int startingIndex=0;
        if(cardPoints.length==totalScore)
            return totalScore;
        int requiredSubArrLen=cardPoints.length-k;

        int presentSubArrScore = 0,startIdx=0;

        for(int i=0;i<cardPoints.length;i++){
            presentSubArrScore=presentSubArrScore+cardPoints[i];

            int presentSubarrayLength=i-startingIndex+1;
            if(presentSubarrayLength==requiredSubArrLen)
            {
                minSubarrayScore = Math.min(minSubarrayScore, presentSubArrScore);
                presentSubArrScore -= cardPoints[startingIndex++];
            }
        }

        return totalScore - minSubarrayScore;

    }

    public int sumTheArray(int[] cardPoints){
        int sum=0;
        for(int i=0;i<cardPoints.length;i++)
        {
            sum=sum+cardPoints[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {96, 90, 41, 82, 39, 74, 64, 50, 30};
        MaxSumOfNumbers maxSumOfNumbers = new MaxSumOfNumbers();
        System.out.println(maxSumOfNumbers.maxScore(arr, 8));
    }
}
