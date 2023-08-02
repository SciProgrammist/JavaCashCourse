class Hola {

    public static void main(String ...args){
        //EJEMPLO 01
        byte primerNumero; 
        byte segundoNumero; 
        byte resultado; 
        primerNumero = 1; 
        segundoNumero = 1; 
        //Casting para que la computadora no tenga que inferir el tipo de dato del
        //resultado de la operacion.
        resultado = (byte)(primerNumero + segundoNumero);
        System.out.println(resultado);

        //EJEMPLO 02

        //Casting de primera forma:
        // float a = (float)10.5;
        // float b = (float)1.5;
        // float c = (float)a+b;

        //Casting de la segunda forma: 
        // float a = 10.5f;
        // float b = 1.0f; 
        // float c = a+b;
        int a = 5;
        int b = 2; 
        float c = (float)a/(float)b;
        System.out.println(c);


    }


}