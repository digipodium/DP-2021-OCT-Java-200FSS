public class UsingInterfaces {

    public static void main(String[] args) {

        Circle mycircle = new Circle(234);
        float res = mycircle.area();

        System.out.println(res);



    }
}

interface Shape{

    abstract float area();

    abstract float perimeter();

}

interface MyInterface{

    abstract void myMethod();

}

class Circle implements Shape, MyInterface {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float)3.14 * radius * radius;
    }

    @Override
    public float perimeter() {
        return 2 * (float)3.14 * radius;
    }

    @Override
    public void myMethod() {

    }
}

