
import java.util.Scanner;
public class InputPrac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, Enter your Name: ");
        String name = input.nextLine();
        System.out.print("Hello "+name+", Welcome");
        input.close();
    }
}
