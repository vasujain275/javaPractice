import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){
        Random rn = new Random();
        int x = rn.nextInt(6);
        System.out.println(x);
    }
}
