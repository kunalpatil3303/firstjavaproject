class employee
{
    String name;

    public employee(String name)
    {
        this.name=name;
    }
    public void display()
    {
        System.out.println("Name of the employee is " +name);
        System.out.println("------------------------------------------------");
    }
}
class department extends employee
{
    String departmenthead;
    String departmentname;

    public department(String name,String departmenthead,String departmentname)
    {
        super(name);
        this.departmenthead=departmenthead;
        this.departmentname=departmentname;
    }

    public void display()
    {
        System.out.println("Name of employee is " +name+ "dept head is " +departmenthead+ "dept name is " +departmentname);
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
class salary extends employee
{
        String salaryenhancement;

        public salary (String name, String salaryenhancement)
        {
            super(name);
            this.salaryenhancement=salaryenhancement;
        }
        public void display()
        {
            System.out.println("Name of employee is " +name+ "salary of employee " +salaryenhancement);
        }

}


public class Office {
    public static void main(String[] args) {
        employee s1 = new employee("Kunal");
        s1.display();
        employee s2 = new department("Kunal ","Kishor ","Excise department ");
        s2.display();
        employee s3 = new salary("Kunal ","100000");
        s3.display();
    }
}
