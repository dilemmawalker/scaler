
    public static class Node{
        int val=0;
        Node next=null;
        Node(int a){
            this.val=a;
            this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    public static int size=0;

    public static void insert_node(int pos, int val) {
        // @params position, integer
        // @params value, integer
        if(head==null){
            head=new Node(val);
            tail=head;
        }
        else if(pos==1){
            Node temp=head;
            head=new Node(val);
            head.next=temp;
        }
        else if(pos==size+1){
            tail.next=new Node(val);
            tail=tail.next;
        }
        else if(pos<1 || pos>size+1)
        return ;
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
        size++;
    }

    public static void delete_node(int pos) {
        // @params position, integer
        if(head==null)
        return;
        else if(pos==1)
        head=head.next;
        else if(pos>size || pos<1)
        return;
        else{
            int idx=2;
            Node curr=head;
            while(idx<pos){
                curr=curr.next;
                idx++;
            }
            curr.next=curr.next.next;
        }
        size--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node curr=head;
        while(curr!=null && curr.next!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        System.out.print(curr.val);
    }

