import java.util.*;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
    	HashSet<Integer> set=  new HashSet<Integer>();
    	ListNode t= new ListNode(0);
    	t.next=head;
    	ListNode p= t;
    	
    	while(p.next!=null){
    		if(set.contains(p.next.val)){
    			if(p.next.next!=null){
    			p.next=p.next.next;
    			}
    			else
    			{p.next=null;}
    		}else{
    			set.add(p.next.val);
    		}
    		
    		p=p.next;
    	}
        
    	return head;
    }
    
    public static void main(String args[]){
    	RemoveDuplicates test= new RemoveDuplicates();
    	ListNode list= new ListNode(0);
    	list=list.buildList("1,1");
    	list.printlistnode(list);
    	test.deleteDuplicates(list);
    }

}
