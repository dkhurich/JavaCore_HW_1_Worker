public class Main {

    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener1 = System.out::println;
        Worker.OnTaskErrorListener listener2 = System.out::println;
        Worker worker = new Worker(listener1, listener2);
        worker.start();
    }
}
