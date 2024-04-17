interface DetailInfo{
  void display();
  void count();
}

class Person implements DetailInfo{
  static int maxcount;
  String name;
  Person(String name){
    this.name=name;
  }

  public void display(){
    System.out.println("Name : "+name);
  }

  public void count(){
    maxcount=name.length();
  }

}

public class Q7_DetailInfo{
  public static void main(String[] args){
    Person p=new Person("Amaresh");
    p.display();
    p.count();
    System.out.println("No. of characters : "+Person.maxcount);
  }
}