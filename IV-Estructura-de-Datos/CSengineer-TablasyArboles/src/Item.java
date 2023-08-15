// Item.java
public class Item {
    private String name;
    private int value;

    // constructor
    public Item(String name, int value){
        this.name = name;
        this.value = value;
    }

    // getters y setters
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int v){
        this.value = v;
    }

    /**
     *  POJO (Plain Old Java Object)
     *  definicion de un objeto que solamente tiene atributos,
     *  tiene su constructor, y tiene en este caso los setters y getters
     *  de los elementos.
     *
     */
    public String toString(){
        return "name: " + name +" value: " + value;
    }

}
