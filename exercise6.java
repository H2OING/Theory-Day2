import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.printf("Enter boolean value: ");
        boolean valueA = obj.nextBoolean();


        if (valueA == true){
            System.out.print("Opposite of \"true\" is \"false\"");
        }
        else{
            System.out.print("Opposite of \"false\" is \"true\"");
        }
    }
}
