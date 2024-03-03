class Arithmetic
  {
    public static void main(String[] args)
    {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);

      if( a+b==c || a==b-c || a*b==c )
        System.out.println("They are in correct arithmetic order");
      else
        System.out.println("They are not in correct arithmetic order");
    }
  }