/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> list1=new HashSet<>();
        for(int val: nums){
            list1.add(val);
        }
        System.out.println(list1);
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        ListNode dTemp=dummy;
        while(temp!=null){
            int val1=temp.val;
            if(!list1.contains(val1)){
                dTemp.next=new ListNode(val1);
                dTemp=dTemp.next;
               
            }
            temp=temp.next;
        }

        return dummy.next;
        
    }
}