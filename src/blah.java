class university
{
    String name;

    public university(String name)
    {
        this.name=name;
    }

    public void display()
    {
        System.out.println("Name of university is " +name);
        System.out.println("-------------------------------------");
    }
}
class colleges extends university
{
    String collegename;

    public colleges (String name, String collegename)
    {
        super(name);
        this.collegename=collegename;
    }

    public void display()
    {
        System.out.println("University name is " +name+ " college name is " +collegename);
        System.out.println("--------------------------------------------------------------");
    }
}
class subject extends university
{
    String subjectname;

    public subject (String name, String subjectname)
    {
        super(name);
        this.subjectname=subjectname;

    }

    public void display()
    {
        System.out.println("name of university is " +name+ " and name of the subject is " +subjectname);
    }

}





    public class blah {
    public static void main(String[] args) {
        university s1 = new university("MUMBAI");
        s1.display();
        university s2 = new colleges("MUMBAI","DBIT");
        s2.display();
        university s3 = new subject ("MUMBAI", "JAVA");
        s3.display();
    }
}
