import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.printf("Enter value a:");
        int valueA = obj.nextInt();

        System.out.printf("Enter value b:");
        int valueB = obj.nextInt();

        System.out.println("is " + valueA + " equal to "+ valueB + "?");
        System.out.println(valueA == valueB);

        System.out.println("is " + valueA + " less than "+ valueB + "?");
        System.out.println(valueA < valueB);

        System.out.println("is " + valueA + " less or equal to "+ valueB + "?");
        System.out.println(valueA <= valueB);

        System.out.println("is " + valueA + " greater than "+ valueB + "?");
        System.out.println(valueA > valueB);

        System.out.println("is " + valueA + " greater or equal to "+ valueB + "?");
        System.out.println(valueA >= valueB);
    }
}
