public class Main{

    public static void main(String[] args){
        // Variable primitiva de valor entero
        int numero = 0;
        /**
         * Conjunto de datos del mismo tipo, y las direcciones en memoria sean contiguas
         * los cuales se ubican mediante un index:
         *
         * -Poner nombres en plural o que el nombre indique pliralidad.
         *
         */

        int arreglo[]; //Arreglo definido
        int numeros[] = new int[30]; //Arreglo inicializado.
        /**
         *  otra manera de inicializar arrays podria ser:
         *  int numeros[] = {1, 2, 3, 4, 5};
         *  String nombres[] = {"Jose", "Miguel", "Pedro"};
         *  String meses[] = {"Enero","Febrero","etc..."}
         *
         */
        String[] asd = new String[]{"hola"};
        String asddsa[] = new String[4];
        numeros[1] = 100;

        utilizarArreglo(numeros);

       // for(int i = 0; i<numeros.length; i++){System.out.println(numeros[i]);}

        /**
         * Las clases son los diferentes conceptos que se vieron en el modulo de arreglos.
         */
        //System.out.println( "El numero a ser mostrado tiene el valor: " + numeros[1] + " en su posicion 1.");
        //Matrices.mainMatrinces();
        //Cubos.cubos();
        Vectores.mainVector();



    }

    public static void utilizarArreglo(int[] numeros){
        numeros[5] = 1;

    }
}