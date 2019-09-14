
package cotizacion;


public class Cotizacion_Guarani extends Cotizacion_Padre{
    @Override
    public void Cotizacion(){
        System.out.print("Ingrese el monto a cotizar: ");
        monto = in.nextInt();
        dolar=(monto*0.00016);
        real=(monto*0.00065);
        System.out.println("Monto: "+monto+"Gs");
        System.out.println("Monto en dolar: "+dolar+"$");
        System.out.println("Monto en real: "+real+"R$");
        System.out.println("---------------------------");
                
    }
}
