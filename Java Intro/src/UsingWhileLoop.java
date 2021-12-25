import java.util.Scanner;

public class UsingWhileLoop {
    public static void main(String[] args) {

//        input --> 253456
//        output --> 654352

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(n);

        int rev = 0;
        while(n != 0){
            int r = n%10;
            rev = rev*10 + r;
            n = n/10;

        }

        System.out.println(rev);
    }
}


//input --> n=123
//1st loop --> rev = 3, n = 12
//2nd loop --> rev = 32, n = 1
//3rd loop --> rev = 321, n = 0
