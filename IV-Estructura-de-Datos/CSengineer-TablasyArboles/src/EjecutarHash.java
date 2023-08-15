import java.util.Enumeration;
import java.util.Hashtable;

public class EjecutarHash {
    public static void main(String[] args){
        // Creacion de objetos
        Item item1 = new Item("Jose", 20);
        Item item2 = new Item("Maria", 10);
        Item item3 = new Item("Miguel", 40);

        // Una tabla de dispercion.
        Hashtable<String,Item> hashtable = new Hashtable<String, Item>();
        // Agregando los valores a la hashtable
        hashtable.put(item1.getName(), item1);
        hashtable.put(item2.getName(), item2); // Identificador y objeto para saber como llamar
        hashtable.put("z", item3); // Identificador arbitrario.
        String temporal;
        Enumeration<String> keys = hashtable.keys(); // Enumeracion es una clase que nos permite organizar las llaves.
        while(keys.hasMoreElements()){
            temporal = keys.nextElement();
            System.out.println(hashtable.get(temporal));
        }
    }
}
