public class Matrices {

    public static void mainMatrinces(){
        int x = 4; int y = 4;
        int[][] numeros; // Una matriz es un array de dos dimenciones.
        numeros = new int[x][y];
        int[][] valores = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for(int i = 0; i < valores.length; i++){
            for(int j = 0; j< valores.length; j++){
                System.out.println("Valor en la posicion ["+i+"]["+j+"]"+": " + valores[i][j]);
            }
        }
    }
}
