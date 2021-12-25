public class Homework {
    public static void main(String[] args) {

        int temp = -40;

        if(temp>0 && temp < 20){
            System.out.println("The weather is cold");
        }else if(temp >=20 && temp <= 30 ){
            System.out.println("The weather is nice");
        }else if(temp >=30 && temp <= 50){
            System.out.println("The weather is hot");
        }else{
            System.out.println("It doesn't seems much comfortable");
        }

    }
}
