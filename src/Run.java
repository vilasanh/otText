import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        try {
            Scanner  input = new Scanner(System.in);
            System.out.println("Please insert number : ");
            String a =  input.next();
            System.out.println(Billion.getBillion(a));

        }catch (Exception e){
            System.out.println("Please insert positive integer number only!");

        }





    }
}
