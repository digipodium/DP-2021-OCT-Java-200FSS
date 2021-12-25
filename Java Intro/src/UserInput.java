import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        int num1, num2;
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number 1 :");
        num1 = sc.nextInt();

        System.out.print("enter number 2 :");
        num2 = sc.nextInt();

        System.out.println(num1);
        System.out.println(num2);

        System.out.print("Enter your name : ");
        name = sc.next();

        System.out.println(name);
    }
}
