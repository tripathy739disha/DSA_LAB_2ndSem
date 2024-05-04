import java.util.Scanner;
class Node{
  protected int regd_no;
  protected float mark;
  protected Node next;
  Node(int regd_no,float mark,Node next)
  {
    this.regd_no=regd_no;
    this.mark=mark;
    this.next=next;
  }
}
public class LinkedList{
  
  public static void main(String[] args){
    Node head=new Node(0,0,null);
    create(head);
    create(head);
    create(head);
    create(head);
    display(head);
  }
  
public static void create(Node start){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the regd_no and mark");  
  int regd_no=sc.nextInt();
  float mark=sc.nextFloat();
 Node new_node=new Node(regd_no,mark,null );
 /*new_node.regd_no=regd_no;
 new_node.mark=mark;
 new_node.next=null; */

  if(start==null){
    start=new_node;
  }
 else{
  Node temp=start;
  while(temp.next!=null){
    temp=temp.next;
  }
  temp.next=new_node;
 }
}
public static void display(Node start){
  Node temp=start;
  while(temp!=null){
    System.out.println(temp.regd_no+"\t"+temp.mark);
    temp=temp.next;
  }
}

public static Node InsBeg(Node start){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the regd_no and mark");  
  int regd_no=sc.nextInt();
  float mark=sc.nextFloat();
  Node new_node=new Node(regd_no,mark,null );
 
    new_node.next=start;
    start=new_node;
  return start;
}
  public static Node InsEnd(Node start){
    Scanner sc=new Scanner(System.in)
    System.out.println("Enter the regd_no and mark");
    int regd_no=sc.nextInt();
    float mark=sc.nextFloat();
    Node new_node=new Node(regd_no,mark,null );
    Node temp=start;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=new_node;
    return start;
  }
  public static Node InsAny(Node start)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the regd_no and mark");
    int regd_no=sc.nextInt();
    float mark=sc.nextFloat();
    Node new_node=new Node(regd_no,mark,null );
    Node temp=start;
    System.out.println("Enter the position to insert the node");
    int pos=sc.nextInt();
    for(int i=1;i<=pos-1;i++)
      temp=temp.next;
    new_node.next=temp.next;
    temp.next=new_node;
    return start;
  }
  public static Node DelBeg(Node start){
    Node temp=start;
    start=start.next;
    temp.next=null;
    return start;
  }
  public static Node DelEnd(Node start){
    if(temp.next==null || temp==null) return null;
    Node temp=start;
    while(temp.next.next!=null){
      temp=temp.next;
    }
    temp.next=null;
    return start;
  }
}