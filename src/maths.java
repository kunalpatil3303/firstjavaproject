class phone
{
    double num1;
    double num2;
    double num3;
    double result;

    public void calculate(double num1, double num2)
    {
        result = num1 + num2;
        System.out.println(result);
    }
    public void calculator(double num1, double num2,double num3)
    {
        result = num1 + num2 + num3;
        System.out.println(result);
    }
    public void calculation(double num1, double num2)
    {
        result = num1 + num2;
        System.out.println(result);
    }
}



public class maths {
    public static void main(String[] args) {
        phone obj = new phone();

        obj.calculate(10,50);
        obj.calculator(10.5,20,5);
        obj.calculation(10,20);



    }
}
