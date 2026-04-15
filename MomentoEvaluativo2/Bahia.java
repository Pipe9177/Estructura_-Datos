package MomentoEvaluativo2;

import java.util.LinkedList;
import java.util.Queue;

public class Bahia {
    private Queue<Contenedor> inspeccion = new LinkedList<>();

    // Contenedores con Alta Prioridad (1) se añaden a la fila de inspeccion,
    // mientras que los de Prioridad Baja (2) no se procesan en esta etapa.
    public void agregarContenedor(Contenedor co) {
        if (co.getPrioridad() == 1) {
            inspeccion.add(co);
            System.out.println("\nContenedor " + co.getId() + " prioridad " + co.getPrioridad()
                    + " agregado a la fila de inspeccion.");
        } else {
            System.out.println("\nContenedor " + co.getId() + " prioridad " + co.getPrioridad()
                    + " no requiere inspeccion y no se agrega a la fila.");
        }
    }

    public Contenedor procesamiento() {
        if (!inspeccion.isEmpty()) { // Verificar que haya contenedores para procesar
            Contenedor co = inspeccion.poll(); // El primero en llegar es el primero en procesarse
            System.out.println("\nContenedor " + co.getId() + " ha sido inspeccionado y procesado.");
            return co;
        }
        return null; // Si no hay contenedores para procesar, se retorna null
    }
}
