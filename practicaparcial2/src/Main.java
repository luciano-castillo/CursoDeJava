import java.util.Scanner;

public class Main {

    public static int longmax(int x,int y)
    {
        int z;
        if (x<y)
        {
            z=x;
        }else z=y;

        return z;
    }

    public static int [][] sumadematrices (int z,int [][]matriz1 ,int [][]matriz2)
    {

        int [][] matrizs = new int [z][z];

        for (int i=0;i<matrizs.length;i++)
        {
            for (int j=0;j<matrizs[0].length;j++)
            {
                matrizs[i][j]=matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizs;
    }


    public static int [][] multimatrices(int z,int [][]matriz1,int [][]matriz2)
    {
        int [][] matrizm = new int [z][z];

        for (int i=0;i<matrizm.length;i++)
        {
            for (int j=0;j<matrizm[0].length;j++)
            {
                matrizm[i][j]= matriz1[i][j] * matriz2[i][j];
            }
        }

        return matrizm;
    }

    public static void mostrarmatriz(int [][]matrizx)
    {
        for (int i=0;i<matrizx.length;i++)
        {
            for (int j=0;j<matrizx[0].length;j++)
            {
                System.out.print(matrizx[i][j]+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la dimecion de la 1ºmatriz");
        int x = s.nextInt();
        int [][] matriz1 = new int [x][x];

        System.out.println("Ingrese la dimencion de la 2ºmatriz");
        int y = s.nextInt();
        int [][] matriz2 = new int [y][y];

        longmax(x,y);

        for (int i=0;i< matriz1.length;i++)
        {
            for (int j=0;j< matriz1.length;j++)
            {
                System.out.println("Ingrese valores en la posicion: "+i+" "+j+" de la primera matriz");

                matriz1[i][j] = s.nextInt();
            }

        }

        for (int i=0;i< matriz2.length;i++)
        {
            for (int j=0;j< matriz2.length;j++)
            {
                System.out.println("Ingrese valores en la posicion: "+i+" "+j+" de la segunda matriz");

                matriz2[i][j] = s.nextInt();
            }

        }

        mostrarmatriz(sumadematrices(longmax(x,y),matriz1,matriz2));
        System.out.println();
        mostrarmatriz( multimatrices(longmax(x,y),matriz1,matriz2));
    }

}
