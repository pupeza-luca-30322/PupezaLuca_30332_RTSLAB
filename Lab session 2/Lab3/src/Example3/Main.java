package Example3;

public class Main {

    static int sum = 0;
    public static void main(String[] args){

        JoinTestThread w1 = new JoinTestThread("Thread 1", 50000, null);
        JoinTestThread w2 = new JoinTestThread("Thread 2",20000, w1);
        w1.start();
        w2.start();


    }

}
