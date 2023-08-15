import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Definicion de lista
        List<String> lista = new ArrayList<String>();
        lista.add("Huevo");
        lista.add("Leche");
        lista.add("Jamon");

        // Para imprimir la lista
        System.out.println(lista);

        // Para imprimir el tamaño de la lista
        System.out.println(lista.size());

        // Para imprimir el primer valor
        System.out.println(lista.get(1));

        // Para remover
        lista.remove("jamon");


    }
}