class athelete
{
    String name;

    public athelete(String name)
    {
        this.name=name;
    }

    public void display()
    {
        System.out.println("name of athelete is " +name);
    }
}
class event extends athelete
{
    String game;

    public event(String name,String game)
    {
        super(name);
        this.game=game;
    }
    public void display()
    {
        System.out.println("name of athelete is " +name+ "and event praticipated is " +game);
    }
}
class hockeyplayer extends athelete
{
        String goals;

        public hockeyplayer(String name,String goals)
        {
            super(name);
            this.goals=goals;
        }

        public void display()
        {
            System.out.println("name of athelete is " +name+ "goals made by him are "+goals);
        }
}

public class done {
    public static void main(String[] args) {
       athelete s1 = new athelete("kunal");
       s1.display();
        athelete s2 = new event("raj","running 100m");
        s2.display();
        athelete s3 = new hockeyplayer("shreyash","3");
        s3.display();



    }
}
