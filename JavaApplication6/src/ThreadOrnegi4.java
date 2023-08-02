    public class ThreadOrnegi4 implements Runnable {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOrnegi4(2000));
        Thread t2 = new Thread(new ThreadOrnegi4(2000));

        t1.start();
        t2.start();
    }

    int sure;

    public ThreadOrnegi4(int sure) {
        this.sure = sure;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.sure);
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }

    }

}