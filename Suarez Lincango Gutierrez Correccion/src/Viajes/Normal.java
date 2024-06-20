package Viajes;

public class Normal extends Servicio{

    double precioFinal;

    public Normal(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono, String origen, String destino, double precio, String asiento, boolean maleta, boolean maletaextra) {
        super(codigoTicket, fechaTicket, nombre, cedula, edad, telefono, origen, destino, precio, asiento, maleta, maletaextra);
    }

    public Normal(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono, String origen, String destino, double precio, String asiento, boolean maleta, boolean maletaextra, double precioFinal) {
        super(codigoTicket, fechaTicket, nombre, cedula, edad, telefono, origen, destino, precio, asiento, maleta, maletaextra);
        this.precioFinal = precioFinal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
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
        System.out.println("Asiento: "+asiento);
        System.out.println("Maleta: "+maleta);
        System.out.println("Maletaextra: "+maletaextra);
    }
}
