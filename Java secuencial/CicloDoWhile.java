public class CicloDoWhile {
    public static void main(String[] args){

        // do while 
        // El codigo se ejecutara por lo menos una vez.

        int i = 1; 
        do {
            //Setencia
            System.out.println(i);
            i++;
        }while(i<=10); // Condiciones logicas.

        //NOTAS: PARA LAS PALABRAS RESERVADAS DE BREAK AND CONTINUE, 
        //tenemos que el break detiene por completo el ciclo
        //ahora continue sigue con la siguiente iteracion del loop 

        System.out.println();
        i = 0; 
        do {
            System.out.println(i);
            i++;
            if(i%2==0){
                System.out.println("Soy un numero par");  
                continue;
            } else {
                System.out.println("Soy un numero inpar");
            }
            


        } while (i<= 10);

    }
}