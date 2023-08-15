import java.util.Vector;

public class Vectores {

    public static void mainVector(){
        /**
         *  Vectores, una ventaja puese der la mayoria de metodos que se han programado para esta clase,
         *  lo que se destaco en la catedra fue la direfencia con el array, y la capacidad de sincronasacion que posee.
         *  Este tipo de arreglo se puede comparar con el Arraylist.
         */

        Vector vectorConParametros = new Vector(30, 8 );
        Vector vectorSinParemetros = new Vector(); // Un tamaño inicial sin especificar es 10 y los incrementos son del 100%.

        // Metodo para añadir valores
        vectorConParametros.add("Jose");
        vectorConParametros.add("Lujan"); // Con el metodo add se agrega al ultimo elemento poblado.
        vectorConParametros.add("Castillo");
        vectorConParametros.insertElementAt("Hola mundo", 0); // Aqui se va a insertar en la posicion de "Jose".
        vectorConParametros.removeElementAt(2); // Se va eliminar en la posicion de "Castillo".
        




    }
}
