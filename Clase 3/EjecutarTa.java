public class EjecutarTa {

    public static void main(String[] args) {
        
        Clase[] n = new Clase[5];


        n[0] = new Clase(22641031, "1 A", "Enciso", 42);
        n[1] = new Clase(1126591267, "1 B", "Maryu", 30);
        n[2] = new Clase(10307740, "1 C", "Leyton", 15);
        n[3] = new Clase(906040, "2 A", "Yesid", 10);
        n[4] = new Clase(260489, "2 B", "Valero", 82);

        
       int suma = 0; 
       for (int i = 0; i < n.length; i++) {
         suma += n[i].getCantidad();
       }
       System.out.println("La cantidad total de estudiantes registrados en este colegio es: " + suma);
    }
}
