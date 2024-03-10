package Lab2.Ex1;

import java.util.Observable;

public class ProgressModel extends Observable {
    private int[] progressValues;

    public ProgressModel(int nrThreads) {
        progressValues = new int[nrThreads];
    }

    public void setProgressValue(int id, int val) throws InterruptedException {
        progressValues[id] = val;
        setChanged();
        notifyObservers(id);
        Thread.sleep(30);
    }

    public int getProgressValue(int id) {
        return progressValues[id];
    }
}
