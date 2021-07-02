package ai.noname.intel.string;

public class LengthOfLongestSubstringTwoDistinct {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int maxLength = 1;
        if (s.length() > 1) {
            int startIdx = 0;
            int i = 1;
            while (i <= s.length()) {
                String sub = s.substring(startIdx, i);
                if (isContain2DistinctChars(sub)) {
                    if (sub.length() > maxLength)
                        maxLength = sub.length();
                    i++;
                } else {
                    startIdx++;
                }

            }
        }

        return maxLength;
    }

    private boolean isContain2DistinctChars(String s) {
        int count = 0;
        int[] r = new int[128];
        for (int i = 0; i < s.length(); i++) {
            r[s.charAt(i)]++;
            if (r[s.charAt(i)] <= 1) {
                count++;
            }
        }
        return count <= 2;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstringTwoDistinct longestSubstringTwoDistinct = new LengthOfLongestSubstringTwoDistinct();
        int len = longestSubstringTwoDistinct.lengthOfLongestSubstringTwoDistinct("ccaabbb");
        System.out.println("len::" + len);
    }


}
