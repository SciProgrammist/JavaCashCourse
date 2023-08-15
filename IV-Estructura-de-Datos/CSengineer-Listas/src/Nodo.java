public class Nodo {
    int dato; // valor
    Nodo ref; // es una referencia y podria tener un get y un set

    public Nodo(int dato){
        this.dato = dato;
        this.ref = null;
        /**
         * por ahora valor nulo porque la primera vez no se va a acceder
         * a la referencia porque es el primer elemento de la lista.
         */
    }

    // Accediendo el dato
    public int getDato() {
        return this.dato;
    }

    // definiendo getters y setters de nodo
    public Nodo getRef(){
        return this.ref; // regresando a la referencia.
    }

    public void setRef(Nodo r){
        this.ref = r;
    }


}
