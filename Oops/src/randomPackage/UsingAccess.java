package randomPackage;

public class UsingAccess {

    public static void main(String[] args) {
        RandomClass rc = new RandomClass();
        rc.randomMethod();
    }


}

class RandomClass{

    public void randomMethod(){
        System.out.println("from random method");
    }
}
