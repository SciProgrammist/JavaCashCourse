
class AlgoritmoBurbuja {

    public static void main(String[] args) {

        // Declaracion del arreglo 
        int a[] = new int[10];

        // Poblado del arreglo con numeros aleatorios
        for(int i = 0; i<a.length; i++) {
            a[i] = (int)(Math.random()*99);
        }

        a[3] = 50;

        // Mostrar el asrreglo por consola}
        for(int v: a) {
            System.out.print( v + " ");
        }

        // Odernar po el metodo burbuja:
        // 1. Recorrer el arreglo tantas veces como elementos contenge menos uno.
        // 2. En cada recorrido comparo el elemento actual con el elemento 
        //    siguiente para saber si esta ordenados.
        /*
         *  original : 5, 6, 9, 1, 14, 12
         *  1.         5, 6, 1, 9, 12, 14
         *  2.         5, 1, 6, 9, 12, 14
         *  3.         1, 5, 6, 9, 12, 14
         *  4.         1, 5, 6, 9, 12, 14
         *  5.         1, 5, 6, 9, 12, 14
         * 
        */

        // Codigo método burbuja
        for(int recorrido = 0 ; recorrido<a.length -1; recorrido++) {
            for (int elemento = 0; elemento< a.length-1;elemento++) {
                if(a[elemento]> a[elemento+1]){
                    int t = a[elemento];
                    a[elemento] = a[elemento+1];
                    a[elemento+1] = t;
                }
            }
        }

        System.out.println();

        // Mostramos el arreglo por consola
        for(int v: a){
            System.out.print(v +" ");
        }

        //Busqueda lineal
        System.out.println();
        int x = 50;
        for(int i = 0; i<a.length; i++) {
            if(a[i] == x) {
                System.out.println("el numero: " + x + "está en el índice: " + i);
                break;
            }
        }
    }
    
}
