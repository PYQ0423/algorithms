import dataStructure.ListNode;

//https://leetcode-cn.com/problems/add-two-numbers/
public class addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1, n2 = l2, n2_before = l2;
        boolean need_carry = false;
        while (n1 != null && n2 != null) {
            if (need_carry) {
                n2.val = n1.val + n2.val + 1;
                need_carry = false;
            } else {
                n2.val = n1.val + n2.val;
            }
            if (n2.val >= 10) {
                need_carry = true;
                n2.val -= 10;
            }
            n1 = n1.next;
            n2_before = n2;
            n2 = n2.next;
        }
        if (n1 != null & n2 == null) {
            n2_before.next = n1;
        }

        while (n2 != null || need_carry) {
            if (need_carry) {
                if (n2 != null) {
                    n2.val = n2.val + 1;
                    if (n2.val >= 10) {
                        need_carry = true;
                        n2.val -= 10;
                    } else {
                        need_carry = false;
                    }
                } else {
                    n2 = new ListNode(1);
                    n2.next = null;
                    n2_before.next = n2;
                    need_carry = false;
                }
            }
            n2_before = n2;
            n2 = n2.next;
        }
        return l2;
    }
}


class SolutionAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}



