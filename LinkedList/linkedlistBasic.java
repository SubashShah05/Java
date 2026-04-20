package LinkedList;

public class LinkedList {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public  static Node tail;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode =new Node(data);
        if(head ==null){
            head=tail=newNode;
            return;
        }

        //step2- newNode next =head
        newNode.next =head; //link

        //step3-head=newNode
        head=newNode;
    }

    public void addLast(int data){
        Node newNode =new Node(data);
        if(head == null){
            head=tail=newNode;
        }
        tail.next =newNode;
        tail=newNode;
    }

    public void print(){//o(n)
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null" );
    }

    public void add(int idx,int data){
        if(idx ==0){
            addFirst(data);
            return;
        }
        Node newNOde = new Node(data);
        Node temp= head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }

        //i=idx-1;temp->prev
        newNOde.next=temp.next;
        temp.next=newNOde;

    }


    public int itrSearch(int key){//o(n)
        Node temp=head;
        int i=0;

        while(temp !=null){
            if(temp.data == key){ //key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1; //key not found
    }


    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }

        if(head.data ==key  ){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx +1;
    }

    public int recursionSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
       // ll.print();
        ll.addFirst(2);
       // ll.print();
        ll.addFirst(1);
       // ll.print();
        ll.addLast(3 );
       // ll.print();
        ll.addLast(4);
        ll.add(2,9);
         ll.print();

        System.out.println(ll.itrSearch(3) );
        System.out.println(ll.itrSearch(10));


    }
}
