public class MethodOverloading {

    public static void main(String[] args) {

        int sqr_area = calcArea(10);
        int rec_area = calcArea(30, 13);
        float circle_area = calcArea(43.65f);
        float x = 243.34f;


        System.out.println(sqr_area);
        System.out.println(rec_area);
        System.out.println(circle_area);
    }

    public static int calcArea(int length){

        return length * length;
    }

    public static int calcArea(int length, int breadth){

        return length * breadth;
    }

    public static float calcArea(float radius){

        return (float) 3.14 * radius * radius;
    }



}

//class Shape{
//
//    int length;
//
//    public int calcArea(){
//
//    }
//
//}