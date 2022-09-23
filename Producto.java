
package tpgit;

public abstract class Producto {
    public int codigo;
    public String descripcion;
    public double precio;

    public Producto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto n°" + codigo + ", con un precio de: " + precio + "," + descripcion;
    }
    
    public abstract double calcularTotal();
}
