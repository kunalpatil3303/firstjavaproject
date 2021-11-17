class athelete
{
    String name;

    public  athelete(String name)
    {
        this.name=name;
    }
    public void display()
    {
        System.out.println("name of athelete is " +name);
    }
}
class hockey extends athelete
{
    String goals;

     public  hockey(String name,String goals)
    {
        super(name);
        this.goals=goals;
    }
    public void display()
    {
        System.out.println("name of athelete is " +name+ "goals made are " +goals);
    }
}



public class Main {
    public static void main(String[] args) {
        athelete s1 = new athelete("kunal");
        s1.display();
        athelete s2 = new hockey("kunal","2");
        s2.display();



    }
}
