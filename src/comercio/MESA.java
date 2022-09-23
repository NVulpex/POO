
package comercio;

public class MESA extends PRODUCTO {
    private int tamaño;
    private boolean barnizado;
    private String material;

    public MESA(int tamaño, String color, String material, int cod, String desc, double precio) {
        super(cod, desc, precio);
        this.tamaño = tamaño;
        this.barnizado = barnizado;
        this.material = material;
    }
        
    public double calcularTotal(){
        double precio = 1000;
        double barnizado = 500;
        if(this.material== "madera" && this.barnizado == true){
            precio = (precio * 2) + barnizado;
        }else if (this.material== "madera" && this.barnizado == false) {
            precio = (precio * 2);
        }else if (this.material=="acero") {
            precio = precio * 3; 
        }else if(this.material == "marmol"){
            precio = precio * 4;
        }
        return precio;
    }
    
}
