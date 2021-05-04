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

    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        System.out.println("Checking if string " + str+
                "has unique Chars::"+checkUniqueChars(str));
    }
}
