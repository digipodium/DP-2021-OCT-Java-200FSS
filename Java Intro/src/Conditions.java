public class Conditions {
    public static void main(String[] args) {

        int num = 25;

        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        int marks = 20;

        if(marks >= 90){
            System.out.println("Grade A");
        }else if(marks >= 70){
            System.out.println("Grade B");
        }else if(marks >= 30){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }

        int age = 20;



    }
}


//Create a program to check temperature :
//<20 - "The weather is cold"
//>20 - <30 "The Weather is nice"
//>30 - <50 "The Weather is hot"
//
//<0 - >50 "It doesn't seems much comfortable"