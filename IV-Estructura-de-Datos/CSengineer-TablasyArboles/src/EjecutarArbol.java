public class EjecutarArbol {
    /**
     * Una de las utilidades más populares es para realizar búsquedas dependiendo de
     * posibles resultados llegando a la opción más viable o Serie de Fibronacci (recurcion),
     * como menos popular.
     */
    public static void main(String[] args){

        ArbolBinario arbolBinario = new ArbolBinario();
        arbolBinario.insert(4);
        arbolBinario.insert(2);
        arbolBinario.insert(5);
        arbolBinario.insert(8);
        arbolBinario.insert(10);
        arbolBinario.insert(3);
        arbolBinario.ver(arbolBinario.root);
        
    }
}
