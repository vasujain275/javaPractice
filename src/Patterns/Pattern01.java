package Patterns;
import java.util.Scanner;
public class Pattern01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Height of Pattern: ");
        int h = input.nextInt();
        System.out.println("Enter Width of Pattern: ");
        int w = input.nextInt();
        System.out.println("Enter the Symbol to use: ");
        String a = input.next();

        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                System.out.print(a);
            }
            System.out.print("\n");
        }
    }
}