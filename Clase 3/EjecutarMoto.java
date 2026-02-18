public class EjecutarMoto {

    public static void main(String[] args) {

        Moto[] m = new Moto[8];

        m[0] = new Moto(2026, "AKT", "Negra", 125, 1250.0);
        m[1] = new Moto(2025, "Kawasaki", "Verde", 400.0, 1250.0);
        m[2] = new Moto(2026, "Honda", "Rojo", 125, 1550.0);
        m[3] = new Moto(2027, "C90", "Dorado", 125, 1050.0);
        m[4] = new Moto(2026, "AKT", "Negra", 125, 3000.0);
        m[5] = new Moto(2025, "Kawasaki", "Verde", 400.0, 350.0);
        m[6] = new Moto(2026, "Honda", "Rojo", 125, 2250.0);
        m[7] = new Moto(2029, "C90", "Dorado", 125, 250.0);

        //Operaciones con los objetos de arreglo


        //Obtener el promedio del modelo

        int suma = 0;

        for (int i = 0; i < m.length; i++) {
            suma += m[i].getModelo();
        }

        System.out.println("El promedio de los modelos de las motos del arreglo es: " + (suma / m.length) + "\n");


        //Motos con 2000 dolares

        String cad = "\n";

        for (int i = 0; i < m.length; i++) {
            if (m[i].getPrecio() <= 2000.0) {
                cad += "-" + m[i].getMarca() + " " + m[i].getPrecio() + " \n";
            }
        }

        System.out.println("Las motos que te podes comprar gilipollas con 2000.0 US son: " + cad);

    }

}
