class Condicionales {

    public static void main(String[] args) {

        //Condicionales se ejecutan con la palabra 
        // Reservada if (condiciones)
        int edad = 25; 
        if(edad >= 0 && edad < 18) {
            System.out.println("Estas en la niñez");
        } else if(edad >= 18 && edad < 65) {
            System.out.println("Estas en la adultex");
        } else if (edad>65) {
            System.out.println("Adulto");
        } else {
                System.out.println("Error en la captura de edad");
        }
        System.out.println("Proceso terminado");

        // Otra manera de hacer el mismo codigo pero usar operadores booleanos 
        // seria la siguiente: 

        if (edad > 0) {
            if (edad < 18) {
                System.out.println("Niño/Puberto");
            } else if (edad < 65) {
                System.out.println("Adulto");
            } else {
                System.out.println("Vejez");
            }
        } else {
            System.out.println("Edad errada");
        }
    }
}