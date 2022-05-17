package Operators;

public class OperatorTwo
{
    public static void main(String[] args)
    {

        int num1 = 6;
        float num2 = 0.5f;
        int num3 = 8;
        int num4 = 8;
        num1 +=num3;
        num2 *=num3;   // 29.36
        num3 -=num1;
        num4= ++ num1;
        System.out.println("num1="+ num1);
        System.out.println("num2="+num2);
        System.out.println("num3="+num3);
        System.out.println("num4="+num4);


    }
}
