package ai.noname.intel.sort;

import java.util.List;

import static java.lang.StrictMath.subtractExact;

public class BubbleSort {

    public static List<Integer> bubbleSort(List<Integer> inList) {
        long startTime = System.currentTimeMillis();
        for (int j = 1; j < inList.size() ; j++) {
            for (int i = 0; i < inList.size()-1; i++) {
                if (inList.get(j) > inList.get(i)) {
                    int temp = inList.get(j);
                    inList.set(j, inList.get(i));
                    inList.set(i, temp);
                }
            }
        }
        System.out.println(inList);
        System.out.println("Time Taken for bubbleSort" + subtractExact(System.currentTimeMillis(), startTime));
        return inList;
    }
}
