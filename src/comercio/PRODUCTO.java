
package comercio;


public class PRODUCTO {
    int cod;
    String desc;
    double precio;

    public PRODUCTO(int cod, String desc, double precio) {
        this.cod = cod;
        this.desc = desc;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return null;
    }
  
    public double calcularTotal(){
        return 0;

    }
}
