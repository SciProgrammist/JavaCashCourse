public class CondicionalesDos {
    public static void main(String[] args){
        int dia = 1;

        switch (dia) {
            case 1:
            System.out.println("lunes");
            break;
            case 2:
            System.out.println("Martes");
            break;
            case 3: 
            System.out.println("Miercoles");
            break;
            case 4: 
            System.out.println("Jueves");
            break;
            default:
            System.out.println("Eliga un numero valido para los dias de la semana.");
            break;

        }
    }
}
