package ai.noname.intel.string;

public class LongestPalindromicString {
    public String longestPalindrome(String s) {
        int startIdx = 1;
        String result = "";
        while (startIdx < s.length() - 1) {
            int i = startIdx - 1, j = startIdx + 1;
            System.out.println("i::" + i + "::j::" + j + "::startidx::" + startIdx);
            while (i >= 0) {
                String subString ="";
                System.out.println("substring::" + subString);
                if (s.charAt(i) == s.charAt(j)) {
                    subString=s.substring(i, j + 1);
                    i--;
                    j++;
                    if (i < 0)
                        startIdx++;

                } else {
                    startIdx++;
                    break;
                }
                if (subString.length() > result.length())
                    result = subString;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestPalindromicString longestPalindromicString = new LongestPalindromicString();
        System.out.println("longestPalindromicString::" + longestPalindromicString.longestPalindrome("cbbd"));
    }
}
