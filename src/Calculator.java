import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Welcome to VJ Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        double a =input.nextInt();
        System.out.println("Enter the 2st Number: ");
        double b =input.nextInt();
        System.out.println(
                """
                What Operation you want to perform:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                """
        );
        int opt = input.nextInt();
        switch (opt){
            case 1:
                System.out.println("Addition of two numbers is "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of two numbers is "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is "+(a%b));
            case 4:
                System.out.println("Division of two numbers is "+(a/b));
            default:
                System.out.println("Invaild Option");
        }
    }
}
