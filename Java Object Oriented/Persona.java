
public class Persona {
    // Atributos 
    private String nombre;
    private int edad;
    private float peso; 
    private float estatura; 

    // Constructores
    public Persona(){
        // Sirve para inicializar los valores por defecto 
        // de un objeto instanciado
        this.nombre = "";
        this.edad = 0; 
        this.peso = 10f;
        this.estatura = 10f;
    }

    // Segundo constructor
    // Sobrecarga: escribir un metodo con el mismo nombre;
    // Pero con diferete firma.
    public Persona(String n) {
        this.nombre = n; 
    }

    public Persona(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }



    // Las palabras reservadas como private, public, protected son usadas 
    // para encapsular los elementos que conforman la clase.

    // Getter y Setter
    // Get obtener valores 
    // Set asignar valores


    // Métodos set y get para nombre 
    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre; 
    }

    // Metodos set y get para edad 

    public void setEdad(int e) {
        //Aqui vamos a hacer la validacion 
        if(e<0 || e>150) {
            System.out.println("La edad no es valida");
        } else {
            this.edad = e;
        }
    }

    public int getEdad(){
        return this.edad;
    }

    // gets xd
    public float getPeso() {
        return this.peso;
    }

    public float getEstatura(){
        return this.estatura;
    }

    void saludar(){
        System.out.println("hola, mi nombre es: " + this.nombre);
    }

    
}
