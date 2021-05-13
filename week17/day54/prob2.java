
    public static class Node{
        int val=0;
        Node next=null;
        Node(int a){
            this.val=a;
            this.next=null;
        }
    }
    public static Node head=null;

    public static void insert_node(int pos, int val) {
        // @params position, integer
        // @params value, integer
        if(head==null){
            head=new Node(val);
        }
        else if(pos==1){
            Node temp=head;
            head=new Node(val);
            head.next=temp;
        }
        else{
            int idx=2;
            Node curr=head;
            while(idx<pos){
                curr=curr.next;
                idx++;
            }
            Node temp=curr.next;
            curr.next=new Node(val);
            curr=curr.next;
            curr.next=temp;
        }
    }

    public static void delete_node(int pos) {
        // @params position, integer
        if(head==null)
        return;
        else if(pos==1)
        head=head.next;
        else{
            int idx=2;
            Node curr=head;
            while(idx<pos){
                curr=curr.next;
                idx++;
            }
            curr.next=curr.next.next;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" ");
        }
    }

