public class UsingContructors {
    public static void main(String[] args) {

        Cat2 tom = new Cat2( 10, "Thomas", 2, "grey" );
        Cat2 snowbell = new Cat2( 15, "Snowbell", 3, "white" );

        System.out.println(tom.name);
        System.out.println(snowbell.name);

        tom.eat();
        snowbell.eat();
    }
}

class Cat2{

    int height;
    String name;
    int age;
    String color;

//    the constructor
    public Cat2(int height, String name, int age, String color){
        this.height = height;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat(){

        System.out.println(this.name +" eats");
    }

    public void speak(){
        System.out.println("Cat speaks - 'meow' ");
    }



}