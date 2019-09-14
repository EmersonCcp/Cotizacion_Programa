package cotizacion;

public class Cotizacion_Real extends Cotizacion_Padre {

    @Override
    public void Cotizacion() {
        System.out.print("Ingrese el monto a cotizar: ");
        monto = in.nextInt();
        guarani = (monto * 1563);
        dolar = (monto * 0.246);
        System.out.println("Monto: " + monto + "R$");
        System.out.println("Monto en Guarani: " + guarani + "Gs");
        System.out.println("Monto en Dolar: " + dolar + "$");
        System.out.println("-------------------------------");

    }
}
