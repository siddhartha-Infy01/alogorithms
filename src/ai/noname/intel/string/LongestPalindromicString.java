package ai.noname.intel.string;

public class LongestPalindromicString {
    public String longestPalindrome(String s) {
        int startIdx = 0;
        String result = "";
        while (startIdx < s.length() - 1) {
            String subString = "";
            int i = startIdx == 0 ? 0 : startIdx - 1;
            int j = startIdx == s.length() - 1 ? startIdx : startIdx + 1;
            while (i >= 0 && j < s.length()) {
                if (s.charAt(i) == s.charAt(j) ) {
                    subString = s.substring(i, j + 1);
                    if (i == 0) {
                        j++;
                    } else {
                        i--;
                        j++;
                    }
                } else {
                    if (s.charAt(startIdx) == s.charAt(j)) {
                        subString = s.substring(startIdx, j + 1);
                    }
                    startIdx++;
                    break;
                }
                if (j == s.length())
                    startIdx = j;
            }


            if (subString.length() > result.length()) {
                result = subString;
                System.out.println(result);
            }
        }
        if (result.equals("")) {
            result = s.substring(0, 1);
        }
        return result;
    }

    public static void main(String[] args) {
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();
        System.out.println("longestPalindromicString::" + longestPalindromicString.longestPalindrome("cbbc"));
    }
}
