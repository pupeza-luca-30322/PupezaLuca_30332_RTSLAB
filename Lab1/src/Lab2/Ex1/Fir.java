package Lab2.Ex1;

public class Fir extends Thread {
    private int id;
    private ProgressModel model;
    private int processorLoad;

    Fir(int id, int priority, ProgressModel model, int procLoad) {
        this.id = id;
        this.model = model;
        this.processorLoad = procLoad;
        setPriority(priority);
    }

    public void run() {
        int c = 0;

        while (c < 1000) {
            for (int j = 0; j < this.processorLoad; j++) {
                j++;
                j--;
            }
            c++;
            try {
                model.setProgressValue(id, c);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
