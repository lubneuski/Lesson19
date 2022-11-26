public class JoinToDo extends Thread{
    public void run(){
        System.out.println("Выполняется "+Thread.currentThread().getName());
        System.out.println("Завершил "+Thread.currentThread().getName());
    }
}