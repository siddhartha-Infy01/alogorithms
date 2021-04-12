package ai.noname.intel.sort;

import java.util.List;

import static java.lang.StrictMath.subtractExact;

public class SelectionSort {

    public static List<Integer> selectionSort(List<Integer> inList) {
        long startTime = System.currentTimeMillis();
        int minidx = 0;
        for (int j = 0; j < inList.size() - 1; j++) {
            minidx = j;
            for (int i = j + 1; i < inList.size(); i++) {
                if (inList.get(minidx) > inList.get(i)) {
                    int temp = inList.get(minidx);
                    inList.set(minidx, inList.get(i));
                    inList.set(i, temp);

                }
            }
        }
        System.out.println(inList);
        System.out.println("Time Taken for selectionSort" + subtractExact(System.currentTimeMillis(), startTime));
        return inList;
    }
}
