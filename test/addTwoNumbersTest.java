import dataStructure.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addTwoNumbersTest {

    @Test
    void differentLengthWithCarry() {
        addTwoNumbers solution = new addTwoNumbers();
        ListNode l1 = buildList(new int[]{9, 9, 9, 9});
        ListNode l2 = buildList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode resultList = solution.addTwoNumbers(l1, l2);
        int[] resultArr = turnListToArray(resultList);
        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, resultArr);
    }

    @Test
    void differentLengthAdd2() {
        addTwoNumbers solution = new addTwoNumbers();
        ListNode l1 = buildList(new int[]{4});
        ListNode l2 = buildList(new int[]{1, 2, 3});
        ListNode resultList = solution.addTwoNumbers(l1, l2);
        int[] resultArr = turnListToArray(resultList);
        assertArrayEquals(new int[]{5, 2, 3}, resultArr);
    }

    @Test
    void differentLengthAdd1() {
        addTwoNumbers solution = new addTwoNumbers();
        ListNode l1 = buildList(new int[]{1, 2, 3});
        ListNode l2 = buildList(new int[]{4});
        ListNode resultList = solution.addTwoNumbers(l1, l2);
        int[] resultArr = turnListToArray(resultList);
        assertArrayEquals(new int[]{5, 2, 3}, resultArr);
    }

    @Test
    void CarryListAdd() {
        addTwoNumbers solution = new addTwoNumbers();
        ListNode l1 = buildList(new int[]{1, 2, 3});
        ListNode l2 = buildList(new int[]{4, 5, 7});
        ListNode resultList = solution.addTwoNumbers(l1, l2);
        int[] resultArr = turnListToArray(resultList);
        assertArrayEquals(new int[]{5, 7, 0, 1}, resultArr);
    }


    @Test
    void NonCarryListAdd() {
        addTwoNumbers solution = new addTwoNumbers();
        ListNode l1 = buildList(new int[]{1, 2, 3});
        ListNode l2 = buildList(new int[]{4, 5, 6});
        ListNode resultList = solution.addTwoNumbers(l1, l2);
        int[] resultArr = turnListToArray(resultList);
        assertArrayEquals(new int[]{5, 7, 9}, resultArr);
    }


    int[] turnListToArray(ListNode l) {
        int len = getArrLen(l);
        int[] arr = new int[len];
        int index = 0;
        ListNode temp = l;
        while (temp != null) {
            arr[index] = temp.val;
            index++;
            temp = temp.next;
        }
        return arr;
    }

    int getArrLen(ListNode l) {
        int len = 0;
        while (l != null) {
            l = l.next;
            len++;
        }
        return len;
    }

    ListNode buildList(int[] valueList) {
        ListNode temp = null, head = null;
        for (int val : valueList) {
            ListNode listNode = new ListNode(val);
            if (temp == null) {
                head = listNode;
            } else {
                temp.next = listNode;
            }
            temp = listNode;
        }
        return head;
    }
}