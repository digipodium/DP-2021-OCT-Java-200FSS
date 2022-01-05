package mypackage;

public class HandlingException {
    public static void main(String[] args) {

        int a = 45;

        try {
            System.out.println(a / 0);
        }catch ( Exception e ){
            System.out.println(e.getMessage());
        }

        System.out.println("Last Line");

        myfunction();
//        anotherfunction();
    }

    private static void myfunction(){
        System.out.println("From my function");
    }

}

class AnotherClass{
    private static void anotherfunction(){
        System.out.println("From my function");
    }
}
