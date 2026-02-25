public class Inventario {

    private Producto[] productos;
    private int cuentas;

    public Inventario(int Capacidad) {
        this.productos = new Producto[Capacidad]; // Definir el tamaño del arreglo de productos
        this.cuentas = 0; // Inicializar el contador de productos en 0
    }

    // Método para agregar un producto al inventario en la primera posicion
    // disponible
    public void agregarProducto(Producto p) {
        if (cuentas < productos.length) {
            productos[cuentas] = p; // Agregar el producto al arreglo
            cuentas++; // Incrementar el contador de productos
            System.out.println("Producto agregado: " + p.getNombre() + "\n"); // Imprimir mensaje de confirmación
            // Mostrando el producto agregado
        } else {
            System.out.println("Inventario lleno. No se pueden agregar más productos.\n");
        }

    }

    // Retorna el producto con el ID especifico, o null si no se encuentra
    public Producto buscarPorId(int id) {
        for (int i = 0; i < cuentas; i++) {
            if (productos[i] != null && productos[i].getId() == id) {
                return productos[i]; // Retorna el producto encontrado
            }
        }
        return null; // Retorna null si no se encuentra el producto
    }

    // Actualizar Stock de un producto
    public void actualizarStock(int id, int nuevoStock) {
        Producto producto = buscarPorId(id); // Buscar el producto por su ID
        if (producto != null) {
            producto.setStock(nuevoStock); // Actualizar el stock del producto
            System.out.println("Stock actualizado para el producto: " + producto.getNombre() + " correctamente \n"); // Imprimir
                                                                                                                     // mensaje
                                                                                                                     // de
                                                                                                                     // confirmación
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.\n"); // Imprimir mensaje de error si el
                                                                               // producto
                                                                               // no se encuentra
        }
    }

    // Informe del valor total calculando los productos ( precio * stock )
    public void generarInformeValorTotal() {
        double valorTotal = 0.0; // Variable para almacenar el valor total del inventario
        for (int i = 0; i < cuentas; i++) {
            if (productos[i] != null) {
                valorTotal += productos[i].getPrecio() * productos[i].getStock(); // Calcular el valor total sumando el
                                                                                  // precio por el stock de cada
                                                                                  // producto
            }
        }
        System.out.println("Valor total del inventario: $" + valorTotal + "\n"); // Imprimir el valor total del
                                                                                 // inventario
    }

    // Retorna los productos con stock menor a 5 unidades
    public Producto[] obtenerProductosAgotados() {
        int contadorAgotados = 0; // Contador para productos agotados
        for (int i = 0; i < cuentas; i++) {
            if (productos[i] != null && productos[i].getStock() < 5) {
                contadorAgotados++; // Incrementar el contador de productos agotados
            }
        }
        Producto[] productosAgotados = new Producto[contadorAgotados]; // Crear un arreglo con la cantidad de productos
                                                                       // agotados
        int Agotados = 0;
        for (int i = 0; i < cuentas; i++) {
            if (productos[i] != null && productos[i].getStock() < 5) {
                productosAgotados[Agotados] = productos[i]; // Agregar el producto al arreglo de productos agotados
                Agotados++; // Incrementar el índice del arreglo de productos agotados
            }
        }
        return productosAgotados; // Retornar el arreglo de productos agotados
    }

    // Metodo para ordenar los precios por forma descendente
    public void ordenarPorPrecioDescendente() {
        if (cuentas <= -1) return; //Aqui no hay productos que ordenar
            for (int i = 0; i < cuentas; i++) { 
                for (int j = 0; j < cuentas - i - 1; j++) {
                    if (productos[j] != null && productos[j + 1] != null && productos[j].getPrecio() < productos[j + 1].getPrecio()) {
                        // Si el precio del producto actual es menor que el precio del siguiente producto, intercambiarlos
                        // Intercambiar productos[j] y productos[j + 1]
                        Producto temp = productos[j]; // Guardar el producto actual en una variable temporal
                        productos[j] = productos[j + 1]; // Asignar el producto siguiente al producto actual
                        productos[j + 1] = temp; // Asignar el producto temporal (producto actual) al producto siguiente
                    }
                }
            }
        }

    public void mostrarInventario() {
        for (int i = 0; i < cuentas; i++) {
            if (productos[i] != null) {
                System.out.println(productos[i].toString());
            }
        }

    }

}

