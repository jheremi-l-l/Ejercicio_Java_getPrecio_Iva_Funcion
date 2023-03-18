import java.util.Scanner;

public class Main {
    //crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static void main(String[] args) {


        Scanner lectura = new Scanner(System.in);
        double precio1, Iva;
        System.out.println("Introduce precio: ");
        precio1 = lectura.nextDouble();

        Iva = ObtnerPrecioIva(precio1);

        System.out.println("El precio sin IVA es: " +precio1);
        System.out.println("El precio con IVA es: " +(precio1+Iva));
    }
    //Funcion Obtner precio con IVA
    public static double ObtnerPrecioIva(double p) {
        double IVA;
        IVA = p * 0.21;
        return IVA;
    }


}

