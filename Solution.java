/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode node = ans;
        boolean adddig=false;
        boolean l1next=true;
        boolean l2next=true;
        do{
            if (adddig==true){
                if(l1.val+l2.val+1>9){
                    node.next=new ListNode(l1.val+l2.val+1-10);
                    adddig=true;
                }else{
                    node.next=new ListNode(l1.val+l2.val+1);
                    adddig=false;
                } 
            }else{
                if(l1.val+l2.val>9){
                    node.next=new ListNode(l1.val+l2.val-10);
                    adddig=true;
                }else{
                    node.next=new ListNode(l1.val+l2.val);
                    adddig=false;
                }
            }
            node=node.next;
            if(l1.next!=null){
                l1=l1.next;
                l1next=true;
            }else{
                l1.next=new ListNode(0);
                l1=l1.next;
                l1next=false;
            }
            if(l2.next!=null){
                l2=l2.next;
                l2next=true;
            }else{
                l2.next=new ListNode(0);
                l2=l2.next;
                l2next=false;
            }
        }while(l1next==true || l2next==true || adddig==true);
        return ans.next;
    }
}
