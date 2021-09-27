package ai.noname.intel.compare;

public class VersionControl {

    public int firstBadVersion(int n) {
        int pivot = 0, left = 0, right = n;
        pivot = n / 2;
        System.out.println();
        while (pivot > 0 && pivot <= n) {
            if (isBadVersion(pivot - 1)) {
                pivot = pivot / 2;
            } else if (isBadVersion(pivot + 1)) {
                pivot = n - pivot / 2;
            } else {
                return pivot;
            }

        }
        return -1;
    }

    private boolean isBadVersion(int i) {
        return true;
    }
}
