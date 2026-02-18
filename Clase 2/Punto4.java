public class Punto4 {

    public static void main(String[] args) {

        int[] j = { 10, 20, 15, 8, 12 };
        int[] k = { 2, 3, 4, 1, 2 };
        int edadMayor1 = j[0];
        int edadMayor2 = k[0];

        for(int i = 0; i < j.length; i++){
            if (edadMayor1 <=j[i]) {
                edadMayor1 = j[i];
            }
            if (edadMayor2 <= k[i]) {
                edadMayor2 = k[i];
            }
        }

        String Mayor = edadMayor1>edadMayor2?"Edad mayor es:" + edadMayor1:"Edad mayor es:" + edadMayor2;
        System.out.println(Mayor);

    }
}
