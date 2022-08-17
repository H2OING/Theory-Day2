import java.util.Scanner;

public class exercise3and4 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.printf("Enter value: ");
        int valueA = obj.nextInt();

        System.out.print("Value is even: ");
        if (valueA % 2 == 0){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}
