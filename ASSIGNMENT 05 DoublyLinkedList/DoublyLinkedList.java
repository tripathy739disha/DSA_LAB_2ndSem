class Node{
  int data;
  Node next;
  Node back;
  Node(int data){
    this.data=data;
  }
  Node(int data,Node next,Node back){
    this.data=data;
    this.next=next;
    this.back=back;
  }
}

public class DoublyLinkedList {
////////////////////////////////////////////////////////////////////
  public static void main(String[] args) {
    int[] arr= {34,37,74,73,52,29,55};
    Node head=convertArrToDll(arr);
    print(head);
    //head=deleteHead(head);
    //print(head);
    //head=deleteHead(head);

    //head=removeKthElement(head,1);
    //deleteNode(head.next.next.next.next.next.next);
    //head=insertBeforeTail(head,58);
    //head=insertBeforeKthElement(head,1,55);
    //insertBeforeNode(head.next.next,89);
    print(head);

  }
//////////////////////////////////////////////////////////////////////
  public static Node insertBeforeHead(Node head,int val) {
    Node newHead=new Node(val,head,null);
    head.back=newHead;
    return newHead;
  }
//////////////////////////////////////////////////////////////////////
  public static Node insertBeforeTail(Node head,int val) {
    if(head.next==null) return insertBeforeHead(head,val);

    Node tail=head;
    while(tail.next!=null) tail=tail.next;

    Node prev=tail.back;
    Node newNode=new Node(val,tail,prev);
    prev.next=tail.back=newNode;

    return head;
  }
//////////////////////////////////////////////////////////////////////
  public static Node insertBeforeKthElement(Node head,int k,int val) {
    if(k==1) return insertBeforeHead(head,val);

    Node mover=head;
    int cnt=0;
    while(mover!=null) {
      cnt++;
      if(cnt==k) break;
      mover=mover.next;
    }
    Node prev=mover.back;
    Node newNode=new Node(val,mover,prev);
    prev.next=newNode;
    mover.back=newNode;

    return head;
  }
//////////////////////////////////////////////////////////////////////
  public static void insertBeforeNode(Node node,int val) {
    //It is an insertion method I don't want to change the head
    Node prev=node.back;
    Node newNode =new Node(val,node,prev);
    prev.next=newNode;
    node.back=newNode;
  }
//////////////////////////////////////////////////////////////////////
  public static Node deleteHead(Node head) {
    if(head==null || head.next==null) {
      return null;
    }
    Node prev=head;
    head=head.next; //this is enough
    head.back=null;
    prev.next=null;

    return head;
  }
//////////////////////////////////////////////////////////////////////
  public static Node deleteTail(Node head) {
    if(head==null || head.next==null) return null;

    Node tail=head;
    while(tail.next!=null) tail=tail.next;

    Node newTail=tail.back;
    newTail.next=null;
    tail.back=null;

    return head;
  }
//////////////////////////////////////////////////////////////////////
  public static Node  removeKthElement(Node head,int k) {
    if(head==null) return null;
    int cnt=0;
    Node kNode=head;
    while(kNode!=null) {
      cnt++;
      if(cnt == k) break;
      kNode=kNode.next;
    }

    Node prev=kNode.back;
    Node front=kNode.next;

    if(prev==null && front==null) return null;
    else if(prev==null)  return deleteHead(head); 
    else if(front==null) return deleteTail(head);

    prev.next=front;
    front.back=prev;

    kNode.next=null;
    kNode.back=null;
    return head;
  }
//////////////////////////////////////////////////////////////////////
  public static void deleteNode(Node temp) {
    Node prev=temp.back;
    Node front=temp.next;

    if(front==null) {
      prev.next=null;
      temp.back=null;
      return;
    }
    prev.next=front;
    front.back=prev;
    temp.next=temp.back=null;
  }
//////////////////////////////////////////////////////////////////////
  public static Node convertArrToDll(int[] arr) {
    Node head=new Node(arr[0]);
    Node prev=head;

    for(int i=1;i<arr.length;i++) {
      Node temp=new Node(arr[i],null,prev);
      prev.next=temp;
      prev=prev.next;//or temp
    }
    return head;
  }
/////////////////////////////////////////////////////////////////////	
  public static void print(Node head) {
    while(head!=null)
    {
      System.out.print(head.data+" -> ");
      head=head.next;
    }
    System.out.println("End");
  }
/////////////////////////////////////////////////////////////////////
}
