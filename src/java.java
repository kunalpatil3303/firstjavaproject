class teacher
{
    String name;
    String subject;

    teacher(String name,String subject)
    {
        this.name= name;
        this.subject= subject;
    }

    public void display()
    {
        System.out.println(this.name+""+this.subject"");
    }
}
class professor extends teacher
{
    String a;

    professor(String a,String name,String subject)
    {
        super(name,subject);
        this.a=a;

    }
}
class assistantprofessor extends teacher
{
    String b;

    assistantprofessor(String b,String name,String subject)
    {
        super(name,subject);
        this.b=b;

    }
}
class associateprofessor extends teacher
{
    String c;

    associateprofessor(String c,String name,String subject)
    {
        super(name,subject);
        this.c=c;

    }
}

public class java {
    public static void main(String[] args) {
        teacher t1 = new professor("123", "Kunal", "Dsa");
        t1.display();
        teacher t2 = new assistantprofessor("123", "Kunal", "Dsa");
        t2.display();
        teacher t3 = new associateprofessor("123", "Kunal", "Dsa");
        t3.display();
    }
}
