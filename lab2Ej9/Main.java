import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su estatura"));

        Scanner s = new Scanner(System.in);

        String sexo = JOptionPane.showInputDialog("Ingrese su genero H / F");

        if (sexo.equals("F") || sexo.equals("f"))
        {
            altura = altura - 120;

        }else altura = altura - 110;

        JOptionPane.showMessageDialog(null,"Su peso ideal es: "+altura);


    }
}
