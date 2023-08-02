public class ThreadOrnegi2 implements Runnable {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOrnegi2());
        t1.start();
        System.out.println("Merhaba Thread");
    }

    @Override
    public void run() {
        try {
            // Burada uzun bir işlem yapılıyor.
            Thread.sleep(5 * 1000);
            System.out.println("Uzun işlem sonucu");
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }

}