class ListNode
{
    int val;
    ListNode next;
    public ListNode(int val)
    {
        this(val,null);
    }
    public ListNode(int val,ListNode next)
    {
        this.val=val;
        this.next=next;
    }
   
}


class LinkedList {

   private ListNode head;
   private ListNode tail;

    public LinkedList() {
      this.head=new ListNode(-1);
      this.tail=this.head;

    }

    public int get(int index) {
        ListNode temp=head.next;
        // for(int i=0;i<index;i++)
        // {
        //     temp=temp.next;
        // }
        // return temp.val;
        int i=0;
        while(temp!=null)
        {
            if(i==index)
            {
                return temp.val;
            }
            i++;
            temp=temp.next;
        }
        return -1;
        
    }

    public void insertHead(int val) {
        ListNode newnode=new ListNode(val);
        // if(head.val==-1)
        // {
        //     head=newnode;
        // }
        // else
        // {
        //     newnode.next=head;
        //     head=newnode;
        // }
            newnode.next=head.next;
            head.next=newnode;
            if(newnode.next==null)
            {
                tail=newnode;
            }
        
    }

    public void insertTail(int val) {
        ListNode newnode=new ListNode(val);
        this.tail.next=newnode;
        tail=newnode;

    }

    public boolean remove(int index) {
       int i = 0;
        ListNode curr = this.head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        // Remove the node ahead of curr
        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;

    }
}
