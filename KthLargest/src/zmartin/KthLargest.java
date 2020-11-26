package zmartin;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;

class KthLargest {
    ListNode head;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        if(nums.length > 0){
            head = new ListNode(nums[0], null);
            for(int i =1; i<nums.length ; i++){
                    ListNode temp = new ListNode(nums[i], null);
                    ListNode current = head;
                    ListNode previous = null;
                    while (temp.val<= current.val){
                        previous = current;
                        current = current.next;
                        if(current == null){
                            break;
                        }
                    }
                    //In between, current is current.next
                    if(previous == null){
                        head = temp;
                        temp.next = current;
                    }
                    else{
                        previous.next = temp;
                        temp.next = current;
                    }
            }
        }
    }
    public int mutiplex() {
    	ArrayList<Integer> al = new ArrayList<>();
    	al.add(3);
    	al.get(0);
    	HashMap<String, Integer> map =new HashMap<>();
    	map.put("Martin",1);
    	HashSet<Integer> set = new HashSet<>();
    	Deque<Integer> deque = new Deque<>();
    	deque.push(1);
    	
    	return 0;
    }
    public int add(int val) {
        ListNode temp = new ListNode(val, null);
        ListNode current = head;
        ListNode previous = null;
        while (temp.val<= current.val){
            previous = current;
            current = current.next;     
            if(current == null){
               break;
            }
        }
        //In between, current is current.next
        if(previous == null){
            head = temp;
            temp.next = current;
        }
        else{
            previous.next = temp;
            temp.next = current;
        }
        ListNode result = head;
        int j = k;
        while(--j>0){
            if(result == null){
                return -1;
            }
            result = result.next;
        }
        return result.val;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val, ListNode next){
            this.val =val;
            this.next =next;
        }
    }
}