package ai.noname.intel.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> strings=new ArrayList<>();
        int index=0;
        for(int i=lower;i<=upper;i++){
            index=Arrays.binarySearch(nums,lower);
            if(index<0){
                
            }

        }

        return strings;
    }
}
