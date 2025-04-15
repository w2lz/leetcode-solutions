/**
 * AlgoCastsTitle: P9. 反转单链表
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/QrWZbW5w
 * LeetCodeTitle: 206. 反转链表
 * LeetCodeLink: https://leetcode.cn/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList {
    // Time: O(n)  Space: O(1)
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
