import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner check= new Scanner(System.in);
        System.out.println("Welcome !!");
        System.out.println("calculator");
        System.out.print("Enter your first number: ");
        int x = check.nextInt();
        System.out.print("Enter your second number: ");
        int y = check.nextInt();
        System.out.println("options are");
        System.out.println("1.Addition");
        System.out.println("2.Product");
        System.out.println("3.Division");
        System.out.println("4.Substraction");
        System.out.println("Enter your option from 1 to 4");
        int a= check.nextInt();
        if (a==1)
        {
            int add=x+y;
            System.out.println("Addition is: "+add);
        }
        else if (a==2)
        {
            int product = x * y;
            System.out.println("Product is: " + product);
        }

        else if (a==3)
        {
            int division=x/y;
            System.out.println("Division is: "+division);
        }
        else if (a==4)
        {
            int sub=x-y;
            System.out.println("substraction is: "+sub);
        }
        else
        {
            System.out.println("Enter valid inputs");
        }
        System.out.println("Have a good day!!");

    }
}