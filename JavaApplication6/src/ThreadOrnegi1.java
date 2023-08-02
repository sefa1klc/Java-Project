public class ThreadOrnegi1 extends Thread {

    public static void main(String[] args) {
        ThreadOrnegi1 threadOrnegi = new ThreadOrnegi1();
        threadOrnegi.start();
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