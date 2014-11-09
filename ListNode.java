
public class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
    
    public ListNode buildList(String s){
    	String[] temp=s.split(",");
    	ListNode head= new ListNode(Integer.parseInt(temp[0]));
    	ListNode p=head;
    	
    	for(int i=1;i<temp.length-1;i++){
    		ListNode node= new ListNode(Integer.parseInt(temp[i]));
    		p.next=node;
    		p=p.next;
    	}
    	
    	ListNode end= new ListNode(Integer.parseInt(temp[temp.length-1]));
    	p.next=end;
    	end.next=null;
    	
    	return head;
    	
    }
    
    public void printlistnode(ListNode node){
    	ListNode temp= node;
    	while(temp!=null){
    		System.out.println(temp.val);
    		temp=temp.next;
    	}
    }
    
    public static void main(String args[]){
    	ListNode test= new ListNode(0);
    	String list="1,2,3,4,5,6";
    	test=test.buildList(list);
    	
    	test.printlistnode(test);

    }
 }
