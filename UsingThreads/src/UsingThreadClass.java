public class UsingThreadClass {

    public static void main(String[] args) {

        MyTask tsk1 = new MyTask();
        MyTask tsk2 = new MyTask();
//        tsk.runTask();
//
//        tsk.runTask();

        tsk1.start();
        tsk2.start();

    }

}


class MyTask extends Thread{

    public void runTask(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public void run(){
        runTask();
    }

}