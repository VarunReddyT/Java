/* advantage of inheritance :
  create a class(super class) with some attributes that are common to a set
  of classes then use that class to create any number of more specific
  sub classes */



class student
{
  int sno;
  String sname;

  student(int sno,String sname)
    {
     this.sno=sno;
     this.sname=sname;
    }
  void display()
    {
      System.out.println(sno);
      System.out.println(sname);
    }
}


class mcastudent extends student
{
  int ds,co,java;

  mcastudent(int sno,String sname,int ds,int co, int java)
  {
    super(sno,sname);
    this.ds=ds;
    this.co=co;
    this.java=java;
  }
  void display()
  {
    super.display();
    System.out.println(ds);
    System.out.println(java);
    System.out.println(co);
  }

}

class mbastudent extends student
{
  int hr,fn,mkt;

  mbastudent(int sno,String sname,int hr,int fn, int mkt)
  {
    super(sno,sname);
    this.hr=hr;
    this.fn=fn;
    this.mkt=mkt;
  }
  void display()
  {
    super.display();
    System.out.println(hr);
    System.out.println(fn);
    System.out.println(mkt);
  }

}

class ex32
{
  public static void main(String args[])
   {
     mcastudent m1=new mcastudent(1,"shiva",77,88,99);
     m1.display();

     System.out.println();

     mbastudent m2=new mbastudent(2,"kiran",88,66,99);
     m2.display();

   }
}

