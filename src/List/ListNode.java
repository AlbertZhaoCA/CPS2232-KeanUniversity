package list;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; 
      }
      
      public static void main(String[]args) {
      	ListNode a = new ListNode(0);
      	a.next =new ListNode(1);
      	a.next.next =new ListNode(2);
      	System.out.print(Solution.reversePrint(a)[0]);
      	
      }
  }
 
class Solution {
    public static int[] reversePrint(ListNode head) {
        int l = 1;
        ListNode aHead = head;
        while(aHead.next!=null){
            l++;
           aHead = aHead.next;

        }

        int[] arr = new int[l];
        for(int i = 0;i<l;i++){
            arr[l-i-1] = head.val;
            head = head.next;
        }
         return arr;
    }
  
   
}