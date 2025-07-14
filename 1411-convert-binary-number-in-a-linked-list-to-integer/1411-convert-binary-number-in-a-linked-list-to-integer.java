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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        StringBuilder sb1=new StringBuilder("");
        while(temp!=null){
        int val=temp.val;
        sb1.append(val);
        temp=temp.next;
        }
        System.out.println(sb1);

        return Integer.parseInt(sb1.toString(),2);
        
    }
}