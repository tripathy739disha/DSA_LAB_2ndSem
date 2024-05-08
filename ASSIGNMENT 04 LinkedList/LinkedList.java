import java.util.Scanner;

class Node{
  protected int regd_no;
  protected float mark;
  protected Node next;
  /*Node(int regd_no,float mark,Node next)
  {
    this.regd_no=regd_no;
    this.mark=mark;
    this.next=next;
  }*/
}
/////////////////////////////////////////////////////////////////////////////////// 
public class LinkedList{
  
  public static void main(String[] args){
    Node head=null;
    head=create(head);
    search(head);
    //display(head);
  }
 /////////////////////////////////////////////////////////////////////////////////// 
public static Node create(Node start){
  
  Scanner sc=new Scanner(System.in);
  char ch;
  do{
  Node node=new Node();
  System.out.println("Enter the regd_no and mark");  
  node.regd_no=sc.nextInt();
  node.mark=sc.nextFloat();
 //Node new_node=new Node(regd_no,mark,null );
 /*new_node.regd_no=regd_no;
 new_node.mark=mark;
 new_node.next=null; */

  if(start==null){
    start=node;
  }
 else{
  Node temp=start;
  while(temp.next!=null){
    temp=temp.next;
  }
  temp.next=node;
 }
    System.out.println("Would you like to enter another node(y/n)");
    ch=sc.next().charAt(0);
  }while(ch=='y' ||ch=='Y');
  return start;
}
  /////////////////////////////////////////////////////////////////////////////////// 
public static void display(Node start){
  Node temp=start;
  while(temp!=null){
    System.out.println(temp.regd_no+"\t"+temp.mark);
    temp=temp.next;
  }
}
  /////////////////////////////////////////////////////////////////////////////////// 
public static void search(Node start){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter regd_no to search");
  int reg=sc.nextInt();
  int c=1;
  Node temp=start;
  while(temp!=null){
    if(temp.regd_no==reg){
      System.out.println(reg+" found at node "+c);
      return;
    }
    temp=temp.next;
    c++;
  }
  System.out.println(reg+" not found");
}
  /////////////////////////////////////////////////////////////////////////////////// 
public static Node InsBeg(Node start){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the regd_no and mark");  
  Node new_node=new Node();
  new_node.regd_no=sc.nextInt();
  new_node.mark=sc.nextFloat();
  
 
    new_node.next=start;
    start=new_node;
  return start;
}
  /////////////////////////////////////////////////////////////////////////////////// 
  public static Node InsEnd(Node start){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the regd_no and mark");
    Node new_node=new Node();
    new_node.regd_no=sc.nextInt();
    new_node.mark=sc.nextFloat();
    Node temp=start;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=new_node;
    return start;
  }
  /////////////////////////////////////////////////////////////////////////////////// 
  public static Node InsAny(Node start)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the regd_no and mark");
    Node new_node=new Node();
    new_node.regd_no=sc.nextInt();
    new_node.mark=sc.nextFloat();
    Node temp=start;
    System.out.println("Enter the position to insert the node");
    int pos=sc.nextInt();
    for(int i=1;i<=pos-1;i++)
      temp=temp.next;
    new_node.next=temp.next;
    temp.next=new_node;
    return start;
  }
  /////////////////////////////////////////////////////////////////////////////////// 
  public static Node DelBeg(Node start){
    Node temp=start;
    start=start.next;
    temp.next=null;
    return start;
  }
  /////////////////////////////////////////////////////////////////////////////////// 
  public static Node DelEnd(Node start){
    if(start.next==null || start==null) return null;
    Node temp=start;
    while(temp.next.next!=null){
      temp=temp.next;
    }
    temp.next=null;
    return start;
  }
  /////////////////////////////////////////////////////////////////////////////////// 
}