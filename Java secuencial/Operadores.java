class Operadores{
    public static void main(String[] args){

        // Asignacion  = 
        // int a = 2; 
        // int b; 
        // b = 2+2+3;
        // System.out.println(b);

        //Preincremento vs Postincremento 
        int a =  3; 
        int b = 2; 
        // Comenzamos con preincremento
        // int c = a * ++b; 
        // Línea 14
        // a = 3; b = 3; c = 9;

        // Ahora el postincremento
        int c = a * b++; 
        // Línea 10 
        // a = 3; b = 3; c = 6;
        // Con b primero multiplica y luego aumenta. 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Nota tratar de nunca colar operadores de incremento en 
        // asignaciones de las cuales podrian dar resultados no esperados. 

         // Operadores aritmeticos
        // + - * /
        // Jerarquía:
        // Operador . (POO), operador ()
        // Primero * / (con prioridad de izquierda a derecha)
        // Segundo + - (con prioridad de izquierda a derecha)

        //int o = 3 + 3*3 -3;
        // 3/3*3= 1
        //System.out.println(o);

        // Operadores logicos: Tabla de verdad
        // Y O ; true or

        // Tabla de verdad de Y: 
        // A          B       Resultado
        // true     true        true 
        // true     false       false
        // false    true        false
        // false    false       false

        int edad = 15; 
        boolean ninez = edad <= 11 && edad >= 0; 
        System.out.println(ninez);

           // Tabla de verdad de O: 
        // A          B       Resultado
        // true     true        true 
        // true     false       true
        // false    true        true
        // false    false       false
    }
}