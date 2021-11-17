class college
{
    String name;

    public college(String name)
    {
        this.name=name;
    }

    public void display()
    {
        System.out.println("name of user is " +name);
        System.out.println("-----------------------------------------------");
    }
}
class student extends college
{
    String professorname;

    public student(String name,String professorname)
    {
        super(name);
        this.professorname=professorname;
    }

    public void display()
    {
        System.out.println("name of the student is " +name+ "and professor name is " +professorname);
        System.out.println("---------------------------------------------------------");
    }
}
class marks extends college
{
    String subject;

    public marks(String name,String subject)
    {
        super(name);
        this.subject=subject;
    }
    public void display()
    {
        System.out.println("Name of the student is " +name+ "and his favourite subject is " +subject);
        System.out.println("-------------------------------------------------------------");
    }
}



public class sports {
    public static void main(String[] args) {
        college s1 = new college("Kunal");
        s1.display();
        college s2 = new student("Raj","Tayyabali Sayyad");
        s2.display();
        college s3 = new marks("Shreyash","Java");
        s3.display();
    }
}
