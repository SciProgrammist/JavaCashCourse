import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
   NodoCola primero, ultimo; //entrante, saliente.
   int tam;

   // Constructor de la cocacolaxD :v computerScientist >:v
   public Cola(){
       primero = ultimo = null;
       tam = 0;
   }

   public void insert(int valor){
       NodoCola nuevo = new NodoCola(valor);
       if(empty()) {
           primero = nuevo;
       } else {
           ultimo.siguiente = nuevo;
       }
       ultimo = nuevo;
       tam++;
   }
   public int delete(){
       int t = primero.valor;
       primero = primero.siguiente;
       tam--;
       return t;
   }

   public int size(){
       return tam;
   }

   public boolean empty(){
       return primero == null;
   }
    public static void mainCocaColaxD(){
       Cola cola = new Cola();
       cola.insert(1);
       cola.insert(2);
       cola.insert(3);
       cola.insert(4);


        System.out.println(cola.delete());
        System.out.println(cola.delete());
        System.out.println(cola.delete());

        // A queue follows the First-In-First-Out (FIFO) principle.
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Dequeue elements from the queue
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("Dequeued: " + element);
        }
    }

}
