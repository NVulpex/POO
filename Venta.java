
package tpgit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ET36
 */
public class Venta extends Producto{
    //Creamos el array
        public ArrayList<Producto> listProd = new ArrayList();
        private int nroFact;
        private static int cantVentas;
        private LocalDate fecha;
        private Cliente cli;
        
        //Getters & Setter

    public ArrayList<Producto> getListProd() {
        return listProd;
    }

    public void setListProd(ArrayList<Producto> listProd) {
        this.listProd = listProd;
    }

    public int getNroFact() {
        return nroFact;
    }

    public void setNroFact(int nroFact) {
        this.nroFact = nroFact;
    }

    public static int getCantVentas() {
        return cantVentas;
    }

    public static void setCantVentas(int cantVentas) {
        Venta.cantVentas = cantVentas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    //Metodo constructor
    public Venta(LocalDate f, Cliente c) {
        this.fecha = f;
        this.cli = c;
      
    }
    
    public double calcularTotal(){
        double precioTotal = 500; //Envio
        for(Producto p:listProd){
            precioTotal+= p.precioFinal();
        }
        return precioTotal;
    }
    
    public void emitirFact(){
        Scanner linea = new Scanner(System.in);
        System.out.println("Introduzca su forma de pago: ");
        String metodoP= linea.next();
        for (Producto listProd:this.listProd) {
            System.out.println("Nro de fact: "+this.nroFact);
            this.nroFact +=1;
            
        }
        
    }        
}
