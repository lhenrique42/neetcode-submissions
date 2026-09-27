class MyLinkedList {
    ListNode head = null;
    ListNode tail = null;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        int i = 0;
        ListNode current = head;
        while (i < index && current != null) {
            ++i;
            current = current.next;
        }

        return current == null ? -1 : current.val;
    }
    
    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val, head);
        this.head = newHead;
        
        if (this.tail == null) {
            this.tail = head;
        }
    }
    
    public void addAtTail(int val) {
        if (this.tail == null) {
            addAtHead(val);
            return;
        }
        ListNode tail = new ListNode(val, null);
        this.tail.next = tail;
        this.tail = tail;
    }
    
    public void addAtIndex(int index, int val) {
        int i = 0;
        ListNode current = head;
        ListNode previous = null;

        if (index == 0) {
            this.addAtHead(val);
            return;
        }
        while (i < index - 1 && current != null) {
            ++i;
            current = current.next;
        }
        
        if (current == null) {
            return;
        }
        current.next = new ListNode(val, current.next);

        if (current.next.next == null) {
            this.tail = current.next;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) {
            return;
        }

        if (index == 0) {
            this.head = this.head.next;
            if (this.head == null) {
                this.tail = null;
            }
            return;
        }

        int i = 0;
        ListNode current = head;
        while (i < index - 1 && current != null) {
            ++i;
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;

        if (current.next == null) {
            this.tail = current;
        }
    }

    class ListNode {
        protected int val;
        protected ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */