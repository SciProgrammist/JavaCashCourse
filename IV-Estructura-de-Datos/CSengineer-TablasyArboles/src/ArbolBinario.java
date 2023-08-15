public class ArbolBinario {
    NodoArbol root;

    public ArbolBinario(){
        root = null;
    }

    /**
     * Para utilizar el método 'insert' es necesario pasarle un valor para incorporarlo.
     * Recuerda que es un árbol, por ende es posible incorporarlo a la izquierda o a la derecha.
     * Se define un nuevo nodo como instancia con el valor pasado como parámetro.
     * Existen casos para insertar, cuando es el root y para todos los demás.
     *
     */
    public void insert(int v){
        NodoArbol nuevo = new NodoArbol(v);
        if(root == null){
            root = nuevo;
        } else {
            NodoArbol temporal = root;
            NodoArbol padre;
            while(true){
                padre = temporal;
                // Si el valor es menor va a la izquierda.
                if(v < temporal.valor){
                    temporal = temporal.hijoIzquierdo;
                    if(temporal == null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else { // Si el valor es mayor va a la derecha.
                    temporal = temporal.hijoDerecha;
                    if(temporal == null) {
                        padre.hijoDerecha = nuevo;
                        return;
                    }
                }
            }
        }

    }
    public void ver(NodoArbol nodo){
        if(nodo != null){
            ver(nodo.hijoIzquierdo);
            System.out.println(nodo.valor);
            ver(nodo.hijoDerecha);
        }

    }
    public boolean vacio(){
        return (root == null);
    }
}
