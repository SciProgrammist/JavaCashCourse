public class Cubos {

    public static void cubos(){
        int x=3; int y=3; int z=3;
        String[][][] cubo = new String[x][y][z];

        // Para llenar los valores de un cubo se utilizan ciclos for.
        for(int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo.length; j++){
                for(int k = 0; k < cubo.length; k++){

                    cubo[i][j][k] = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                }
            }
        }

        // Para mandar a imprimir los valores se mandan a imprimer los indices que se pasaron como valores.
        for(int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo.length; j++){
                for(int k = 0; k < cubo.length; k++){

                    System.out.println(cubo[i][j][k]);
                }
            }
        }


    }
}
