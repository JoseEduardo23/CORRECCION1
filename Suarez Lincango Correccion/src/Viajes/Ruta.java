package Viajes;

public class Ruta extends Pasajero{
    String origen;
    String destino;
    double precio;

    public Ruta() {
    }

    public Ruta(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono, String origen, String destino, double precio) {
        super(codigoTicket, fechaTicket, nombre, cedula, edad, telefono);
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public void mostrarTicket() {
        System.out.println("Ticket: "+codigoTicket);
        System.out.println("Fecha: "+fechaTicket);
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+telefono);
        System.out.println("Origen: "+origen);
        System.out.println("Destino: "+destino);
        System.out.println("Precio: "+precio);
    }
}