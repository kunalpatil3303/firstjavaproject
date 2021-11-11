class casino
{
    double num1;
    double num2;
    double num3;
    double result;

    public void prepare( double num1, double num2)
    {
        result=  num1 +num2;
        System.out.println(result);
    }
    public void person( double num1, double num2 , double num3)
    {
        result = num1 + num2 + num3;
        System.out.println(result);
    }
    public void persons(double num1, double num2)
    {
        result= num1 + num2;
        System.out.println(result);
    }
}







public class Practice {
    public static void main(String[] args) {
        casino obj = new casino();

        obj.prepare(10,20);
        obj.person(10,20,30);
        obj.persons(10.5,20.5);


    }
}
