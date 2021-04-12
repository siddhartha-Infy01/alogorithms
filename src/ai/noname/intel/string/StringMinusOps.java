package ai.noname.intel.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMinusOps {
    public String string1MinusString2(String string1,String string2){
        String[] strChar1=string1.split(" ");
        String[] strChar2=string2.split(" ");
        List<String> finalArr=new ArrayList<>();
        for(String s:strChar1){
            for(String k:strChar2){
                if(s.compareTo(k)==0){
                    finalArr.add(s);
                }
            }
        }
        return finalArr.toString();
    }
}
