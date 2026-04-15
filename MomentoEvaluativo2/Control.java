package MomentoEvaluativo2;

public class Control {
    // Atributos creados para el control del patio
    private int fil = 5;
    private int colu = 5;
    private Contenedor[][] patio;
    // Atributo creado para el control de contenedores en el patio junto con su peso
    // limite
    private Contenedor[] manifiesto = new Contenedor[10];
    private int contadorMan = 0;
    private double pesoActual = 0;
    private double pesoLimite = 2000.0; // Este es el limite de peso que soportara

    public Control() {
        this.patio = new Contenedor[fil][colu];
    }

    public boolean agregarManifiesto(Contenedor co) {
        if (contadorMan >= manifiesto.length) {
            System.out.println("\nERROR: Limite ya alcanzado ( 10 contenedores )");
            return false;
        }
        if (pesoActual + co.getPeso() > pesoLimite) {
            System.out.println(
                    "\nERROR: El contenedor: " + co.getId() + " excede el limite de peso permitido ( 2000.0 kg");
            return false;
        }
        manifiesto[contadorMan++] = co; // Agrega el contenedor al manifiesto y luego incrementa el contador
        pesoActual += co.getPeso(); // Actualiza el peso actual sumando el peso del nuevo contenedor
        System.out.println("\nContenedor " + co.getId() + " registrado en el manifiesto. Peso actual del buque: "
                + pesoActual + " kg");
        return true;
    }

    public void Ubicar(Contenedor co) {
        for (int i = 0; i < patio.length; i++) {
            for (int j = 0; j < patio[i].length; j++) {
                if (patio[i][j] == null) {
                    patio[i][j] = co;
                    System.out.println(
                            "\nContenedor " + co.getId() + " ubicado correctamente en la posicion: " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("\nALERTA: Puerto Saturado");
    }
}
