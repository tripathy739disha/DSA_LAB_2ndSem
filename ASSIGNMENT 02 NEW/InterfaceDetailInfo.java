interface DetailedInfo{
  display();
  count();
}
class Person{
  static int maxcount;
  String name;
  void display()
  {
    System.out.println("Name : "+name);
    
  }
}