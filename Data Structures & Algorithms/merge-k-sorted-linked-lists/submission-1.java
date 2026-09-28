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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeSort(0, lists.length - 1, lists);
    }

    private ListNode mergeSort(int left, int right, ListNode[] lists) {
        if (left == right) {
            return lists[left];
        }

        int middle = (right + left) / 2;

        ListNode l = mergeSort(left, middle, lists);
        ListNode r = mergeSort(middle + 1, right, lists);
        
        return mergeTwo(l, r);
    }

    private ListNode mergeTwo(ListNode listA, ListNode listB) {
        ListNode dummy = new ListNode(-1);
        ListNode current  = dummy;

        while (listA != null && listB != null) {
            if (listA.val <= listB.val) {
                current.next = listA;
                listA = listA.next;
            } else {
                current.next = listB;
                listB = listB.next;
            }

            current = current.next;
        }

        if (listA != null) {
            current.next = listA;
        } else {
            current.next = listB;
        }

        return dummy.next;
    }
}
