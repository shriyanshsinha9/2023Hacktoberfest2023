/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){return null;}
        ListNode temp = head;
        HashSet<ListNode> set = new HashSet<>();
            while(!set.contains(temp)){
                set.add(temp);
                temp = temp.next;
                if(temp == null){return null;}
            }
        
        return temp;
    }
}
