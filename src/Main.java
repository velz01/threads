//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SimpleThread thread2 = new SimpleThread();
        System.out.println(thread2.getName() + thread2.getState());
//        SimpleRunnable runnable = new SimpleRunnable();
//        Thread thread = new Thread(runnable);
//        Thread thread1 = new Thread(() -> System.out.println("hihihi from main " + Thread.currentThread().getName()));
//        thread.start();?
//        thread.join();
//        thread.interrupt();
        thread2.start();
        System.out.println(thread2.getName() + thread2.getState());
        thread2.join();
        System.out.println(thread2.getName() + thread2.getState());
        System.out.println(Thread.currentThread().getName());


    }
}