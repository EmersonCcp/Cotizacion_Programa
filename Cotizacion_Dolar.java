package cotizacion;

public class Cotizacion_Dolar extends Cotizacion_Padre {

    @Override
    public void Cotizacion() {
        System.out.print("Ingrese el monto a cotizar: ");
        monto = in.nextInt();
        guarani = (monto * 6329.269);
        real = (monto * 4.06);
        System.out.println("Monto: " + monto + "$");
        System.out.println("Monto en Guarani: " + guarani + "Gs");
        System.out.println("Monto en Real: " + real + "R$");
        System.out.println("-------------------------------");
    }
}
