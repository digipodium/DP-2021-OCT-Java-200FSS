public class UsingClasses {
    public static void main(String[] args) {

        Cat tom = new Cat();

        System.out.println(tom.name);
        tom.eat();


        Cat snowbell = new Cat();
        System.out.println(snowbell.name);
        System.out.println(snowbell.color);


    }
}

class Cat{

    int height = 10;
    String name = "Thomas";
    int age = 2;
    String color = "grey";

    public void eat(){
        System.out.println("Cat eats");
    }

    public void speak(){
        System.out.println("Cat speaks - 'meow' ");
    }

}
