class Node {
	int data;
	Node next;

	Node(int value) {
		data = value;
		next = null;
	}
}



class LinkedList1 {     
Node head  = null;              

	void insertFirst(int value) {         
		Node newnode = new Node(value);         
		if (head == null) {            
				     
		} else {             
			newnode.next = head;             
			head = newnode;             
		}     
	}        
	void insertAtPosition(int k,int value) {         
		Node newnode = new Node(value);         
		if (head == null) {             
			head = newnode;         
		} else {             
			Node temp = head;             
			int i =1;             
			while(i<k-1) {                 
				temp = temp.next;                 
				i++;             
			}             
			newnode.next = temp.next;            
			temp.next = newnode;         
		}            
	}
        
	void insertLast(int value) {         
		Node newnode = new Node(value);         
		if (head == null) {             
			head = newnode;         
		} else {             
			Node temp = head;             
			int i =1;          
			while(temp.next!=null) {                 
				temp = temp.next;             
			}             
			temp.next = newnode;
		}        
	}
     
	int middle(LinkedList1 ll) {
		Node slowPtr = ll.head;
		Node fastPtr = ll.head;
		while (fastPtr!=null && fastPtr.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		return slowPtr.data;
	}

	void removeLoop(CircularLinkedList cll) {
		Node slowPtr = cll.head;
		Node fastPtr = cll.head;
		while (fastPtr!=null && slowPtr!=null && fastPtr.next!=null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if (slowPtr == fastPtr) {
				slowPtr.next = null;
			}
		}
	}
	
	void reverse() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while( current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head.next = current;
		head = current;
	}

}


class CircularLinkedList {
	public Node head = null;

	public void insertHead(int item) {
		Node newnode = new Node(item);
		if (head == null) {
			head = newnode;
			newnode.next = head;
		} else {
			Node temp = head;
			while (temp.next!=head) {
				temp = temp.next;
			}
		}
		newnode.next = head;
		head = newnode;
	}

	public void insertAtPosition(int position, int item) {
		Node newnode = new Node(item);
		Node temp = head;
		int i = 1;
		while (i < position - 1) {
			temp = temp.next;
			i++;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}

	public void insertTail(int item) {
		Node newnode = new Node(item);
		if (head == null) {
			head = newnode;
			newnode.next = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = head;
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	int traversal() {
		Node temp= head;
		while (temp.next!=head) {
			temp= temp.next;
		}
		return temp.data;
	}
	
	void print() {
		Node temp= head;
		while (temp.next!=head) {
			System.out.println(temp.data);
			temp= temp.next;
		}
		System.out.println(temp.data);
	}

	public void sortedInsert(int item) {
		Node newnode = new Node(item);
		newnode.next = null;
		Node temp = head;
		int c  =traversal();
		if (isEmpty()) {
			head = newnode;
			newnode.next = head;
		} else if (item>c) {
			insertTail(item);
		} else {
			while (temp.next != head && temp.next.data < item) {
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}

	void duplicate(CircularLinkedList cll) {
		Node temp = head;
		int count = 0;
		while(temp.next!=head) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}
			temp =temp.next;
		}
		while (temp.next!=head) {
			temp= temp.next;
			count++;
		}
		System.out.println(count+1);
	}
	
	
	
	
	
	void split(CircularLinkedList cll) {
		Node slowPtr = cll.head;
		Node fastPtr = cll.head;
		while (fastPtr!=head && fastPtr.next!=head) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		Node nextElement = slowPtr;
		slowPtr.next = head;
		fastPtr.next = nextElement;
		}
}

class LinkedList {
	public static void main(String[] args) {
		CircularLinkedList cll1 = new CircularLinkedList();
		cll1.insertHead(2);
		cll1.insertTail(7);
		cll1.insertAtPosition(2,5); 
		cll1.traversal();
		cll1.sortedInsert(6);
		cll1.print();
		int mid = cll1.middle(cll1);
		System.out.println(mid);
		
		LinkedList1 ll1 = new LinkedList1();
		ll1.insertFirst(2);
		ll1.insertLast(6);
		ll1.insertAtPosition(2,3);
		ll1.insertAtPosition(3,4);
		ll1.insertAtPosition(4,5);
		int mid  = ll1.middle(ll1);
		System.out.println(mid);
}
}
