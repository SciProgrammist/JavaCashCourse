// ListaEnlazada.java
public class ListaEnlazada {
    protected Nodo primero; // método para el primero

    // constructor para crear la lista
    public ListaEnlazada(){
        primero = null;
    }

    public ListaEnlazada agregarI(int dato){ // agregar el primero teniendo el dato, al inicio
        Nodo nuevo;
        nuevo = new Nodo(dato); // se crea el nodo
        nuevo.ref = primero; // se crea la referencia que será igual a primero
        primero = nuevo; // el nodo que se tiene al principio será igual al nuevo
        return this; // lo que se regresa es el mismo
    }

    // habilitando el método agregar permitiendo al método main acceder a él
    public void agregar(int d){
        Nodo nodof = new Nodo(d); // creando el último nodo
        nodof.ref = null; // el último nodo apunta a al elemento nulo

        if(primero == null){
            primero = nodof;
            return;
        }

        // elemento temporal
        Nodo tmp;
        for(tmp = primero; tmp.getRef() != null; tmp = tmp.getRef()){
            tmp.setRef(nodof);
        }
    }
    public void eliminar(){
    }
    public void buscar(){
    }

    public  void ver(){
        Nodo nodo; // se define Nodo como nodo
        nodo = primero; // siempre debe tener un primero
        while(nodo!=null){
            System.out.println(nodo.dato); // si solo utilizas nodo se verá parte de la memoria, la refrencia
            nodo = nodo.ref; // la referencia que sigue
        }
    }
    // creando lista
    public static void main(String[] args){
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarI(1); // se agrega el primer número.
        lista.ver(); //
        lista.agregar(2);
        lista.agregar(3);
    }
}