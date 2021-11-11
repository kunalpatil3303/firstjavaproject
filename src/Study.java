class casio
{
    int num1;
    int num2;
    int num3;


    int result;

    public void perform(int num1, int num2)
    {
        result=num1 + num2;
        System.out.println(result);
    }
    public void add(int num1,int num2,int num3)
    {
        result=num1+num2+num3;
        System.out.println(result);
    }
}


public class Study {
    public static void main(String[] args) {
        casio obj = new casio();

        obj.perform(20,30);
        obj.add(20,30,40);



    }
}
