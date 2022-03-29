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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        List<Integer> listWithResult = new ArrayList<>();
        
        while(l1 != null) {
            int firstNodeValue = getValueFromNode(l1);
            int secondNodeValue = getValueFromNode(l2);
            
            int sum = firstNodeValue + secondNodeValue;
            listWithResult.add(sum);
            
            l1 = getNextNode(l1);
            l2 = getNextNode(l2);
        }
        
        System.out.println(listWithResult);
        
        return null;
    }
    
    private int getValueFromNode(ListNode listNode) {
        return listNode.val;
    }
    
    private ListNode getNextNode(ListNode listNode) {
        return listNode.next;
    }
}