public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode itr1 = l1;
        ListNode itr2 = l2;
        ListNode ansItr = ans;
        int carryOver = 0;
        while(itr1 != null || itr2 != null){
            int addition = 0;
            if(itr1 != null && itr2 != null){
                addition =  itr1.val + itr2.val;
            }else if(itr1  !=null){
                addition = itr1.val;
            }else{
                addition = itr2.val;
            }
            addition += carryOver;
            carryOver = addition/10;
            addition = addition%10;
            if(ans == null){
                ans = new ListNode(addition);
            }else{
                ansItr = ans;
                while(ansItr.next != null){
                    ansItr = ansItr.next;
                }
                ListNode tmp = new ListNode(addition);
                ansItr.next = tmp;
            }
            if(itr1 != null ){
                itr1 = itr1.next;
            }
            if(itr2 != null) {
                itr2 = itr2.next;
            }
        }
        if(carryOver != 0){
            ansItr = ans;
            while(ansItr.next != null){
                ansItr = ansItr.next;
            }
            ListNode tmp = new ListNode(carryOver);
            ansItr.next = tmp;
        }
        return ans;        
    }
}