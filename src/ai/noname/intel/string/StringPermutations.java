package ai.noname.intel.string;

public class StringPermutations {

    public boolean checkStringPermutations(String s1,String s2){
        int[] chars=new int[128];
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            chars[arr1[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            if(chars[arr2[i]]<1)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        StringPermutations stringPermutations=new StringPermutations();
        System.out.println("Is Permutations::"+stringPermutations.checkStringPermutations("dog","god"));
    }
}
