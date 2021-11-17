class calculates
{
    int num1;
    int num2;
    int result;

    public calculates(int num1, int num2)
    {
        result = num1 + num2;

    }

  public void display()
  {
      System.out.println(result);
  }
}
class calc
{
    int num1;
    int num2;
    int num3;
    int result;

    public calc(int num1, int num2, int num3)
    {
        result = num1 + num2 + num3;
    }

    public void display()
    {
        System.out.println(result);
    }
}

public class operation {
    public static void main(String[] args) {
        calculates obj = new calculates(10,20);
        calc s1 = new calc(10,20,30);
        obj.display();
        s1.display();




    }
}
