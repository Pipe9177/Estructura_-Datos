public class EjecutarInv {

    public static void main(String[] args) {
        // 1. Instanciar el inventario con una capacidad de 5 productos
        Inventario miInventario = new Inventario(5);

        // 2. Crear algunos productos de prueba
        // Nota: El último tiene stock < 5 para probar "obtenerProductosAgotados"
        Producto p1 = new Producto(101, "Laptop Gamer", 1500.00, 10);
        Producto p2 = new Producto(102, "Mouse Óptico", 25.50, 20);
        Producto p3 = new Producto(103, "Monitor 4K", 400.00, 3); // Agotado
        Producto p4 = new Producto(104, "Teclado Mecánico", 85.00, 2); // Agotado

        // 3. Agregar productos al inventario
        System.out.println("--- Cargando Inventario ---");
        miInventario.agregarProducto(p1);
        miInventario.agregarProducto(p2);
        miInventario.agregarProducto(p3);
        miInventario.agregarProducto(p4);

        // 4. Probar búsqueda por ID
        System.out.println("\n--- Prueba de Búsqueda ---");
        Producto encontrado = miInventario.buscarPorId(102);
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 5. Probar Informe de Valor Total
        double valorTotal = miInventario.generarInformeValorTotal();
        System.out.println("\nValor total del inventario: $" + valorTotal);

        // 6. Probar Reto: Ordenamiento por precio (Burbuja Descendente)
        System.out.println("\n--- Inventario antes de ordenar (Precios) ---");
        // (Asumiendo que imprimes la lista)
        
        miInventario.ordenarPorPrecioDescendente();
        
        System.out.println("--- Inventario ordenado por precio (Mayor a Menor) ---");
        // Aquí podrías imprimir para verificar el orden: 1500.0 -> 400.0 -> 85.0 -> 25.5

        // 7. Probar Productos Agotados (< 5 unidades)
        System.out.println("\n--- Productos Agotados (Stock < 5) ---");
        Producto[] agotados = miInventario.obtenerProductosAgotados();
        for (Producto p : agotados) {
            if (p != null) {
                System.out.println("- " + p.getNombre() + " (Stock actual: " + p.getCantidadStock() + ")");
            }
        }
    }
}

