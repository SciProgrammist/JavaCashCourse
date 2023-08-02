public class Principal {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona otrapersona = new Persona("Leidy Gonzales");
        Persona terceraPersona = new Persona("Pedro perez", 20);
        persona.setNombre("Alexys Lozada");
        persona.setEdad(12);

        System.out.println("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad() + "\nPeso: " + persona.getPeso() + "\nEstatura: " + persona.getEstatura());
        System.out.println("Nombre de otra persona: " + otrapersona.getNombre() + "\nEdad: " + otrapersona.getEdad() + "\nPeso: " + otrapersona.getPeso() + "\nEstatura: " + otrapersona.getEstatura());
        persona.saludar();
        otrapersona.saludar();
        terceraPersona.saludar();
        
    }
    
}
