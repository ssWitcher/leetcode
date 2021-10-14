public class Main {
    public static void main(String args[]){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(4);
        ListNode tmpL1 = l1.next;
        tmpL1.next = new ListNode(3);
        l2.next = new ListNode(6);
        ListNode tmpL2 = l2.next;
        tmpL2.next = new ListNode(4);
        ListNode ans  = addTwoNumbers.addTwoNumbers(l1, l2);
        while(l1 != null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            System.out.println(l2.val);
            l2 = l2.next;
        }
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
    
}
