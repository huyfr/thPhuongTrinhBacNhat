import java.util.Scanner;

public class LinearEquation
{
    public static void main(String[] args)
    {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a=a*x+b=0', please enter constants:");

        double a, b, result;

        Scanner number=new Scanner(System.in);

        System.out.print("a: "+"\n");
        a=number.nextDouble();

        System.out.print("b: "+"\n");
        b=number.nextDouble();

        System.out.println("Line equation: "+a+"x+"+b+"=0");

        if (a!=0)
        {
            result=(-b/a);
            System.out.print("The solution is: %f! "+result);
        }
        else
        {
            if (b==0)
            {
                System.out.print("The solution is all x!");
            }
            else
            {

                System.out.print("No solution!");
            }
        }
    }
}
