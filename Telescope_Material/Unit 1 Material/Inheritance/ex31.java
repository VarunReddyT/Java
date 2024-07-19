// a super class referece variable can point to an object of its sub class


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


class ex31
{
  public static void main(String args[])
   {
     student m1=new mcastudent(1,"shiva",77,88,99);
     m1.display();
   }
}

