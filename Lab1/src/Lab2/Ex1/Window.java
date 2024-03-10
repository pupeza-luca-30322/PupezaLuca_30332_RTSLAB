package Lab2.Ex1;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class Window extends JFrame implements Observer {
    private ArrayList<JProgressBar> bars;
    private ProgressModel model;

    public Window(int nrThreads, ProgressModel model) {
        this.model = model;
        this.model.addObserver(this);

        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        init(nrThreads);

        setVisible(true);
    }

    private void init(int n) {
        bars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            JProgressBar pb = new JProgressBar();
            pb.setMaximum(1000);
            pb.setBounds(50, (i + 1) * 30, 350, 20);
            add(pb);
            bars.add(pb);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ProgressModel && arg instanceof Integer) {
            int id = (Integer) arg;
            int val = model.getProgressValue(id);
            bars.get(id).setValue(val);
        }
    }
}
