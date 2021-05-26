package ai.noname.intel.string;

public class OneEditAway {

    public static boolean isOneEditAway(String s1,String s2){
        int index1=0,index2=0;
        boolean diffFound=false;
        if(s1.length()-s2.length()>1)
            return false;
        String shorter= s1.length()>s2.length()?s2:s1;
        String longer=s1.length()>s2.length()?s1:s2;
        while(index1<shorter.length() && index2<longer.length()){
            if(shorter.charAt(index1)!=longer.charAt(index2)) {
                if (diffFound)
                    return false;
                diffFound = true;
                if(shorter.length()==longer.length()) {
                    index1++;
                }
            }else{
                index1++;
            }
            index2++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is One Edit Away"+isOneEditAway("pales","dale"));
    }
}
