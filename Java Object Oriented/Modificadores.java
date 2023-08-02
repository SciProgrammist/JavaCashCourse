class Modificadores{

    public static void main(String[] args) {
        /**
         *  public:  Puede ser accedido desde cualquier lugar.
         *  private: Puede ser accedido desde su propia clase.
         *  default: Puede ser accedido desde su clase, las clases que estan en el 
         *           mismo paquete y las clases que hereden en el mismno paquete.  
         *  protected: Puede ser accedido desde su clase, las clases que estan en el
         *             mismo paquete y desde las clases que hereden asi esten en otras clases.
         * 
         */

         /**
          *  Modificador - clase - paquete - Subclase (mismo paquete) - Subclase(Diferente paquete) - Mundo
          *  public           x       x                x                            x                   x
          *  private          x       o                o                            o                   o
          *  sin Modificador  x       x                x                            o                   o 
          *  protected        x       x                x                            x                   o 
          *
          */

          
    }
}