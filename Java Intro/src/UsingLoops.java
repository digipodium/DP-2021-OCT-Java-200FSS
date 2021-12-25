public class UsingLoops {
    public static void main(String[] args) {


        for(int i=0;i<10;i++){
            System.out.println("Loop running");
            System.out.println(i);
        }


        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        for(int i=10;i>2;i--){
            System.out.println(i);
        }


        int a = 1;
        while(a < 5){
            System.out.println("loop running...");
            a++;
        }


        Boolean b = true;
        int x = 15;
        do{
            System.out.println("Do while loop example");
            System.out.println(x);
            x+=5;
        }while(x < 20);
    }
}

// Write a program find all the numbers divisible by 7 in a range of 100 - 300.