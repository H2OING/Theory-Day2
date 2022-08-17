import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.printf("Enter a1:");
        Boolean valueA = obj.nextBoolean();

        System.out.printf("Enter b2");
        Boolean valueB = obj.nextBoolean();

        System.out.println("Is " + valueA + " and " + valueB + " equal?");
        System.out.println(valueA == valueB);
    }
}
