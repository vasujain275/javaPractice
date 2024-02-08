import java.util.Scanner;

public class BasicTemprature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temprature Outside: ");
        double temp = input.nextDouble();
        if(temp>=50){
            System.out.println("You are fried bro!");
        }
        else if(temp>40 && temp<50){
            System.out.println("That like a Normal HOT Day in Delhi");
        }
        else if(temp<40 && temp>20){
            System.out.println("Normal Temprature");
        }
        else if(temp<20 && temp>0){
            System.out.println("It cold Outside");
        }
        else{
            System.out.println("You are Froozen bro!");
        }
    }
}
