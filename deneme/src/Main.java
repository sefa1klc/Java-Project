import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kare[] kares = new Kare[10];
        Dikdortgen[] dikdortgens = new Dikdortgen[10];
        Yamuk[] yamuks = new Yamuk[10];
        Paralelkenar[] paralelkenars = new Paralelkenar[10];

        System.out.println("Kare, Dikdörtgen, Yamuk ve Paralelkenar arasından tanımlamak istediğiniz şekli yazınız: ");
        String input = scanner.nextLine();

        switch (input) {
            case "Kare": {
                kares[0] = new Kare(new Nokta(1, 5), new Nokta(5, 5), new Nokta(5, 1), new Nokta(1, 1));
                System.out.println("Kare oluşturuldu: "+ kares[0]);
                System.out.println("Alan: " + kares[0].alan());
            }
            case "Dikdörtgen" : {
                dikdortgens[0] = new Dikdortgen(new Nokta(1, 6), new Nokta(8, 6), new Nokta(8, 1), new Nokta(1, 1));
                System.out.println("Dikdörtgen oluşturuldu: " + dikdortgens[0]);
                System.out.println("Alan: " + dikdortgens[0].alan());
            }
            case "Yamuk" : {
                yamuks[0] = new Yamuk(new Nokta(3, 6), new Nokta(6, 6), new Nokta(7, 2), new Nokta(1, 2));
                System.out.println("Yamuk oluşturuldu: " + yamuks[0]);
                System.out.println("Alan: " + yamuks[0].alan());
            }
            case "Paralelkenar" : {
                paralelkenars[0] = new Paralelkenar(new Nokta(4, 8), new Nokta(10, 8), new Nokta(8, 3), new Nokta(2, 3));
                System.out.println("Paralelkenar oluşturuldu: " + paralelkenars[0]);
                System.out.println("Alan: " + paralelkenars[0].alan());
            }
            default : System.out.println("Geçersiz bir şekil girdiniz!");
        }
    }
}

class Nokta {
    double x,y;

    public Nokta(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double uzaklik(Nokta n){
        return Math.sqrt(Math.pow((this.getX() - n.getX()),2) + Math.pow((this.getY() - n.getY()),2));
    }
}

class Dortgen {
    Nokta n1,n2,n3,n4;

    public Dortgen(Nokta n1, Nokta n2, Nokta n3, Nokta n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }
    public double alan(){
        return n1.uzaklik(n2) * n1.uzaklik(n4);
    }
}

class Kare extends Dortgen{
    public Kare(Nokta n1, Nokta n2, Nokta n3, Nokta n4) {
        super(n1, n2, n3, n4);
    }

    @Override
    public double alan() {
        return super.alan();
    }
}

class Dikdortgen extends Dortgen{
    public Dikdortgen(Nokta n1, Nokta n2, Nokta n3, Nokta n4) {
        super(n1, n2, n3, n4);
    }

    @Override
    public double alan() {
        return super.alan();
    }
}

class Yamuk extends Dortgen{
    public Yamuk(Nokta n1, Nokta n2, Nokta n3, Nokta n4) {
        super(n1, n2, n3, n4);
    }

    @Override
    public double alan() {
        return ((n2.uzaklik(n3) + n1.uzaklik(n4)) * 5 * 0.5); // ((n2.uzaklik(n3) + n1.uzaklik(n4)) * yukseklik * 0.5)
    }
}

class Paralelkenar extends Dortgen{
    public Paralelkenar(Nokta n1, Nokta n2, Nokta n3, Nokta n4) {
        super(n1, n2, n3, n4);
    }

    @Override
    public double alan() {
        return (n2.uzaklik(n3) * 5); // (n2.uzaklik(n3) * yukseklik)
    }
}