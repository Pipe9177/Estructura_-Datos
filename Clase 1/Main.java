public class Main{
    public static void main(String[] args) throws Exception {
        // Creación de arreglo/array/vector
        int[] a = {2, 6, 8, 1, 20, 40, 7, 3, 5};
        
        System.out.println("a[4]=" + a[4]); //20
        System.out.println("a[7]=" + a[7]); //3
        System.out.println("a[2]=" + a[2]); //8
        System.out.println("a[0]=" + a[0]); //2
        System.out.println("a[1]=" + a[1]); //6
        //System.out.println("a[9]=" + a[9]); //error bounds exception  
        
        System.out.println("Tamaño del arreglo es:\n" + a.length);

        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "] =" + a[i]);
        }

        int suma = 0; 
        for(int i = 0; i < a.length; i++){
            suma = suma + a[i];
            System.out.println("\nSuma de todos los elementos del arreglo es:" + suma);

        }


        int pares = 0;
        int impa = 0;

        for(int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) {
                pares = pares + a[i];
            } else{ 
                impa = impa + a[i];
            }
        System.out.println("\nLa suma de los numeros pares es:" + pares);
        System.out.println("\nSuma impares es: "+ impa);
                
            }
        }

}
       