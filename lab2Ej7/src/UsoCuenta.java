import java.util.Random;

public class UsoCuenta {

    public static void main(String[] args) {

        CuentaCorriente c1 = new CuentaCorriente("lucio",50000);
        CuentaCorriente c2 = new CuentaCorriente("meli",50000);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        c1.trasferir(c2,400);

        System.out.println("-------------------------------------");

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        System.out.println(c1.getNrocuenta());


    }
}
