package ai.noname.intel.string;

public class LongestPalindromicString {
    public String longestPalindrome(String s) {
        int startIdx = 1;
        String result = "";
        while (startIdx < s.length() - 1) {
            int i = startIdx - 1, j = startIdx + 1;
            while (i >= 0 && i < s.length() - 1 - j) {
                String subString = s.substring(i, j);
                if (subString.charAt(i) == subString.charAt(j)) {
                    i--;
                    j++;
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
        LongestPalindromicString longestPalindromicString=new LongestPalindromicString();
        System.out.println("longestPalindromicString::"+longestPalindromicString.longestPalindrome("ceabcbafqrelovuolexyz"));
    }
}
