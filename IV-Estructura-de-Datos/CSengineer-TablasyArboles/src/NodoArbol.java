public class NodoArbol {
    int valor;
    NodoArbol hijoIzquierdo, hijoDerecha;

    public NodoArbol(int valor){
        this.valor = valor;
        hijoIzquierdo = hijoDerecha = null;

    }

    public int getValor() {
        return valor;
    }
}
