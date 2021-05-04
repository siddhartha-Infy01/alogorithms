package ai.noname.intel.string;

import java.util.Arrays;

public class NonRepeatingLongestSubstr {

    public int lengthOfLongestSubstringV1(String s) {
        char[] sAr=s.toCharArray();
        int maxLength=0;
        int currLength=0;
        if(s.length()>1){
            for(int i=1;i<=sAr.length;i++){
                char[] t=Arrays.copyOfRange(sAr, 0, i);
                currLength=maxLenNonRepeatingChars(new String(t));
                if(currLength>maxLength)
                    maxLength=currLength;

            }
        }else{
            return s.length();
        }
        return maxLength;

    }

    public int containsRepeatingChars(char[] sAr){

        int maxLength=1;
        int currLength=0;
        for(int i=0;i<sAr.length;i++){
            for(int j=i+1;j<sAr.length;j++){
                currLength=j-i+1;
                if(sAr[i]==sAr[j]){
                    maxLength=1;
                    break;
                }else{
                    if(currLength>maxLength)
                        maxLength=currLength;
                }
            }
        }
        return maxLength;

    }

    public int maxLenNonRepeatingChars(String input){
        String comparable="abcdefghijklmnopqrstuvwxyz";
        char[] str=input.toCharArray();
        int len=0;
        for(int i=0;i<str.length;i++){
            if(comparable.indexOf(str[i])>=0){
                len++;
                comparable=comparable.replace(str[i], ' ');
                System.out.println(comparable);
            }else{
                return len;
            }
        }
        System.out.println(len);
        return len;
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] chars=new int[128];
        int left=0,right = 0,res=0;
        while(right<s.length()){
            char r=s.charAt(right);
            chars[r]++;
            while(chars[r]>1){
                char l=s.charAt(left);
                chars[l]--;
                left++;
            }
            res=Math.max(res,right-left+1);
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str="pwwkew";
        System.out.println("len of longest string::"+lengthOfLongestSubstring(str));
    }
}
