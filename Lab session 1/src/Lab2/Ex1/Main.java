package Lab2.Ex1;

public class Main {
    private static final int noOfThreads = 10;
    private static final int processorLoad = 1000000;

    public static void main(String[] args) {
        ProgressModel model = new ProgressModel(noOfThreads);
        Window win = new Window(noOfThreads, model);

        for (int i = 0; i < noOfThreads; i++) {
            new Fir(i, i + 2, model, processorLoad).start();
        }
    }
}
