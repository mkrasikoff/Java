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
        
        boolean addToNextInt = false;
        
        while(l1 != null || l2 != null || addToNextInt == true) {
            int firstNodeValue = getValueFromNode(l1);
            int secondNodeValue = getValueFromNode(l2);
            int sum = firstNodeValue + secondNodeValue;
            
            if(addToNextInt) {
                sum += 1;
                addToNextInt = false;
            }
            
            if(sum >= 10) {
                addToNextInt = true;
                sum = sum % 10;
            }
            
            listWithResult.add(sum);
            
            l1 = getNextNode(l1);
            l2 = getNextNode(l2);
        }
        
        System.out.println(listWithResult);
        ListNode listNode = null;
        ListNode firstNode = null;
        
        for(Integer value: listWithResult) {
            if(firstNode == null) {
                firstNode = new ListNode(value);
                listNode = firstNode;
                continue;
            }
            
            listNode.next = new ListNode(value);
            listNode = listNode.next;
        }
        
        return firstNode;
    }
    
    private int getValueFromNode(ListNode listNode) {
        if(listNode == null) return 0;
        
        return listNode.val;
    }
    
    private ListNode getNextNode(ListNode listNode) {
        if(listNode == null) return null;
        
        return listNode.next;
    }
}
