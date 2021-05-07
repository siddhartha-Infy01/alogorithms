package ai.noname.intel.string;

public class UniqueCharsInString {

    public static boolean checkUniqueChars(String str){
        char[] strArr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<strArr.length;j++){
                if(strArr[i]==strArr[j])
                    return false;
            }        }
        return true;
    }

    public static boolean checkUniqueCharsOptimized(String str){
        char[] strArr=str.toCharArray();
        int[] chars=new int[128];
        for(int i=0;i<strArr.length;i++){
            chars[strArr[i]]++;
            if(chars[strArr[i]]>1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abcdefghijklmnop";
        System.out.println("Checking if string " + str+
                "has unique Chars::"+checkUniqueCharsOptimized(str));
    }
}
