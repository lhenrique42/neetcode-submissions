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
    public boolean hasCycle(ListNode head) {
        Set<Integer> hash = new HashSet<>();

        ListNode current = head;

        while (current != null) {
            if (hash.contains(current.hashCode())) {
                return true;
            }
            hash.add(current.hashCode());
            current = current.next;
        }

        return false;
    }
}
