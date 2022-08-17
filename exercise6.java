import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.printf("Enter value a:");
        int valueA = obj.nextInt();

        System.out.printf("Enter value b:");
        int valueB = obj.nextInt();

        System.out.println("a is "+valueA+" and b is "+valueB+"->");
        if (valueA == valueB | (valueA<0 && valueB>0) | (valueA>100 && valueB>100)){
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}
