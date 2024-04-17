class Complex
  {
    int real;
    int imag;
    void setData(int r,int i)
    {
      real=r;
      imag=i;
    }
    void Display()
    {
      System.out.println(real+" + "+imag+"i");
    }
    public Complex add(Complex c1,Complex c2)
    {
      Complex c3=new Complex();
      c3.real=c1.real+c2.real;
      c3.imag=c1.imag+c2.imag;
      return c3;
    }
    
  }
class Run
  {
    public static void main(String[] args)
    {
      Complex c1=new Complex();
      Complex c2=new Complex();
      Complex c3=new Complex();
      c1.setData(2,3);
      c2.setData(4,5);
      c3=c3.add(c1,c2);
      c3.Display();
    }
  }