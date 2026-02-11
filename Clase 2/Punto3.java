public class Punto3 {
    
     public static void main(String[] args) throws Exception {
        // Creación de arreglo/array/vector
        int[] total = {10,20,15,8,12};
         
        System.out.println("Tamaño del arreglo es:\n" + total.length);

        for(int i = 0; i < total.length; i++){
            System.out.println("a[" + i + "] =" + total[i]);
        }

        int pares = 0;
        int impa = 0;

        for(int i = 0; i < total.length; i++){
            if (total[i] % 2 == 0) {
                pares = pares + total[i];
            } else{ 
                impa = impa + total[i];
            }
        System.out.println("\nLa suma de los numeros pares es:" + pares);
        System.out.println("\nSuma impares es: "+ impa);
                
            }
        }


}
