package linkedLists;

public class AddTwoNumbers {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        addTwoNumbers(l1, l2);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        return res.next;


//        int somaL1 = getSum(l1);
//        int somaL2 = getSum(l2);
//
//        String total = somaL1 + somaL2 + "";


    }

    public static int getSum(ListNode listNode) {
        int soma = listNode.val;
        int expoente = 1;
        while (listNode.next != null) {
            soma += listNode.next.val * Math.pow(10, expoente);
            expoente++;
            listNode = listNode.next;
        }
        return soma;
    }

    public static void addNext(ListNode actual, ListNode next) {
        actual.next = next;
    }

} //class


