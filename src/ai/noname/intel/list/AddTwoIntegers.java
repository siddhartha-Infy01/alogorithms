package ai.noname.intel.list;

public class AddTwoIntegers {


    public ListNode addTwoNumbersV2(ListNode l1, ListNode l2) {
        ListNode result=new ListNode();
        ListNode prev=result;
        int sum=0;
        int carry=0;
        do{
            sum=l1.val+l2.val+carry;

            if(sum>10){
                carry=sum%10;
                sum=sum/10;
            }else{
                carry=0;
            }

            System.out.println("sum::"+sum);
            System.out.println("carry::"+carry);

            if(result.next==null){
                result.val=sum;
            }else{
                ListNode node=new ListNode(sum);
                prev.next=node;
                prev=node;
            }
            l1=l1.next;
            l2=l2.next;
        }while(l1.next!=null&&l2.next!=null);

        return result;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length1 = length(l1);
        int length2 = length(l2);
        int num1 = getNumberFromDigits(length1, l1);
        int num2 = getNumberFromDigits(length2, l2);
        int finalSum = num1 + num2;
        return getDigitsFromNumber(finalSum);

    }

    public int getNumberFromDigits(int len, ListNode linkedList) {
        int number = 0;
        ListNode current = linkedList;
        for (int i = 0; i <= len - 1; i++) {
            number = number + (10 ^ i * current.val);
            current = current.next;
        }
        return number;
    }

    public ListNode getDigitsFromNumber(int num) {

        ListNode head = new ListNode();
        ListNode prev = new ListNode();
        int nodeval = 0;
        do {
            nodeval = num % 10;
            num = num / 10;
            if(head.next==null) {
                head.val = nodeval;
                head.next = new ListNode();
                prev=head;
            }else{
                ListNode current=prev.next;
                current.val=nodeval;
                current.next=new ListNode();
                prev=current;
            }
        } while (num == nodeval);
        return head;
    }

    public int length(ListNode head){
        int count=1;
        while (head.next!=null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


}



