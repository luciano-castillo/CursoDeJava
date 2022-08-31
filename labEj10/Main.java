import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int nrorandom = (int) (Math.random()*100+1);

        int nrousuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));


        while(nrousuario != nrorandom)
       {
           if(nrousuario<nrorandom)
           {
            nrousuario = Integer.parseInt(JOptionPane.showInputDialog("El numero que ingreso es menor "));
           } else if (nrousuario>nrorandom)
           {
              nrousuario =Integer.parseInt( JOptionPane.showInputDialog("El numero ingresado es mayor"));
           }
          //(nrousuario == nrorandom) JOptionPane.showMessageDialog(null,"El numero es correcto");

       }
        if (nrousuario == nrorandom) JOptionPane.showMessageDialog(null,"El numero es correcto");
    }

}
