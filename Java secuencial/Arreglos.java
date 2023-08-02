public class Arreglos {

        // Arreglos:
        // 1. Tamaño fijo.
        // 2. Solo puede contener elementos de un mismno tipo.
        // Puede alamacenar tipos de datos primitivos o 
        // referencias a objetos.

        // Conceptos base: 
        // Posicion/ indice
        // Los indicies en los arreglos comienzan con 0;

        // Declaracion de arreglos
        // int numeros[];
        // Persona personas[];

        // Definiendo el tamaño del arreglo:
        // numeros = new int[5]; OJO TAMBIEN SE PUEDE HACER EN LA MISMA LINEA.
        // int numeros[] = new int[5];
        
        //Formas diferentes de declara arreglos en java:
        // int a[] = new int[5], int b[] = int[5];
        // int numeros[] = new int[]{3, 64, -1, 2};

        // int a[] = new int[3];
        // a[0] = 19;
        // a[1] = 33;
        // a[2] = 79; 

        // //Obtener los valores
        // int x = a[0];
        // System.out.println(x);
        // System.out.println(a[1]);
    public static void main(String[] args) {

        // Declaracion del arreglo
        int numeros[] = new int[5];

        //Poblando el arreglo; 
        for (int i = 0; i<numeros.length; i++) numeros[i] = i+1;

        System.out.println("");

        //Mostrando los elementos del arreglo
        for (int numero: numeros) System.out.println(numero);
    
    }
}