import java.util.Scanner;

class calculate
{
    int a;
    int b;
    int result;

    public void perform()
    {
        result = a + b;
    }
}
public class World {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        calculate obj = new calculate();
        obj.a=a;
        obj.b=b;
        obj.perform();

        System.out.println(obj.result);

    }
}
