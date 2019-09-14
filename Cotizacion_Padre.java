package cotizacion;

import java.util.Scanner;

public abstract class Cotizacion_Padre {

    protected double monto, guarani, dolar;
    protected double real;
    Scanner in = new Scanner(System.in);

    public void Opciones() {
        int rep=0;
        int seleccion = 0;
        int sw = 0;
        do {
           rep=0;
            System.out.println("Seleccione el tipo de dinero");
            System.out.println("1. Dolar");
            System.out.println("2. Real");
            System.out.println("3. Guarani");
            System.out.println("4. Salir");
            seleccion = in.nextInt();
            if (seleccion < 1 || seleccion > 4) {
                System.out.println("----------------");
                System.out.println("Opcion Invalida");
                System.out.println("----------------");
            }

            if (seleccion == 1) {
                Cotizacion_Padre mensajero = new Cotizacion_Dolar();
                mensajero.Cotizacion();
            } else if (seleccion == 2) {
                Cotizacion_Padre mensajero = new Cotizacion_Real();
                mensajero.Cotizacion();
            } else if (seleccion == 3) {
                Cotizacion_Padre mensajero=new Cotizacion_Guarani();
                mensajero.Cotizacion();
            } else if (seleccion == 4) {
                sw = 1;
                break;
            }
            while(rep<1||rep>2){
                System.out.println("------------------------------------------");
               System.out.println("Desea realizar otra operacion? \n1.Si  2.No");
            rep=in.nextInt();
            if(rep==2){
                sw=1;
            } 
            }
            

        } while (sw != 1);

    }

    public abstract void Cotizacion();
}
