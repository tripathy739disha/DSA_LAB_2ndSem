class Phone
  {
    int area_code;
    int exchange;
    int number;
    void input() {
        input(212, 767, 8900); 
    }

    void input(int area_code , int exchange ,int number)
    {
      this.area_code=area_code;
      this.exchange=exchange;
      this.number=number;
    }
    void display()
    {
      System.out.println("("+area_code+") "+exchange+"-"+number);
    }
    public static void main(String[] args)
    {
      Phone my=new Phone();
      Phone your=new Phone();
      my.input();
      your.input(415,555,1234);

      System.out.println("My number is ");
      my.display();
      System.out.println("Your number is ");
      your.display();
    }
   
  }
