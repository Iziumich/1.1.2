public class Main {
    public static void main(String[] args) {
        OnTaskErrorListener listener1 = System.out::println;
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener, listener1);
        worker.start();
    }
}
