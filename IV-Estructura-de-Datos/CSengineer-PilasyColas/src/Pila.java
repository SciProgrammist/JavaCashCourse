import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;

public class Pila {
    /**
     * Se esta usando un arraylist para que funcione como un stack
     */

    private ArrayList<Object> pile = new ArrayList<>();
    // Metodos base para el funcionamiento de una pila son pop y push
    private void push(Object elemento){
        pile.add(elemento);
    }
    private Object pop(){
        if(!pile.isEmpty()){
           Object t = pile.get(pile.size()-1);
           pile.remove(pile.size()-1);
           return t;

        } else {
            return null;
        }
    }

    // Estos elementos extra son de utilidad
    private Object peek(){
        if(!pile.isEmpty()){
            return pile.get(pile.size()-1);
        }else{
            return null;
        }

    }

    private boolean empty(){
        return pile.isEmpty();
    }

    private int size(){
        return pile.size();
    }


    public static void mainPilas(){
        Pila pila = new Pila();
        pila.push("hola");
        pila.push(1);
        pila.push(5);
        pila.push("x");
        pila.pop();
        System.out.println(pila.peek());
        System.out.println(pila.size());
        System.out.println(pila.empty());


        //A stack follows the Last-In-First-Out (LIFO) principle.
        Deque<String> stack = new LinkedList<>();

        // Push elements onto the stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            String element = stack.pop();
            System.out.println("Popped: " + element);
        }

    }
}
