package MomentoEvaluativo2;

public class Main {
    public static void main(String[] args) {

        Control control = new Control();
        Bahia bahia = new Bahia();
        Buque buque = new Buque();

        System.out.println("--- PRUEBA DE SISTEMA DATA-BAY ---");

        // Se anexaran 5 contenedores al Buque, los cuales presentaran distintos
        // problemas o resultados en el codigo

        // 1. Contenedor ( Prioridad Alta y Peso adecuado )
        // Peso Acumulado: 500 kg
        Contenedor c1 = new Contenedor("C1", 500.0, 1);
        System.out.println("\n--- Registro y Rayos X ---");
        if (control.agregarManifiesto(c1)) {
            control.Ubicar(c1);
            bahia.agregarContenedor(c1); // Este contenedor se agregará a la fila de inspección debido a su alta
                                         // prioridad.
            Contenedor revision = bahia.procesamiento(); // El contenedor c1 será inspeccionado y procesado, ya que
                                                         // tiene prioridad alta.
            if (revision != null) {
                buque.cargar(revision); // El contenedor c1 se agregará al buque, ya que su peso es adecuado.
            }

            // 2. Contenedor ( Prioridad Baja y Peso adecuado )
            // Peso Acumulado: 1200 kg
            Contenedor c2 = new Contenedor("C2", 700.0, 2);
            System.out.println("\n--- Registro y Rayos X ---");
            if (control.agregarManifiesto(c2)) {
                control.Ubicar(c2);
                bahia.agregarContenedor(c2); // Este contenedor no se agregará a la fila de inspección debido a su baja
                                             // prioridad
                // Fallara por falta de estabilidad ( 700 > 500 )
                buque.cargar(c2);

            }
        }

        // 3. Contenedor ( Prioridad Alta y Peso Adecuado )
        // Peso Acumulado: 1700 kg
        Contenedor c3 = new Contenedor("C3", 500.0, 1);
        System.out.println("\n--- Estabilidad y Rayos X ---");
        if (control.agregarManifiesto(c3)) {
            control.Ubicar(c3);
            bahia.agregarContenedor(c3); // Este contenedor se agregará a la fila de inspección debido a su alta
                                         // prioridad.
            Contenedor revision = bahia.procesamiento(); // El contenedor c3 será inspeccionado y procesado, ya que
                                                         // tiene prioridad alta.
            if (revision != null) {
                buque.cargar(revision); // El contenedor c3 se agregará al buque, ya que su peso es adecuado.
            }
        }

        // 4. Error por Exceso de Peso ( Peso Excesivo )
        // Peso Acumulado: 2950 kg ( Excede el limite de peso permitido )
        Contenedor c4 = new Contenedor("C4", 1250.0, 2);
        System.out.println("\n--- ALERTA: Ha superado el limite del buque ( 2000 kg ) ---");
        control.agregarManifiesto(c4); // Este contenedor no se agregará al manifiesto debido a que excede el límite de
                                       // peso
                                       // permitido para el buque.

        // 5. Error por Exceso de Contenedores ( Limite de contenedores en el manifiesto
        // )
        // Si se intenta agregar mas de 10 contenedores saltara el error
        System.out.println(
                "\n--- ALERTA: Ha superado el limite de contenedores en el manifiesto ( 10 contenedores ) ---");
        buque.retirar(); // Se retirara el contenedor del fondo del buque, lo que permitirá agregar un
                         // nuevo contenedor al buque

        System.out.println("\n--- Fin de pruebas ---");
    }
}
