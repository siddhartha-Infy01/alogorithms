package ai.noname.intel.array;

import ai.noname.intel.sort.SelectionSort;

import java.util.Arrays;
import java.util.List;

import static java.lang.StrictMath.subtractExact;

public class MaxDupElements {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 1;
        int max=0;
        for (int i = 0; i <candles.size(); i++) {
            if(max==candles.get(i))
            {
                count++;
            }else if(candles.get(i)>max){
                max=candles.get(i);
                count=1;
            }


        }
        return count;
    }





    public static void main(String[] args) {
        Integer[] ar = {3,2,1,3};
       // bubbleSort(Arrays.asList(ar));
        //selectionSort(Arrays.asList(ar));
        System.out.println(birthdayCakeCandles(Arrays.asList(ar)));
    }
}
