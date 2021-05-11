package ai.noname.intel.string;

public class BitWiseOperation {

    public static void main(String[] args) {
        int x=9;
        x^=1;
        System.out.println("value of x="+x);
        int y= 1<<x;
        System.out.println("value of y="+y);

    }
}
