package ai.noname.intel.string;

import java.util.Arrays;

public class UrilfyString {

    public String urilfyString(String input) {

        int count = 0;
        char[] strArr = input.toCharArray();
        char[] replace = {'%', '2', '0'};
        char[] copyArr = new char[16];
        for (int i = 0; i < strArr.length; i++) {
            if (count == copyArr.length - 3)
                copyArr = increment(copyArr, copyArr.length);

            if (strArr[i] == ' ') {
                for (int j = 0; j < replace.length; j++) {
                    copyArr[count++] = replace[j];
                }
            } else {
                copyArr[count++] = strArr[i];
            }

        }
        return new String(copyArr).substring(0, count);
    }

    public char[] increment(char[] input, int len) {
        int idx = (int) ((int) Math.log(len) / Math.log(2));
        idx++;
        int newArrLen = (int) Math.pow(2, idx);
        char[] newArr = new char[newArrLen];
        for (int i = 0; i < input.length; i++) {
            newArr[i] = input[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        UrilfyString urilfyString = new UrilfyString();
        String input = "abc def syeriuwey iwuyeriwyrwoi";
        System.out.println("Urilfied String::" + urilfyString.urilfyString(input));
    }
}
