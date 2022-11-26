public class Main {
    public static void main(String[] args) throws InterruptedException {
        task1();
//        task2();
//        task3();
    }

    public static void task1() throws InterruptedException {
        Thread t1 = new Thread(new JoinToDo(),"t1");
        Thread t2 = new Thread(new JoinToDo(),"t2");
        Thread t3 = new Thread(new JoinToDo(),"t3");

        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();

    }

}