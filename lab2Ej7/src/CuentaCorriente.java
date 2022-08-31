import java.util.Random;

public class CuentaCorriente {

    private String nombre;
    private double saldo;
    private long nrocuenta;


    public CuentaCorriente (String nombre,double saldo)
    {
        this.nombre = nombre;
        this.saldo = saldo;

        double aux = Math.random()*999999;
        this.nrocuenta = (long) aux;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void IngresoSaldo(double importe)
    {
        this.saldo = saldo + importe;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNrocuenta() {
        return nrocuenta;
    }

    public void trasferir(CuentaCorriente c, double importe)
    {
        this.saldo = saldo - importe;
        c.IngresoSaldo(importe);
    }

}
