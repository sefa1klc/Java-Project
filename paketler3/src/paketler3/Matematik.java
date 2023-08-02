
package paketler3;

public class Matematik implements Imatematik {

    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplamların sonucu: " + (a+b));
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Çıkarmaların sonucu: " + (a-b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölmenin sonucu: " + ((double)a/b));
    }

    @Override
    public void caprma(int a, int b) {
        System.out.println("çarpmanın sonucu: " + (a*b));
    }
    
}
