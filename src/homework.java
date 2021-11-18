class tution
{
    String name;

    public tution(String name)
    {
        this.name=name;
    }

    public void display()
    {
        System.out.println("Name of tution is " +name);
        System.out.println("--------------------------");
    }
}
class children extends tution
{
    String childname;

    public children(String name,String childname)
    {
        super(name);
        this.childname=childname;
    }

    public void display()
    {
        System.out.println("name of tution is " +name+ " and childname is " +childname);
        System.out.println("------------------------------------------------------------");
    }
}
class score extends tution
{
    String marks;

     public score (String name,String marks)
     {
         super(name);
         this.marks=marks;
     }

     public void display()
     {
         System.out.println("name of tution is " +name+ " and average marks scored by students are " +marks);
     }

}



public class homework {
    public static void main(String[] args) {
        tution s1 = new tution("MAHESH TUTORIALS");
        s1.display();
        tution s2 = new children("MAHESH TUTORIALS","Kunal Kishor Patil");
        s2.display();
        tution s3 = new score("MAHESH TUTORIALS","18");
        s3.display();
    }
}
