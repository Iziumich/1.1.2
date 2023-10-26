public class Worker {
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("О нет! 33 ");
            } else callback.onDone("Task " + i + " is done");
        }
    }
}
