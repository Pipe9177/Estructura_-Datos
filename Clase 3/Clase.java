public class Clase {

    private double id;
    private String name;
    private String profe;
    private int cantidad;


    public Clase(double id, String name, String profe, int cantidad) {
        this.id = id;
        this.name = name;
        this.profe = profe;
        this.cantidad = cantidad;
    }


    public double getId() {
        return id;
    }


    public void setId(double id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getProfe() {
        return profe;
    }


    public void setProfe(String profe) {
        this.profe = profe;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




    @Override
    public String toString() {
        return "Taller [id =" + id + ", Curso =" + name + ", profe =" + profe + ", la cantidad de estudiantes en el curso es =" + cantidad + "]";
    }

    
    
    
}
